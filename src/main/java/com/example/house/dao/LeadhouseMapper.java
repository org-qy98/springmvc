package com.example.house.dao;

import com.example.house.entity.Leadhouse;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Repository
public interface LeadhouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Leadhouse record);

    int insertSelective(Leadhouse record);

    Leadhouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Leadhouse record);

    int updateByPrimaryKey(Leadhouse record);

    @Update("update leadhouse set state=#{state} where id=#{id}")
    int update(Leadhouse leadhouse);
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


    List<Map> queryAll1(Map map);

    /**
     * 查询分页总数量
     * @param map
     * @return
     */
    int queryPageCount1(Map map);
}