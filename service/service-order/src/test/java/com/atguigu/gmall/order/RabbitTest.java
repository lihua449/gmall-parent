package com.atguigu.gmall.order;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: 李耀华
 * @date: 2022/9/15 11:42
 */

@SpringBootTest
public class RabbitTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void testSend(){
//        rabbitTemplate.setConfirmCallback((CorrelationData correlationData,
//                                           boolean ack,
//                                           String cause) -> {
//            if (ack){
//                System.out.println("MQ交换机收到了消息");
//            }else{
//                System.out.println("MQ接收消息失败。原因: " + cause);
//            }
//        });
//
//        rabbitTemplate.setReturnCallback((Message message,
//                                          int replyCode,
//                                          String replyText,
//                                          String exchange,
//                                          String routingKey)->{
//
//            System.out.println("刚才消息：【"+new String(message.getBody())+"】 replyCode:"+replyCode+"  replyText:"+replyText + " ==>"+exchange+","+routingKey);
//        });


        rabbitTemplate.convertAndSend("hahax","hx","123");
    }
}
