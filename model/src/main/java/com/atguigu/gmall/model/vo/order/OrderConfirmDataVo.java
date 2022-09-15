package com.atguigu.gmall.model.vo.order;

import com.atguigu.gmall.model.cart.CartInfo;
import com.atguigu.gmall.model.user.UserAddress;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: 李耀华
 * @date: 2022/9/13 20:48
 */
@Data
public class OrderConfirmDataVo {

    private List<CartInfoVo> detailArrayList;
    private Integer totalNum;
    private BigDecimal totalAmount;
    private List<UserAddress> userAddressList;
    private String tradeNo;
}
