package com.zhernakov.samples.spring.aspectj.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Misha on 20.07.2015.
 */
@Component
@Aspect
@Order(1)
public class AudienceTakeOffCellPhones extends Audience {
    private boolean cellPhonesIsOff;

    @Pointcut("execution(* com.zhernakov.samples.spring.aspectj.model.Performer.perform())")
    public void performance() {
    }

    @Before("performance()")
    public void takeOffCellPhones() {
        if (!cellPhonesIsOff) {
            System.out.println("Зрители выключают мобильные телефоны");
            cellPhonesIsOff = true;
        }
    }
}
