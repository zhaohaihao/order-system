package com.zhh.order.system.vo;

import lombok.Data;

/**
 * @author zhh
 * @description 返回结果VO
 * @date 2019-09-05 00:46
 */
@Data
public class ResultVO<T> {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
