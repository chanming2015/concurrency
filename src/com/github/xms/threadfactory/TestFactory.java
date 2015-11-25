/*
 *www.github.com
 *Copyright (c) 2015 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.github.xms.threadfactory;

import com.github.xms.thread.ThreadClass;

/**
 * Project:concurrency
 * Package:com.github.xms.threadfactory
 * FileName:TestFactory.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年11月24日 下午9:45:37
 * Description:
 * Version:1.0.0
 */
public class TestFactory {
	public static void main(String[] args) {
		MyThreadFactory mf = new MyThreadFactory("my");
		ThreadClass tc = new ThreadClass(1);
		for (int i = 0; i < 3; i++) {
			mf.newThread(tc).start();
		}
	}
}
