package com.zhh.order.system.repository;

import com.zhh.order.system.OrderSystemApplicationTest;
import com.zhh.order.system.dataobject.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhh
 * @description
 * @date 2019-09-04 23:25
 */
public class ProductCategoryRepositoryTest extends OrderSystemApplicationTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("热销榜");
        productCategory.setCategoryType(1);
        repository.save(productCategory);
    }
}