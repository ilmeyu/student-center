package com.ilme.student.mapper;

import com.ilem.domain.SimsMajor;
import com.ilme.student.model.SimsMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimsMajorMapper {
    long countByExample(SimsMajorExample example);

    int deleteByExample(SimsMajorExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsMajor record);

    int insertSelective(SimsMajor record);

    List<SimsMajor> selectByExample(SimsMajorExample example);

    SimsMajor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsMajor record, @Param("example") SimsMajorExample example);

    int updateByExample(@Param("record") SimsMajor record, @Param("example") SimsMajorExample example);

    int updateByPrimaryKeySelective(SimsMajor record);

    int updateByPrimaryKey(SimsMajor record);
}