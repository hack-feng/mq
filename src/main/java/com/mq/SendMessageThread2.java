package com.mq;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.util.MqSendUtil;

public class SendMessageThread2 implements Runnable{
	
	public void run(){
		MqSendUtil mq = new MqSendUtil();
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("aa", "Thread2 aa的值");
        map.put("bb", "Thread2 bb的值");
        mq.send(JSON.toJSONString(map));
        System.out.println("Thread2发送的数据："+map);
	}
}
