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
 * @author XuMaoSen
 * Create Date:2016年2月25日 下午8:18:44
 * Description:
 * Version:1.0.0
 */
public class MyThreadFactory implements ThreadFactory
{

    private int count;
    private String name;

    /**
     * @author XuMaoSen
     * Create Date:2016年2月25日 下午8:20:21
     * Description:
     */
    public MyThreadFactory(String name)
    {
        this.count = 0;
        this.name = name;
    }

    /*
     * @author XuMaoSen
     */
    @Override
    public Thread newThread(Runnable r)
    {

        return new Thread(r, name + "-Thread_" + count++);
    }

}
