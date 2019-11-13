package com.ilme.student.mapper;

import com.ilem.domain.AuthRolePermit;
import com.ilme.student.model.AuthRolePermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthRolePermitMapper {
    long countByExample(AuthRolePermitExample example);

    int deleteByExample(AuthRolePermitExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthRolePermit record);

    int insertSelective(AuthRolePermit record);

    List<AuthRolePermit> selectByExample(AuthRolePermitExample example);

    AuthRolePermit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthRolePermit record, @Param("example") AuthRolePermitExample example);

    int updateByExample(@Param("record") AuthRolePermit record, @Param("example") AuthRolePermitExample example);

    int updateByPrimaryKeySelective(AuthRolePermit record);

    int updateByPrimaryKey(AuthRolePermit record);
}