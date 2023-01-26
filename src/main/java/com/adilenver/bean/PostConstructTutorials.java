package com.adilenver.bean;

import org.springframework.stereotype.Controller;

@Controller
public class PostConstructTutorials {
//    @Autowired
//    Logger logger;

    //Parametresiz Constructor
    //because "this.logger" is nul
//    public PostConstructTutorials() {
//        logger.info("Log Infor Cagirildi");
//    }

    //Bean henuz baslamadigindan null aliyoruz ve burada bagimliligini enjecte edemiyoruz
    //@PostConstruct gorevi: bir bean nesnesi olusturuldugunda hemen olusur

//    @PostConstruct
//    public void init(){
//        logger.info("Log Infor Cagirildi");
//    }

//    public static void main(String[] args) {
//        PostConstructTutorials beanController = new PostConstructTutorials();
//        System.out.println(beanController);
//    }

}
