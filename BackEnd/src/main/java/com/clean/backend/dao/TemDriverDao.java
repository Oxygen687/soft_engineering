package com.clean.backend.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.clean.backend.entity.*;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TemDriverDao {
    @Insert("insert into TemDriver(driverName,company,phone,licensePlateNumber,planTimes) values(#{driverName},#{company},#{phone},#{licensePlateNumber},#{planTimes})")
    int insertTemDriver(TemDriver temDriver);


    @Select("select id from TemDriver where driverName = #{name}")
    int selectByName(String name);

}
