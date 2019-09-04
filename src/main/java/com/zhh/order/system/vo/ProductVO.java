package com.zhh.order.system.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhh
 * @description 商品VO
 * @date 2019-09-05 00:48
 */
@Data
public class ProductVO {

    /**
     * 类目名称
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 类目编号
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 商品详情列表
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
