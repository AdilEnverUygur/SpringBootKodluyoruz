package com.adilenver.bean;

import com.adilenver.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton") //Projeyle baslar ve projeyle olur
//    @Scope("request")   //Sadece Istek boyunca calisacak
//    @Scope("session")   //Sadece Oturum boyunca calisacak
    public BeanDto beanDto(){
        return BeanDto
                .builder()
                .id(0L).beanName("Bean Name").beanData("Bean Data")
                .build();
    }
}
