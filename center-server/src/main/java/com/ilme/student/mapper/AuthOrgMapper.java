package com.ilme.student.mapper;

import com.ilem.domain.AuthOrg;
import com.ilme.student.model.AuthOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthOrgMapper {
    long countByExample(AuthOrgExample example);

    int deleteByExample(AuthOrgExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthOrg record);

    int insertSelective(AuthOrg record);

    List<AuthOrg> selectByExample(AuthOrgExample example);

    AuthOrg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthOrg record, @Param("example") AuthOrgExample example);

    int updateByExample(@Param("record") AuthOrg record, @Param("example") AuthOrgExample example);

    int updateByPrimaryKeySelective(AuthOrg record);

    int updateByPrimaryKey(AuthOrg record);
}