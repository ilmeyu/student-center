package com.ilme.student.mapper;

import com.ilem.domain.AuthPermit;
import com.ilme.student.model.AuthPermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthPermitMapper {
    long countByExample(AuthPermitExample example);

    int deleteByExample(AuthPermitExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthPermit record);

    int insertSelective(AuthPermit record);

    List<AuthPermit> selectByExample(AuthPermitExample example);

    AuthPermit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthPermit record, @Param("example") AuthPermitExample example);

    int updateByExample(@Param("record") AuthPermit record, @Param("example") AuthPermitExample example);

    int updateByPrimaryKeySelective(AuthPermit record);

    int updateByPrimaryKey(AuthPermit record);
}