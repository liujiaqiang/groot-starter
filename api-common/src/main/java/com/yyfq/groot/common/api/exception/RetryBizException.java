package com.yyfq.groot.common.api.exception;

/**
 *
 * 重试异常
 *
 * @author: junqing.li@mljr.com
 * @date: 17/7/18
 */
public class RetryBizException extends GrootBizException {

  public RetryBizException(String msg, String code) {
    super(msg, code);
  }
}
