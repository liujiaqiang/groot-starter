package com.groot.io.common.api.exception;

/**
 *
 * 参数异常 建议使用 java内置的
 *
 * @author: junqing.li
 * @date: 17/7/18
 */
public class ArgumentBizException extends GrootBizException {

  public ArgumentBizException(String msg, String code) {
    super(msg, code);
  }
}

