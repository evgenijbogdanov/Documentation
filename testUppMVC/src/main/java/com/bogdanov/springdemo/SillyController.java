package com.bogdanov.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sillyController")
public class SillyController {

    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "helloworld-from";
    }

    @RequestMapping("")
    public String sillyHome(){
        return "sillyHome";
    }
}
