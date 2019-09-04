package com.zhh.order.system.controller;

import com.zhh.order.system.dataobject.ProductCategory;
import com.zhh.order.system.dataobject.ProductInfo;
import com.zhh.order.system.service.ProductCategoryService;
import com.zhh.order.system.service.ProductInfoService;
import com.zhh.order.system.util.ResultVOUtil;
import com.zhh.order.system.vo.ProductInfoVO;
import com.zhh.order.system.vo.ProductVO;
import com.zhh.order.system.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhh
 * @description 买家商品
 * @date 2019-09-05 00:43
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 买家端商品列表展示
     *
     * @return
     */
    @GetMapping("/list")
    public ResultVO list() {
        // 查询所有上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        // 查询类目
        List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(
                Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        // 返回数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);

                    productInfoVOList.add(productInfoVO);
                }
            }

            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
