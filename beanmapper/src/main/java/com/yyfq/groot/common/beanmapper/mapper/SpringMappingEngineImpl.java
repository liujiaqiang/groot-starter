package com.yyfq.groot.common.beanmapper.mapper;

import org.springframework.beans.BeanUtils;

/**
 * Created by junqing.li on 17/3/1.
 */
public class SpringMappingEngineImpl extends AbstractMappingEngine {

  @Override
  protected <T, S> T mapInternal(S source, T target) {

    BeanUtils.copyProperties(source, target);

    return target;
  }
}
