package com.ilme.student.mapper;

import com.ilem.domain.AuthUserPermit;
import com.ilme.student.model.AuthUserPermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserPermitMapper {
    long countByExample(AuthUserPermitExample example);

    int deleteByExample(AuthUserPermitExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthUserPermit record);

    int insertSelective(AuthUserPermit record);

    List<AuthUserPermit> selectByExample(AuthUserPermitExample example);

    AuthUserPermit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthUserPermit record, @Param("example") AuthUserPermitExample example);

    int updateByExample(@Param("record") AuthUserPermit record, @Param("example") AuthUserPermitExample example);

    int updateByPrimaryKeySelective(AuthUserPermit record);

    int updateByPrimaryKey(AuthUserPermit record);
}