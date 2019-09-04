package com.zhh.order.system.service;

import com.zhh.order.system.dataobject.ProductCategory;

import java.util.List;

/**
 * @author zhh
 * @description 类目Service
 * @date 2019-09-04 23:45
 */
public interface ProductCategoryService {

    /**
     * 根据类目ID查找类目
     *
     * @param categoryId 类目ID
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找所有类目
     *
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 根据类目编号集合查询类目集合
     *
     * @param categoryTypeList 类目编号集合
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增类目
     *
     * @param productCategory 类目
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
