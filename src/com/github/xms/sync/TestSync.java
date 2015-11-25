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
 * FileName:TestSync.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年11月24日 下午10:01:31
 * Description:
 * Version:1.0.0
 */
public class TestSync {

	public static int num = 0;

	public static void main(String[] args) {
		Customer c = new Customer();
		Product p = new Product();
		
		Thread t2 = new Thread(p);
		t2.start();
		
		Thread t1 = new Thread(c);
		t1.start();
	}

}
