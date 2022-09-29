package com.cybertek.services;

import com.cybertek.interfaces.ExtraSesion;



public class OfficeHours implements ExtraSesion {
    @Override
    public int getHours() {
        return 7;
    }
}
