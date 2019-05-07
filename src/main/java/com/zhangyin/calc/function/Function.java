package com.zhangyin.calc.function;

import java.math.BigDecimal;

/**
 * @author zhangyin
 * @create 2019-05-07 12:04
 **/
public interface Function {

    String getName();
    int getNumArguments();
    BigDecimal invoke(BigDecimal... bigDecimals);

}
