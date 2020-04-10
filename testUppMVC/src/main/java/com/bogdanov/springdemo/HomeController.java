package com.bogdanov.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }


    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


    @RequestMapping("/processForm")
    public void processForm(){
        System.out.println("inside process form");
        //return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String message = "Yo!!! " + name;

        model.addAttribute("message", message);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model){
        name = name.toUpperCase();
        String message = "Hey, my friend from v3! " + name;

        model.addAttribute("message", message);
        return "helloworld";
    }


    @RequestMapping("/getRandomNum")
    public String getRandomNum(HttpServletRequest request, Model model){
        request.setAttribute("randomNum", getRandomNumber());
        return "randomNum";
    }

    private int getRandomNumber(){
        Random random = new Random();
        int x = random.nextInt(1000);
        return x;
    }

}
