package com.cybertek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
     public String getRequestMapping(){


         return "home";


     }
    @RequestMapping("/mardan")
     public String getRequestMapping1(){


         return "home";


     }
    @RequestMapping("/cybertek")
     public String getRequestMapping3(){


         return "home";


     }

     @GetMapping("/spring1")
     public String getMappingEx(){

        return "home";

     }

     @PostMapping("/spring")
     public String getMappingEx1(){

        return "home";

     }


}
