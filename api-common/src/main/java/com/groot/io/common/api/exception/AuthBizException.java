package com.groot.io.common.api.exception;

/**
 *
 * 验证异常
 *
 * @author: junqing.li
 * @date: 17/7/18
 */
public class AuthBizException extends GrootBizException {

  public AuthBizException(String msg, String code) {
    super(msg, code);
  }
}
