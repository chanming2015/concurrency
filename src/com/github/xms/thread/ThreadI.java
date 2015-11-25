/*
 *www.github.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.github.xms.thread;

/**
 * Project:concurrency
 * Package:com.github.xms.thread
 * FileName:ThreadClass.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年11月24日 下午7:29:45
 * Description:
 * Version:1.0.0
 */
public class ThreadI implements Runnable {
	private ThreadLocal<Integer> num = new ThreadLocal<Integer>(){

		/* @author XuMaoSen 
		 */
		@Override
		protected Integer initialValue() {
			
			return 1;
		}
		
	};

	/**
	 * Author XuMaoSen Create Date:2015年11月24日 下午7:45:47 Description:
	 */
	public ThreadI(Integer num) {
		this.num.set(num);
	}

	/*
	 * @author XuMaoSen
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getId() + " - "
					+ Thread.currentThread().getName() + " - "
					+ Thread.currentThread().getPriority() + " - "
					+ Thread.currentThread().getState() + " - " + num.get());
			num.set(num.get() + 1);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
