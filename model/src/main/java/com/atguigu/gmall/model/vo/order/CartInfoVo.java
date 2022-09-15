package com.atguigu.gmall.model.vo.order;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: 李耀华
 * @date: 2022/9/14 18:28
 */
@Data
public class CartInfoVo {
    private Long skuId;
    private String imgUrl;
    private String skuName;
    private BigDecimal orderPrice;
    private Integer skuNum;
    private String hasStock = "1";
}
