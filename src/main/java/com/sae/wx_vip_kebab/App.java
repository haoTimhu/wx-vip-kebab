package com.sae.wx_vip_kebab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
@ServletComponentScan
public class  App  extends SpringBootServletInitializer{

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
           return application.sources(App.class);
       }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}