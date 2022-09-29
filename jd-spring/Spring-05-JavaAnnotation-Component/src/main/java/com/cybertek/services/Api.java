package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Api implements Course {
    @Override
    public void getTeachHours() {
        System.out.println(" teaching hours 25");
    }
}
