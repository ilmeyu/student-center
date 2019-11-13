package com.ilme.student.mapper;

import com.ilem.domain.AuthOrgProperty;
import com.ilme.student.model.AuthOrgPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthOrgPropertyMapper {
    long countByExample(AuthOrgPropertyExample example);

    int deleteByExample(AuthOrgPropertyExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthOrgProperty record);

    int insertSelective(AuthOrgProperty record);

    List<AuthOrgProperty> selectByExample(AuthOrgPropertyExample example);

    AuthOrgProperty selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthOrgProperty record, @Param("example") AuthOrgPropertyExample example);

    int updateByExample(@Param("record") AuthOrgProperty record, @Param("example") AuthOrgPropertyExample example);

    int updateByPrimaryKeySelective(AuthOrgProperty record);

    int updateByPrimaryKey(AuthOrgProperty record);
}