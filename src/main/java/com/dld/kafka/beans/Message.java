package com.dld.kafka.beans;

import lombok.Data;

import java.util.Date;

/**
 * @author :dongliangde
 * @Title: Message
 * @ProjectName rsbi
 * @Description: TODO
 * @date 2019/05/1716:48
 */
@Data
public class Message {
    private long id;
    private String msg;
    private Date sendTime;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
