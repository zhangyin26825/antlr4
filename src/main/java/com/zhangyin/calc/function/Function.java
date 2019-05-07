package com.zhangyin.calc.function;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangyin
 * @create 2019-05-07 12:04
 **/
public abstract class Function {

    private String name;

    private int numArguments;

    public Function(String name, int paramList) {
        this.name = name;
        this.numArguments = paramList;
    }

    public abstract BigDecimal invoke(List<BigDecimal> params);



}
