package com.ilme.student.mapper;

import com.ilem.domain.AuthUser;
import com.ilme.student.model.AuthUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserMapper {
    long countByExample(AuthUserExample example);

    int deleteByExample(AuthUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    List<AuthUser> selectByExample(AuthUserExample example);

    AuthUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByExample(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);
}