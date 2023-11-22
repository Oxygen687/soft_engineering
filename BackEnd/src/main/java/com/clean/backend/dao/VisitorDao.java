package com.clean.backend.dao;

import com.clean.backend.entity.Visitor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VisitorDao {
//    @Select("select id, visitorName, type, secondaryId from visitor where id = #{id};")
    @Select("select * from visitor where id = #{id};")
    Visitor getVisitorById(int id);

    //插入visitor表
    @Insert("insert into visitor(visitorName,type,secondaryId) values (#{name},#{type},select id from normalVisitor where name = #{name}")//还是说后面直接写secomndaryID/select id from normalVisitor where name= #{name}
    int insertVisitor(String name,int type,int secondaryId);
    //insert into visitor(visitorName,type,secondaryId) values (#{name},#{type},select id from normalVisitor where name = #{name})


}
