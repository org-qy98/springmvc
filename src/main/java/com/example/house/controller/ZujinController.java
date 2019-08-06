package com.example.house.controller;

import com.example.house.entity.Zujin;
import com.example.house.service.ZujinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zujin")
public class ZujinController {

    @Autowired
    private ZujinService service;

//    @RequestMapping("/update")
//    public Object update(@RequestBody Zujin zujin){
//        return service.updateByPrimaryKey(zujin);
//    }
}
