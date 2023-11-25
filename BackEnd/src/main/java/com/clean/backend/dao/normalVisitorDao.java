package com.clean.backend.dao;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.Visit;
import com.clean.backend.entity.NormalVisitor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface normalVisitorDao {
    //插入normalVisitor表
    //@Intsert("insert into normalVisitor(name,company,phone,licensePlateNumber,visitApartment) values(#{name},#{company},#{licensePlateNumber},#{visitApartment})")
    @Insert("insert into normalVisitor(name,company,phone,licensePlateNumber,visitApartment) values (#{name},#{company},#{phone},#{licensePlateNumber},#{visitApartment})")
    int insertinfo(NormalVisitor normalVisitor);

    //查看自己的申请
    @Select("select * from normalVisitor where id = #{id}")
    NormalVisitor getMyapplication(int id);

    //将申请信息传入visit表
    @Insert("insert into visit(visitorId,visitorName,apartmentId,apartmentName,visitDate,visitStatue) values (#{visitorId},#{visitorName},#{apartmentId},#{apartmentName},#{visitDate},#{visitStatue})")
    int insertvisit(Visit visit);

    //将申请传入application表
    @Insert("insert into application(visitorId,visitorName,apartmentId,apartmentName,administrator_id,applicationStatue) values(#{visitorId},#{visitorName},#{apartmentId},#{apartmentName},#{administrator_id},#{applicationStatue})")
    int insertapplication(Application application);



}
