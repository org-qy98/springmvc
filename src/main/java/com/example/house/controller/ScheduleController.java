package com.example.house.controller;

import com.example.house.entity.Schedule;
import com.example.house.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @RequestMapping("/insert")
    public Object save(@RequestBody Schedule schedule){
        return service.save(schedule);
    }

    @RequestMapping("/page")
    public Object queryAll(@RequestBody Map map){
        Map mapResult=new HashMap();
        mapResult.put("schedule",service.queryAll(map));
        mapResult.put("total",service.queryPageCount(map));
        return mapResult;
    }
}
