package com.scheduled.spring_scheduled.job;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

public class Sample2Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }

    @Scheduled(fixedDelay = 1000L)
    public void exec() throws Exception {
        System.out.println("test2");
    }

    @Configuration
    public static class Sample2Config{
        @Bean
        @ConditionalOnProperty(value={"job.id"}, havingValue = "sample2", matchIfMissing = true)
        public Sample2Runner sample2Runner()  {
            return new Sample2Runner();
        }
    }
}
