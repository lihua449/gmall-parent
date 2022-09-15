package com.atguigu.gmall.order.biz;

import com.atguigu.gmall.model.vo.order.OrderConfirmDataVo;
import com.atguigu.gmall.model.vo.order.OrderSubmitVo;

/**
 * @author: 李耀华
 * @date: 2022/9/13 21:29
 */
public interface OrderBizService {
    OrderConfirmDataVo getConfirmData();

    /**
     * 订单流水号
     * 1.追踪整个订单
     * 2.作为防重令牌
     * @return
     */
    String generateTradeNo();

    /**
     * 校验令牌
     */
    boolean checkTradeNo(String tradeNo);

    /**
     * 提交订单
     * @param submitVo
     * @return
     */
    Long submitOrder(OrderSubmitVo submitVo, String tradeNo);

    /**
     * 关闭订单
     * @param orderId
     * @param userId
     */
    void closeOrder(Long orderId, Long userId);
}
