package com.clean.backend.dao;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.VipVisitor;
import com.clean.backend.entity.Administrator;
import com.clean.backend.entity.Visit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AdministratorDao {
    //查看自己所有的待审批
    @Select("select * from application where visitAdministrator = #{name} and applicationStatue = 0")
    List<Application> getMyApproval(String name);

    // 查询信息
    @Select("select * from administrator where administratorName = #{administratorName}")
    Administrator getByaccount(String administratorName);
    //同意/拒绝申请
    @Update("update application set applicationStatue = #{statue} where name = #{name}")
    int agreeAppliaction(String name,int statue);

    //查询活动管理
    @Select("select * from visit where visitAdministrator = #{visitAdministrator}")
    List<Visit> getVisit(String visitAdministrator);

    //管理拜访的开始与结束
    @Update("update visit set visitStatue = #{statue} where name = #{name}")
    int manageVisit(String name,int statue);

    //VIP访客申请
    @Insert("insert into VIPVisitor(company,licensePlateNumber) values(#{company},#{licensePlateNumber})")
    int insertVIP(VipVisitor visitor);

    //查看VIP信息
    @Select("select id,company,licensePlateNumber from VIPVisitor")
    List<VipVisitor> selectVIP();
    //VIP访客管理
    @Update("update VIPVisitor set visitStatue = #{statue} where id = #{id} ")
    int manageVIP(int id,int statue);

    //查看VIP访客的申请状态
    @Select("select applicationStatue from VIPVisitor where id = #{id}")
    int selectVIPStatue(int id);



}
