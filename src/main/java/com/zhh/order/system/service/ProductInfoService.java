package com.zhh.order.system.service;

import com.zhh.order.system.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author zhh
 * @description 商品Service
 * @date 2019-09-05 00:09
 */
public interface ProductInfoService {

    /**
     * 根据商品ID查找商品
     *
     * @param productId 商品ID
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 查找所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询所有商品列表
     *
     * @param pageable 分页条件
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 新增商品
     *
     * @param productInfo 商品
     * @return
     */
    ProductInfo save(ProductInfo productInfo);
}
