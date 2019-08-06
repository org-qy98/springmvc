package com.example.house.controller;

import com.example.house.entity.Rented;
import com.example.house.service.RentedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rented")
public class RentedCotroller {

    @Autowired
    private RentedService service;

    @RequestMapping("/save")
    public Object save(Rented rented){
        return service.save(rented);
    }

    @RequestMapping("/update")
    public Object update(@RequestBody Rented rented){
        return service.update(rented);
    }

    @RequestMapping("/updateA")
    public Object updateA(@RequestBody Rented rented){
        return service.updateA(rented);
    }

    @RequestMapping("/query")
    public Object queryAll(@RequestBody Map map){
        Map mapResult=new HashMap();
        mapResult.put("rentedList",service.queryAll(map));
        mapResult.put("total",service.queryPageCount(map));
        System.out.println(mapResult);

        return mapResult;
    }
}
