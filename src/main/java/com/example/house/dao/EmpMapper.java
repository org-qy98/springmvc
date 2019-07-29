package com.example.house.dao;

import com.example.house.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EmpMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

   List<Map> queryByEname(Map map);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}