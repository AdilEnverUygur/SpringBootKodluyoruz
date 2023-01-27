package com.adilenver.tutorials.controller;

import com.adilenver.tutorials.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;

    //http://localhost:8080/bean/beanDeto
    @GetMapping("/bean/beanDeto") //url yapisi
    @ResponseBody //html olmadan ekranda goster
    public String getBeanDto(){
        return beanConfig.beanDto() + "";
    }
}
