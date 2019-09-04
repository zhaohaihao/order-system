package com.zhh.order.system.repository;

import com.zhh.order.system.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhh
 * @description 类目Repository
 * @date 2019-09-04 23:23
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据类目编号集合查询类目集合
     *
     * @param categoryTypeList 类目编号集合
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
