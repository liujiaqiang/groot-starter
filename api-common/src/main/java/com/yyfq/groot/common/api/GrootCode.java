package com.yyfq.groot.common.api;

/**
 *
 * 错误码标记
 *
 * @author: junqing.li@mljr.com
 * @date: 17/7/18
 */
public abstract class GrootCode {

  /** 成功 */
  public static final String SUCCESS = "G_0000";

  /** 验证失败 */
  public static final String AUTH_ERROR = "G_0007";

  /** 参数失败 */
  public static final String ARGUMENT_ERROR = "G_0008";

  /** sql异常 */
  public static final String SQL_ERROR = "G_0009";

  /** 内部dubbo服务调用异常 */
  public static final String DUBBO_ERROR = "G_8888";

  /** HTTP服务调用异常 */
  public static final String HTTP_ERROR = "G_8889";

  /** 系统异常 */
  public static final String SYS_ERROR = "G_9999";


}
