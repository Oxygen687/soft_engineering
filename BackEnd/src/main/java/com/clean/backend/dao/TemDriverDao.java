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

    //查看问卷试题
    @Select("select context from survey")
    List<String> selectSurvey();


    @Select("select id from TemDriver where driverName = #{name}")
    int selectByName(String name);

    @Update("update TemDriver set answerStatue = #{answerStatue} where id = #{id}")
    int successInsert(int id,int answerStatue);

}
