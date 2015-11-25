/*
 *www.github.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.github.xms.sync;

/**
 * Project:concurrency
 * Package:com.github.xms.sync
 * FileName:Product.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年11月24日 下午9:56:03
 * Description:
 * Version:1.0.0
 */
public class Product implements Runnable {

	/*
	 * @author XuMaoSen
	 */
	@Override
	public void run() {
		synchronized (TestSync.class) {
			while (true) {
				if (3 == TestSync.num) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(++TestSync.num + "    ++");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// notifyAll();
			}
		}
	}

}
