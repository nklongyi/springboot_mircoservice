package com.nklongyi;

import com.nklongyi.Mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by longyi on 2018-03-23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestMQ {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i <100 ; i++) {
            sender.send();
            Thread.sleep(1000);
        }

    }
}
