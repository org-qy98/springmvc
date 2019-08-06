package com.example.house.service;

import com.example.house.dao.RentedMapper;
import com.example.house.entity.Rented;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RentedServiceImpl implements RentedService{

    @Autowired
    private RentedMapper mapper;
    @Override
    public int save(Rented rented) {
        return mapper.save(rented);
    }

    @Override
    public int update(Rented rented) {
        return mapper.update(rented);
    }

    @Override
    public List<Map> queryAll(Map map) {
        return mapper.queryAll(map);
    }

    @Override
    public int queryPageCount(Map map) {
        return mapper.queryPageCount(map);
    }

    @Override
    public int updateA(Rented rented) {
        return mapper.updateA(rented);
    }
}
