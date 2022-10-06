package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> spPriceForCity=new HashMap<>();

    static {

        spPriceForCity.put(City.AUSTIN,new BigDecimal("4.32"));
        spPriceForCity.put(City.DULLES,new BigDecimal("2.92"));
        spPriceForCity.put(City.SAN_ANTONIO,new BigDecimal("5.72"));

    }


    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue=BigDecimal.ZERO;


        Optional<Map.Entry<City,BigDecimal>> collect=spPriceForCity.entrySet().stream().filter(x-> x.getKey()==city).findFirst();


        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
