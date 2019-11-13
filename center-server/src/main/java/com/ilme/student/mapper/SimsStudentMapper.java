package com.ilme.student.mapper;

import com.ilem.domain.SimsStudent;
import com.ilme.student.model.SimsStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SimsStudentMapper {
    long countByExample(SimsStudentExample example);

    int deleteByExample(SimsStudentExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsStudent record);

    int insertSelective(SimsStudent record);

    List<SimsStudent> selectByExample(SimsStudentExample example);

    SimsStudent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsStudent record, @Param("example") SimsStudentExample example);

    int updateByExample(@Param("record") SimsStudent record, @Param("example") SimsStudentExample example);

    int updateByPrimaryKeySelective(SimsStudent record);

    int updateByPrimaryKey(SimsStudent record);
}