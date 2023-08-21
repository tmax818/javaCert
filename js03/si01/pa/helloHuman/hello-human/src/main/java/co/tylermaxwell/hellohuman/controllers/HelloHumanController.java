package co.tylermaxwell.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {

    @RequestMapping("")
    public String hello(@RequestParam(defaultValue = "human") String q, @RequestParam(defaultValue = "") String last_name, @RequestParam(defaultValue = "1") Integer times){
        System.out.println(q);
        System.out.println(times);
        String str = String.format("\nHello %s %s ", q, last_name);
        for(int i = 0; i < times-1; i++){
            str += String.format("\nHello %s %s ", q, last_name);
        }
        return str;
    }
    
}
