package com.cybertek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

     @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){

         System.out.println("end point is :"+name);
        return "home";


     }
     @GetMapping("/home/{name}/{email}")
    public String pathVariableEx1(@PathVariable("name")String name, @PathVariable("email")String email){

         System.out.println("end point is :"+name);
         System.out.println("end point is :"+email);
        return "home";


     }

     @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course")String cpurse){

         System.out.println("end point is :"+cpurse);


        return "home";
     }


     @GetMapping(value = "/course")
    public String requestParam2(@RequestParam(value = "name",required = false,defaultValue = "cybertek")String name ){

         System.out.println(" the end int is : "+name);

        return "home";
     }


}
