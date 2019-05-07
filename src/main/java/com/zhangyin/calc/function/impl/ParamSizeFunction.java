package com.zhangyin.calc.function.impl;

import com.zhangyin.calc.function.Function;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangyin
 * @create 2019-05-07 12:08
 **/
public class ParamSizeFunction extends Function {

    public ParamSizeFunction() {
        super("test", 3);
    }

    @Override
    public BigDecimal invoke(List<BigDecimal> params) {
        return new BigDecimal(params.size());
    }
}
