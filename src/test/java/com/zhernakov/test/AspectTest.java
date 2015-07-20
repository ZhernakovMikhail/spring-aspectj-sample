package com.zhernakov.test;

import com.zhernakov.samples.spring.aspectj.config.RootConfig;
import com.zhernakov.samples.spring.aspectj.model.PerformException;
import com.zhernakov.samples.spring.aspectj.model.Performer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Misha on 20.07.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class AspectTest {

    @Autowired
    @Qualifier("giovanni")
    private Performer giovanni;

    @Test
    public void sceneTest() {
        try {
            while (true) {
                giovanni.perform();
            }
        } catch (PerformException e) {
        }
    }
}