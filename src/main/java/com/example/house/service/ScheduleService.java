package com.example.house.service;


import com.example.house.entity.Schedule;

import java.util.List;
import java.util.Map;

public interface ScheduleService {
    int insertSelective(Schedule record);

    int insert(Schedule record);
    int save(Schedule schedule);



    List<Map> queryAll(Map map);

    /**
     * 查询分页总数量
     * @param map
     * @return
     */
    int queryPageCount(Map map);
}
