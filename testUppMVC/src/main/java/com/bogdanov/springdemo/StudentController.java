package com.bogdanov.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/registration")
    public String studentRegistration(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "registration-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        return "student-confirmation";
    }

}
