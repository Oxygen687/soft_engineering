package com.clean.backend.dao;

import com.clean.backend.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GeneralApartmentDao {
    @Select("select * from VIPVisitor where applicationStatue = 0")
    List<VipVisitor> getApproval();

    @Update("update VIPVisitor set applicationStatue = #{applicationStatue} where id = #{id}")
    int manageApplication(int id,int applicationStatue);
}
