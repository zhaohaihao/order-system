package com.zhh.order.system.repository;

import com.zhh.order.system.OrderSystemApplicationTest;
import com.zhh.order.system.dataobject.ProductInfo;
import com.zhh.order.system.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhh
 * @description
 * @date 2019-09-05 00:32
 */
public class ProductInfoRepositoryTest extends OrderSystemApplicationTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(2.2));
        productInfo.setProductStock(50);
        productInfo.setProductDescription("好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatusTest() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertNotEquals(0, productInfoList.size());
    }
}