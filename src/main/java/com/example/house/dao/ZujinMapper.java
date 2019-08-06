package com.example.house.dao;

import com.example.house.entity.Zujin;
import org.springframework.stereotype.Repository;

@Repository
public interface ZujinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zujin record);

    int insertSelective(Zujin record);

    Zujin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zujin record);

    int updateByPrimaryKey(Zujin record);
}