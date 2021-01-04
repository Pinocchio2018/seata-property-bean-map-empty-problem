package com.siyu.seatapropertybeanmapemptyproblem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:applicationContext*.xml")
public class SeataPropertyBeanMapEmptyProblemApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SeataPropertyBeanMapEmptyProblemApplication.class, args);
        Thread.currentThread().join();
    }

}
