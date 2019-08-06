package com.example.house.dao;

import com.example.house.entity.Emp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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

    List<Map> queryAll(Integer id);

    @Select("select * from employee where eusername=#{eusername} and epassword=#{epassword}")
    List<Emp> queryName(Emp emp);

    @Select("select * from employee  where eusername=#{eusername}")
    Emp queryname(String eusername);
}