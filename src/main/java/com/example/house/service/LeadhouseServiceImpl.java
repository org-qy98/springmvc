package com.example.house.service;

import com.example.house.dao.LeadhouseMapper;
import com.example.house.entity.Leadhouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LeadhouseServiceImpl implements  LeadhouseService{

    @Autowired
    private LeadhouseMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Leadhouse record) {
        return 0;
    }

    @Override
    public int insertSelective(Leadhouse record) {
        return 0;
    }

    @Override
    public Leadhouse selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Leadhouse record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Leadhouse record) {
        return 0;
    }

    @Override
    public List<Map> queryAll(Map map) {
        List<Map> list = mapper.queryAll(map);
        return list;
    }

    @Override
    public int queryPageCount(Map map) {

        return mapper.queryPageCount(map);
    }

    @Override
    public int update(Leadhouse leadhouse) {
        return mapper.update(leadhouse);
    }

    @Override
    public List<Map> queryAll1(Map map) {
        List<Map> list = mapper.queryAll1(map);
        return list;
    }

    @Override
    public int queryPageCount1(Map map) {
        return mapper.queryPageCount1(map);
    }


}
