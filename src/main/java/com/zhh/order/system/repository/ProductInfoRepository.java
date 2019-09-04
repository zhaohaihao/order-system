package com.zhh.order.system.repository;

import com.zhh.order.system.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhh
 * @description 商品Repository
 * @date 2019-09-05 00:05
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据商品状态查询商品集
     *
     * @param productStatus 商品状态
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
