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
 * FileName:TestClass.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年11月24日 下午7:50:36
 * Description:
 * Version:1.0.0
 */
public class TestClass {

	public static void main(String[] args) {
		ThreadI ti = new ThreadI(0);
		for (int i = 0; i < 2; i++) {
			Thread th = new Thread(ti);
			if (0 == i) {
				th.setPriority(Thread.MAX_PRIORITY);
				th.start();
				try {
					th.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				th.start();
			}

		}
		ThreadClass tc = new ThreadClass(3);
		for (int i = 0; i < 2; i++) {
			Thread th = new Thread(tc);
			th.start();
		}
		
	}
	
}
