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
 * Create Date:2015年11月24日 下午8:43:15
 * Description:
 * Version:1.0.0
 */
public class ThreadClass extends Thread {

	private int num;

	/**
	 * Author XuMaoSen Create Date:2015年11月24日 下午8:44:13 Description:
	 */
	public ThreadClass(int num) {
		this.num = num;
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
					+ Thread.currentThread().getState() + " - " + num);
			num++;
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
