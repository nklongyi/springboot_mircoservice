package com.nklongyi;

import com.nklongyi.Task.Task3;
import com.nklongyi.Task.Task4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * 异步回调测试
 * Created by longyi on 2018-03-27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testTask4 {

    @Autowired
    private Task4 task4;

    @Test
    public void test() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> task1 = task4.doTaskOne();
        Future<String> task2 = task4.doTaskTwo();
        Future<String> task3 = task4.doTaskThree();

        while (true){
            if(task1.isDone() && task2.isDone() && task3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }


}
