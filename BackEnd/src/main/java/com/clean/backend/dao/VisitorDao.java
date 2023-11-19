package com.clean.backend.dao;

import com.clean.backend.entity.Visitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VisitorDao {
//    @Select("select id, visitorName, type, secondaryId from visitor where id = #{id};")
    @Select("select * from visitor where id = #{id};")
    Visitor getVisitorById(int id);

}
