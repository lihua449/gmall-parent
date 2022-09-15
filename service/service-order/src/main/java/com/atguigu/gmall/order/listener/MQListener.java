package com.atguigu.gmall.order.listener;


import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: 李耀华
 * @date: 2022/9/15 11:04
 */

@Slf4j
@Component
public class MQListener {

    private ConcurrentHashMap<String, AtomicInteger> counter = new ConcurrentHashMap<>();



    public void listenHaha(Message message, Channel channel) throws IOException {
        String content = new String(message.getBody());
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        counter.putIfAbsent(content,new AtomicInteger(0));
        try {
            System.out.println("收到的消息: " + content);
            int i = 10/0;
            channel.basicAck(deliveryTag,false);
        }catch (Exception e){
            log.error("消息消费失败：{}",content);
            AtomicInteger integer = counter.get(content);
            System.out.println(deliveryTag + "加到: " + integer);
            if (integer.incrementAndGet() <= 10){
                //重新存储消息，待下个人继续处理
                channel.basicNack(deliveryTag,false,true);
            } else {
                //TODO
                log.error("{} 消息重试10次失败，记录到数据库等待人工处理",content);
                channel.basicNack(deliveryTag,false,false);
                counter.remove(content);
            }
        }

    }
}
