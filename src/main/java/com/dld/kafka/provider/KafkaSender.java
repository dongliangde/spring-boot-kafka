package com.dld.kafka.provider;


import com.dld.kafka.beans.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author :dongliangde
 * @Title: KafkaSender
 * @ProjectName rsbi
 * @Description: TODO
 * @date 2019/05/1716:59
 */
@Component
@Slf4j
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send() {
            Message message = new Message();
            message.setId(1);
            message.setMsg("hell word ！");
            message.setSendTime(new Date());
            System.out.println("创建+++++++++++++++++++++"+message);
            kafkaTemplate.send("dld",message.toString());
    }
}
