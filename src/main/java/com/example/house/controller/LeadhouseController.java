package com.example.house.controller;

import com.example.house.entity.Leadhouse;
import com.example.house.service.LeadhouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Listhouse")
public class LeadhouseController {

    @Autowired
    private LeadhouseService service;

    /**
     * 查询
     * @param map
     * @return
     */
    @RequestMapping("/page")
    public Object queryAll(@RequestBody Map map){
        Map mapResult=new HashMap();
        mapResult.put("houseList",service.queryAll(map));
        mapResult.put("total",service.queryPageCount(map));
        System.out.println(mapResult);
        return mapResult;
    }


    /**
     * 查询
     * @param map
     * @return
     */
    @RequestMapping("/page1")
    public Object queryAll1(@RequestBody Map map){
        Map mapResult=new HashMap();
        mapResult.put("houseList",service.queryAll1(map));
        mapResult.put("total",service.queryPageCount1(map));
        System.out.println(mapResult);
        return mapResult;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Object delete(Integer id){
        return service.deleteByPrimaryKey(id);
    }

    @RequestMapping("/update")
    public Object update(@RequestBody Leadhouse leadhouse){
        System.out.println(leadhouse);
        return service.update(leadhouse);
    }


}
