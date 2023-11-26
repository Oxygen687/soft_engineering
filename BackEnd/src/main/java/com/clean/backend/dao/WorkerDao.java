package com.clean.backend.dao;

import com.clean.backend.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WorkerDao {
    //将自己的信息存入worker表
    @Insert("insert into worker(name,company,phone,licensePlateNumber,visitApartment,cardId) values(#{name},#{company},#{phone},#{licensePlateNumber},#{visitApartment},#{cardId})")
    int insertinfo(Worker worker);
     //查看自己的申请
    @Select("select * from application where visitorName = #{name}")
    Application getMyApplication(String name);
    //将自己的申请信息传入visit表
    @Insert("insert into visit(name,visitApartment,visitAdministrator) values(#{name},#{visitApartment},#{visitAdministrator})")
    int insertvisit(Visit visit);
    //将自己的信息传入application表
    @Insert("insert into application(name,visitApartment,visitAdministrator) values(#{name},#{visitApartment},#{visitAdministrator})")
    int insertApplication(Application application);

    @Insert("insert into answer(answer1,answer2,name) values(#{answer1},#{answer2},#{name})")
    int insertAnswer(String answer1,String answer2,String name);

    @Select("select * from question")
    List<Question> getQuestion();
}
