package com.ilme.student.mapper;

import com.ilem.domain.AuthUserRole;
import com.ilme.student.model.AuthUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserRoleMapper {
    long countByExample(AuthUserRoleExample example);

    int deleteByExample(AuthUserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthUserRole record);

    int insertSelective(AuthUserRole record);

    List<AuthUserRole> selectByExample(AuthUserRoleExample example);

    AuthUserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthUserRole record, @Param("example") AuthUserRoleExample example);

    int updateByExample(@Param("record") AuthUserRole record, @Param("example") AuthUserRoleExample example);

    int updateByPrimaryKeySelective(AuthUserRole record);

    int updateByPrimaryKey(AuthUserRole record);
}