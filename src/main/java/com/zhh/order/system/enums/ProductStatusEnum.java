package com.zhh.order.system.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhh
 * @description 商品状态枚举
 * @date 2019-09-05 00:19
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {

    UP(0, "在架"),

    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;
}
