package com.ilme.student.mapper;

import com.ilem.domain.SimsTeacher;
import com.ilme.student.model.SimsTeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SimsTeacherMapper {
    long countByExample(SimsTeacherExample example);

    int deleteByExample(SimsTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsTeacher record);

    int insertSelective(SimsTeacher record);

    List<SimsTeacher> selectByExample(SimsTeacherExample example);

    SimsTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsTeacher record, @Param("example") SimsTeacherExample example);

    int updateByExample(@Param("record") SimsTeacher record, @Param("example") SimsTeacherExample example);

    int updateByPrimaryKeySelective(SimsTeacher record);

    int updateByPrimaryKey(SimsTeacher record);
}