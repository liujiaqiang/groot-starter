package com.yyfq.groot.common.api;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by junqing.li on 17/4/14
 *
 * rpc和http通用返回对象
 */
@Data
public class GrootResult<T> implements Serializable {

  private static final long serialVersionUID = -1339496790543320624L;

  /** code码 */
  private String code;

  /** 对于返回信息 */
  private String msg;

  private T result;

  private GrootResult() {

  }

  /**
   * 判断是否成功
   * 
   * @return
   */
  public boolean isSuccess() {

    return this.code.equals(GrootCode.SUCCESS);
  }

  /**
   * 成功方法
   *
   * @param data
   * @param
   * @return
   */
  public static GrootResult success(Object data) {
    GrootResult result = new GrootResult();
    result.setCode(GrootCode.SUCCESS);
    result.setResult(data);
    result.setMsg("SUCCESS");
    return result;
  }

  /**
   * 成功方法
   *
   * @param
   * @return
   */
  public static GrootResult success() {

    GrootResult result = new GrootResult();
    result.setCode(GrootCode.SUCCESS);
    result.setMsg("SUCCESS");
    return result;
  }


  public static GrootResult fail(int code, String msg) {

    GrootResult result = new GrootResult();
    result.setCode(GrootCode.SUCCESS);
    result.setMsg(msg);
    return result;
  }

}
