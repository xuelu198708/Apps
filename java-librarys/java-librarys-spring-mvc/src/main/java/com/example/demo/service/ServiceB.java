package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuelu.xl on 2020-06-10.
 */
@Service
public class ServiceB {

    @Autowired
    private ServiceA serviceA;

    public void sayIt(){
        System.out.println("serviceA say it");
        serviceA.sayIt();
    }
}
