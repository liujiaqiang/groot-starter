package com.yyfq.groot.common.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author: junqing.li@mljr.com
 * @date: 17/7/18
 */
@Data
@ConfigurationProperties("spring.swagger.info")
public class SwaggerApiInfo {

  private String basePackage;

  private String title;

  private String description;

  private String termsOfServiceUrl;

  private String contact;

  private String version;

}
