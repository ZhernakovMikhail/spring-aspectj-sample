package com.zhernakov.samples.spring.aspectj.config;

import com.zhernakov.samples.spring.aspectj.model.Giovanni;
import com.zhernakov.samples.spring.aspectj.model.Performer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Misha on 20.07.2015.
 */
@Configuration
@ComponentScan("com.zhernakov.*")
@EnableAspectJAutoProxy
public class RootConfig {

    @Bean
    public Performer giovanni() {
        return new Giovanni();
    }
}
