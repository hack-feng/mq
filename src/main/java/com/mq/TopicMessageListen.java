package com.mq;

import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.alibaba.fastjson.JSON;

public class TopicMessageListen implements MessageListener{

	//监听接口获取数据
    public void onMessage(Message message) {        
        try {
            System.out.println("------------获取到的数据:"+message);
            TextMessage tm = (TextMessage)(message);
            String aa = tm.getText();
            Map<String, Object> map = JSON.parseObject(aa);
            System.out.println("time" + message.getJMSTimestamp());
            System.out.println("------------------aa的值："+map.get("aa"));
            System.out.println("------------------bb的值："+map.get("bb"));
            //在这里可以进行操作。
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
