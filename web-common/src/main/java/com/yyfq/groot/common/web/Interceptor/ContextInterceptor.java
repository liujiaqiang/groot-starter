package com.yyfq.groot.common.web.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;

import com.yyfq.groot.common.web.Controller;
import com.yyfq.groot.common.web.context.ContextHolder;
import com.yyfq.groot.common.web.context.WebContextHolder;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by junqing.li on 17/4/18.
 *
 * 上下文拦截器
 */
@Slf4j
public class ContextInterceptor extends AbstractHandlerInterceptor {


  @Override
  public boolean postHandle0(HttpServletRequest request, HttpServletResponse response,
      HandlerMethod handler) {
    setLocalController(handler);

    return true;
  }

  private void setLocalController(HandlerMethod handler) {
    boolean isTsmsController = Controller.class.isAssignableFrom(handler.getBeanType());
    WebContextHolder.setContextHolder(new ContextHolder(isTsmsController));
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) throws Exception {

    WebContextHolder.resetContextHolder();
  }
}
