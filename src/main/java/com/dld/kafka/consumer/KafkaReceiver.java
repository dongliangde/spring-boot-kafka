package com.dld.kafka.consumer;


import com.dld.kafka.beans.Message;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author :dongliangde
 * @Title: KafkaReceiver
 * @ProjectName rsbi
 * @Description: TODO
 * @date 2019/05/1717:17
 */
@Component
@Slf4j
public class KafkaReceiver {

    @KafkaListener(topics = {"dld"})//每条发布到Kafka集群的消息都有一个类别，参数可以多个为数组
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Message message = (Message)kafkaMessage.get();
            System.out.println("消费------------------ id =" + message.getId()
                    +"msg"+message.getMsg()+"添加时间"+message.getSendTime());
        }

    }
}
