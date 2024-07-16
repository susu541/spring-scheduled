package com.scheduled.spring_scheduled.job;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

public class Sample1Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }

    @Scheduled(fixedDelay = 1L)
    public void exec() throws Exception {
        System.out.println("test");
    }

    @Configuration
    public static class Sample1Config{
        @Bean
        @ConditionalOnProperty(value={"job.id"}, havingValue = "sample1")
        public Sample1Runner sample1Runner() {
            return new Sample1Runner();
        }
    }
}
