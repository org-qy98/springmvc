package com.example.house.service;

import com.example.house.entity.Leadhouse;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface LeadhouseService {
    int deleteByPrimaryKey(Integer id);

    int insert(Leadhouse record);

    int insertSelective(Leadhouse record);

    Leadhouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Leadhouse record);

    int updateByPrimaryKey(Leadhouse record);

    /**
     * 收租方法
     * @return
     */
    List<Map> queryAll(Map map);

    /**
     * 查询分页总数量
     * @param map
     * @return
     */
    int queryPageCount(Map map);
    int update(Leadhouse leadhouse);


    List<Map> queryAll1(Map map);

    /**
     * 查询分页总数量
     * @param map
     * @return
     */
    int queryPageCount1(Map map);
}
