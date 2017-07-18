package com.yyfq.groot.common.web.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.yyfq.groot.common.web.JsonUtils;
import com.yyfq.groot.common.web.Interceptor.ContextInterceptor;
import com.yyfq.groot.common.web.handler.ResultHttpMessageConverter;


/**
 * Created by junqing.li on 17/4/18.
 */
@Import(SwaggerConfig.class)
public abstract class AbstractMvcConfig extends WebMvcConfigurerAdapter {

  @Bean
  public ResultHttpMessageConverter resultHttpMessageConverter() {
    ResultHttpMessageConverter converter = new ResultHttpMessageConverter();
    converter.setFastJsonConfig(JsonUtils.fastJsonConfig());
    return converter;
  }


  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    registry.addInterceptor(new ContextInterceptor());
  }

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    converters.add(resultHttpMessageConverter());
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }



  @Override
  public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {

  }

  /**
   * 跨域支持 fuck 没用
   * 
   * @param registry
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {

    registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("*");
  }
}
