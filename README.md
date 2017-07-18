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

