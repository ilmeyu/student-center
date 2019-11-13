package com.ilme.student.mapper;

import com.ilem.domain.AuthUserBehavior;
import com.ilme.student.model.AuthUserBehaviorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserBehaviorMapper {
    long countByExample(AuthUserBehaviorExample example);

    int deleteByExample(AuthUserBehaviorExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthUserBehavior record);

    int insertSelective(AuthUserBehavior record);

    List<AuthUserBehavior> selectByExample(AuthUserBehaviorExample example);

    AuthUserBehavior selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthUserBehavior record, @Param("example") AuthUserBehaviorExample example);

    int updateByExample(@Param("record") AuthUserBehavior record, @Param("example") AuthUserBehaviorExample example);

    int updateByPrimaryKeySelective(AuthUserBehavior record);

    int updateByPrimaryKey(AuthUserBehavior record);
}