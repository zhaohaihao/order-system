package com.zhh.order.system.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author zhh
 * @description 类目
 * @date 2019-09-04 23:18
 */
@Entity
@Data
public class ProductCategory {

    /**
     * 类目ID
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;
}
