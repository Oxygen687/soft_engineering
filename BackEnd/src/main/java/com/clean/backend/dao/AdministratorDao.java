package com.clean.backend.dao;

import com.clean.backend.entity.Application;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AdministratorDao {
    //查看自己所有的待审批
    @Select("select * from application where administrator_id = #{id} and applicationStatue = 0")
    List<Application> getMyApproval(int id);

    //同意/拒绝申请
    @Update("update application set applicationStatue = #{statue} where visitorId = #{visitorId}")
    int agreeAppliaction(int visitorId,int statue);


}
