package com.clean.backend.dao;

import com.clean.backend.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface GeneralManagerDao {
    @Select("select * from VIPVisitor where applicationStatue = 11")
    VipVisitor getApproval();
    @Update("update VIPVisitor set applicationStatue = #{applicationStatue} where id = #{id}")
    int manageApplication(int id,int applicationStatue);
    @Update("update VIPVisitor set visitStatue = #{visitStatue} where id = #{id}")
    int newmanage(int id,int visitStatue);
}
