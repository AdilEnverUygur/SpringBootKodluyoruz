package com.adilenver.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //Begin
    public void initialBeanMethod(){
        log.info("Bean Baslamadan once ben varim");
        System.out.println("Bean Baslamadan once calisacak method");

    }

    //End
    public void destroyBeanMethod(){
        log.info("Bean Bittikten sonra ben varim");
        System.err.println("Bean Bittikten sonra calisacak method");
    }
}
