package com.example.house.service;

import com.example.house.dao.ZujinMapper;
import com.example.house.entity.Zujin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZujinServiceImpl implements ZujinService{

    @Autowired
    private ZujinMapper mapper;
    @Override
    public int updateByPrimaryKey(Zujin record) {
        return mapper.updateByPrimaryKey(record);
    }
}
