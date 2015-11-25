/*
 *www.github.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.github.xms.threadfactory;

import java.util.concurrent.ThreadFactory;

/**
 * Project:concurrency
 * Package:com.github.xms.threadfactory
 * FileName:MyThreadFactory.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年11月24日 下午9:33:40
 * Description:
 * Version:1.0.0
 */
public class MyThreadFactory implements ThreadFactory {
	
	private int count;
	private String name;

	/**
	 * Author XuMaoSen
	 * Create Date:2015年11月24日 下午9:39:59
	 * Description:
	 */
	public MyThreadFactory(String name) {
		this.count = 0;
		this.name = name;
	}

	/* @author XuMaoSen 
	 */
	@Override
	public Thread newThread(Runnable r) {

		return new Thread(r, name + "-Thread_" + count++);
	}

}
