package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructorName;
    private OfficeHours officeHours;

    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachHours() {

        System.out.println("Teaching hours " + (20 + officeHours.getHours()));
    }


}
