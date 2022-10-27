package com.cybertek.demo.controller;


import com.cybertek.demo.model.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Controller
@RequestMapping("/student")
public class Controller {


    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Mardan");
        model.addAttribute("course","MVC");
        model.addAttribute("lastName","Abla");

        String subject="Spring";
        model.addAttribute("subject",subject) ;

        int studentNumber= new Random().nextInt(1000);
        model.addAttribute("studentID",studentNumber);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(14);
        numbers.add(14);
        numbers.add(15);

        model.addAttribute("numbers",numbers);

        LocalDate birthDate= LocalDate.now().minusYears(34);
        model.addAttribute("birthDate",birthDate);

        Student student=new Student(1,"Mardan","Abla");
        model.addAttribute("student",student);











        return "student/welcome";






    }
}
