package com.cybertek.services;


import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {
    @Value("JD1")
   private String batch;
    @Value("${instructor}")
   private String instructor;
    @Value("${days}")
   private String [] days;


    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    private OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachHours() {

        System.out.println(" Weekly teaching hours :"+( 20 +officeHours.getHours()));
    }
}
