package com.ilme.student.mapper;

import com.ilem.domain.SimsLesson;
import com.ilme.student.model.SimsLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimsLessonMapper {
    long countByExample(SimsLessonExample example);

    int deleteByExample(SimsLessonExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsLesson record);

    int insertSelective(SimsLesson record);

    List<SimsLesson> selectByExample(SimsLessonExample example);

    SimsLesson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsLesson record, @Param("example") SimsLessonExample example);

    int updateByExample(@Param("record") SimsLesson record, @Param("example") SimsLessonExample example);

    int updateByPrimaryKeySelective(SimsLesson record);

    int updateByPrimaryKey(SimsLesson record);
}