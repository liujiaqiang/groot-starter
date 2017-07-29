package com.groot.io.common.api.exception;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * 应用通用异常
 *
 * @author: junqing.li
 * @date: 17/7/18
 */
@Getter
@Setter
public class GrootBizException extends RuntimeException {

  /** 异常信息 */
  private String msg;

  /** 异常code码 **/
  private String code;

  public GrootBizException(String msg, String code) {
    super(msg);
    this.code = code;
    this.msg = msg;
  }
}
