package com.nklongyi;

import com.nklongyi.Task.Task2;
import com.nklongyi.Task.Task3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 异步任务测试
 * Created by longyi on 2018-03-27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testTask3 {

    @Autowired
    private Task3 task3;

    @Test
    public void test() throws Exception {
        task3.doTaskOne();
        task3.doTaskTwo();
        task3.doTaskThree();
    }


}
