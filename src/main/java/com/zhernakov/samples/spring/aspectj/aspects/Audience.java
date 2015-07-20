package com.zhernakov.samples.spring.aspectj.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Misha on 20.07.2015.
 */
public abstract class Audience {

    @Pointcut("execution(* com.zhernakov.samples.spring.aspectj.model.Performer.perform())")
    public void performance() {
    }

}
