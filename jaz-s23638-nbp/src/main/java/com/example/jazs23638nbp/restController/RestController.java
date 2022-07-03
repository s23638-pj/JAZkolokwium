package com.example.jazs23638nbp.restController;

import com.example.jazs23638nbp.entity.Entity;
import com.example.jazs23638nbp.repository.nbpRepository;
import com.example.jazs23638nbp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    nbpRepository nbpRepository;

    @GetMapping("/")
    public String hello(Double rates) {
        Double averageRate = Service.getExchangeData();

        if (averageRate != null) {
            Entity exchangeRates = new Entity();
            exchangeRates.setCurrency(String.valueOf(rates));


            nbpRepository.save(exchangeRates);

            String str = "Kurs złota wynosi " + rates;
            return str;
        } else {
            return "Something went wrong";
        }
    }

}