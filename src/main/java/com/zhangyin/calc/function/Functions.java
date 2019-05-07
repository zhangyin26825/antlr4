package com.zhangyin.calc.function;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyin
 * @create 2019-05-07 15:07
 **/
public class Functions {

    public static Map<String,Function> functionMap=null;

    public static Map<String, Function> getFunctionMap() {
        if (functionMap == null) {
            functionMap=new HashMap<>();
            for (Function function : functions) {
                functionMap.put(function.getName(),function);
            }
        }
        return functionMap;
    }
    private static Function [] functions=new Function[]{
            new Function() {
                @Override
                public String getName() {
                    return "abs";
                }
                @Override
                public int getNumArguments() {
                    return 1;
                }
                @Override
                public BigDecimal invoke(BigDecimal... bigDecimals) {
                    return bigDecimals[0].abs();
                }
            },
           new Function() {
               @Override
               public String getName() {
                   return "pow";
               }

               @Override
               public int getNumArguments() {
                   return 2;
               }
               @Override
               public BigDecimal invoke(BigDecimal... bigDecimals) {
                   return bigDecimals[0].pow(bigDecimals[1].intValue());
               }
           },
           new Function() {
               @Override
               public String getName() {
                   return "negate";
               }

               @Override
               public int getNumArguments() {
                   return 1;
               }

               @Override
               public BigDecimal invoke(BigDecimal... bigDecimals) {
                   return bigDecimals[0].negate();
               }
           },
           new Function() {
               @Override
               public String getName() {
                   return "min";
               }

               @Override
               public int getNumArguments() {
                   return 2;
               }

               @Override
               public BigDecimal invoke(BigDecimal... bigDecimals) {
                   return bigDecimals[0].min(bigDecimals[1]);
               }
           },
           new Function() {
               @Override
               public String getName() {
                   return "max";
               }

               @Override
               public int getNumArguments() {
                   return 2;
               }

               @Override
               public BigDecimal invoke(BigDecimal... bigDecimals) {
                   return bigDecimals[0].max(bigDecimals[1]);
               }
           }

    };
}
