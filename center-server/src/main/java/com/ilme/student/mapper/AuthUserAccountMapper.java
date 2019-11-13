package com.ilme.student.mapper;

import com.ilem.domain.AuthUserAccount;
import com.ilme.student.model.AuthUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserAccountMapper {
    long countByExample(AuthUserAccountExample example);

    int deleteByExample(AuthUserAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthUserAccount record);

    int insertSelective(AuthUserAccount record);

    List<AuthUserAccount> selectByExample(AuthUserAccountExample example);

    AuthUserAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthUserAccount record, @Param("example") AuthUserAccountExample example);

    int updateByExample(@Param("record") AuthUserAccount record, @Param("example") AuthUserAccountExample example);

    int updateByPrimaryKeySelective(AuthUserAccount record);

    int updateByPrimaryKey(AuthUserAccount record);
}