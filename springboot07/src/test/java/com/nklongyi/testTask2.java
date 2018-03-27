package com.nklongyi;

import com.nklongyi.Task.Task2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by longyi on 2018-03-27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testTask2 {

    @Autowired
    private Task2 task2;

    @Test
    public void test() throws Exception {
        task2.doTaskOne();
        task2.doTaskTwo();
        task2.doTaskThree();
    }


}
