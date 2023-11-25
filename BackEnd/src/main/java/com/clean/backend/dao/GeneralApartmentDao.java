package com.clean.backend.dao;

import com.clean.backend.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface GeneralApartmentDao {
    @Select("select * from VIPVisitor where application = 0")
    VipVisitor getApproval();

    @Update("update VIPVisitor set applicationStatue = #{applicationStatue} where id = #{id}")
    int manageApplication(int id,int applicationStatue);
}
