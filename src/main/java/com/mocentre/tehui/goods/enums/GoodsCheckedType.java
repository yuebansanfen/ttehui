/*
 * Copyright 2016 mocentre.com All right reserved. This software is the
 * confidential and proprietary information of mocentre.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with mocentre.com .
 */
package com.mocentre.tehui.goods.enums;

/**
 * 类GoodsCheckedType.java的实现描述：商品审核状态
 * 
 * @author sz.gong 2016年12月19日 上午11:19:04
 */
public enum GoodsCheckedType {

    UNCHECK("unCheck", "未审核"),
    CHECKPASS("checkPass", "审核通过"),
    CHECKFAIL("checkFail", "审核驳回");

    private String code;
    private String name;

    private GoodsCheckedType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCodeValue() {
        return this.code;
    }

    public String getNameValue() {
        return this.name;
    }

    public static String getName(String code) {
        for (GoodsCheckedType type : GoodsCheckedType.values()) {
            if (type.code.equals(code)) {
                return type.name;
            }
        }
        return null;
    }

}
