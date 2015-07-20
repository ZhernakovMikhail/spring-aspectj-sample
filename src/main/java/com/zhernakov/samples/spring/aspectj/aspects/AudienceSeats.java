package com.zhernakov.samples.spring.aspectj.aspects;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * Created by Misha on 20.07.2015.
 */
@Aspect
@Order(0)
@Component
public class AudienceSeats extends Audience {

    private boolean seat;

    @Before("performance()")
    public void takeSeats() {
        if (!seat) {
            System.out.println("Зрители рассаживаются на свои места");
            seat = true;
        }
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("Зрители: " + StringUtils.repeat("ХЛОП", ", ", RandomUtils.nextInt(4, 20)) + "!");
    }

    @AfterThrowing("performance()")
    public void boo() {
        System.err.println("Зрители: Ужас! Верните нам деньги!");
    }
}
