package com.example.house.dao;

import com.example.house.entity.Rented;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RentedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rented record);

    int insertSelective(Rented record);

    Rented selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rented record);

    int updateByPrimaryKey(Rented record);

    int save(Rented rented);

    @Update("update rented set charge=#{charge},endtime=#{endtime},state=#{state} where id=#{id}")
    int update(Rented rented);


    @Update("update rented set state=#{state} where id=#{id}")
    int updateA(Rented rented);

    List<Map> queryAll(Map map);

    /**
     * 查询分页总数量
     * @param map
     * @return
     */
    int queryPageCount(Map map);
}