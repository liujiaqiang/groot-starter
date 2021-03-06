# groot commmon 包

## aip相关common
* 定义通用返回异常
* 定义通用page
* 定义通用异常处理


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
            "app": "testapp", 
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

## start user swagger ui
* in dev test start swagger in application.yml

```

spring:
    swagger:
       enable: true
       info:
         basePackage: com.io.groot.gateway.web
         title: 网关API
         contact: junqing.li
         termsOfServiceUrl: http://xxx.api.com
         description: 网关提供入口
         version: 1.0

```

## 添加日志debug功能

```
spring:
    web:
      debug: true
      
```


## 分页使用

* 配置

```

# 分页插件
pagehelper:
  helperDialect: mysql
  reasonable: true
  rowboundsWithCount: true
  ÓoffsetAsPageNum: true
  supportMethodsArguments: false

```

* 例子

```
@Override
  public Page<RoleDto> getListByParam(RoleParam roleParam, Pagination pagination) {

    PageStart.now(pagination);
    List<Role> list = roleMapper.getListByParam(roleParam);

    return IamGroot.page(list, RoleDto.class, role -> mapForList(role));
  }

```

