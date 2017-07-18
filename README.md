# groot commmon 包

## aip相关common
* 定义通用返回异常
* 定义通用page
* 定义通用异常
* 定义通用异常


## web相关common
* 定义controller处理模式
* 定义通用异常处理模式
* 


## 使用
* api-commmon：单独使用
* web-commmon: 基于spring-boot-web

```
/**
 *  需要继承下 AbstractMvcConfig
 */
@Configuration
public class WebConfig extends AbstractMvcConfig {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    super.addResourceHandlers(registry);
  }
}
```

* 使用之后统一了返回模型

* 在controller层返回 必须实现 提供的Controller 接口

```
@RestController
@RequestMapping("/sys")
public class GrayController implements Controller {

  @Autowired
  private GrayService grayService;

  @GetMapping("/getServerInfo")
  public List<GrayConfig> getServerInfo() {
    return grayService.getAllConfig();
  }
```

* 返回结果自动包装

```
{
    "code": "G_0000", 
    "msg": "SUCCESS", 
    "result": [
        {
            "app": "tsms", 
            "graying": true, 
            "serverIdList": [
                "localhost:8080", 
                "localhost:8585"
            ], 
            "toServerId": "localhost:8585", 
            "userList": null
        }
    ], 
    "success": true
}

```

