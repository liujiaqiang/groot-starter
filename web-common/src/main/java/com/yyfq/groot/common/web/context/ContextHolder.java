package com.yyfq.groot.common.web.context;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * 上下文变量
 *
 * @author: junqing.li@mljr.com
 * @date: 17/5/6
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContextHolder {

  /** 是否是本地Controller */
  private boolean isLocalController;

}
