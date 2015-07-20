package com.zhernakov.samples.spring.aspectj;

import com.zhernakov.samples.spring.aspectj.config.RootConfig;
import com.zhernakov.samples.spring.aspectj.model.PerformException;
import com.zhernakov.samples.spring.aspectj.model.Performer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Misha on 20.07.2015.
 */
public class App {
    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);
        final Performer giovanni = (Performer) ctx.getBean("giovanni");
        try {
            while (true) {
                giovanni.perform();
            }
        } catch (PerformException e) {
        }
    }
}
