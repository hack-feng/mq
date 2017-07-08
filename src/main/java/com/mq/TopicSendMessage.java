package com.mq;

public class TopicSendMessage {
    
    @SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
        
    	//线程1调用
    	SendMessageThread1 thread1 = new SendMessageThread1();
    	thread1.start();
    	thread1.sleep(5000);
    	
    	
    	//线程2调用
    	SendMessageThread2 thread2 = new SendMessageThread2();
    	//thread2.run();并不是线程开启，而是简单的方法调用
    	Thread t = new Thread(thread2);//创建线程
//    	t.run(); //如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
    	t.start(); //线程开启
        
    }
}
