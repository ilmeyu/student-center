package com.ilme.student.mapper;

import com.ilem.domain.AuthUserProperty;
import com.ilme.student.model.AuthUserPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserPropertyMapper {
    long countByExample(AuthUserPropertyExample example);

    int deleteByExample(AuthUserPropertyExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthUserProperty record);

    int insertSelective(AuthUserProperty record);

    List<AuthUserProperty> selectByExample(AuthUserPropertyExample example);

    AuthUserProperty selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthUserProperty record, @Param("example") AuthUserPropertyExample example);

    int updateByExample(@Param("record") AuthUserProperty record, @Param("example") AuthUserPropertyExample example);

    int updateByPrimaryKeySelective(AuthUserProperty record);

    int updateByPrimaryKey(AuthUserProperty record);
}