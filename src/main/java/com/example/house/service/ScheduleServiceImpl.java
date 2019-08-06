package com.example.house.service;

import com.example.house.dao.ScheduleMapper;
import com.example.house.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScheduleServiceImpl  implements ScheduleService{

    @Autowired
    private ScheduleMapper scheduleMapper;
    @Override
    public int insertSelective(Schedule record) {
        return scheduleMapper.insertSelective(record);
    }

    @Override
    public int insert(Schedule record) {
        return scheduleMapper.insert(record);
    }

    @Override
    public int save(Schedule schedule) {
        return scheduleMapper.save(schedule);
    }

    @Override
    public List<Map> queryAll(Map map) {
        return scheduleMapper.queryAll(map);
    }

    @Override
    public int queryPageCount(Map map) {
        return scheduleMapper.queryPageCount(map);
    }
}
