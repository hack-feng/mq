package com.mq;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.util.MqSendUtil;

public class SendMessageThread1 extends Thread{
	
	@Override
	public void run(){
		MqSendUtil mq = new MqSendUtil();
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("aa", "Thread1 aa的值");
        map.put("bb", "Thread1 bb的值");
        mq.send(JSON.toJSONString(map));
        System.out.println("Thread1发送的数据："+map);
	}

}
