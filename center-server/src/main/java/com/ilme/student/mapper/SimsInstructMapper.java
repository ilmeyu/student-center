package com.ilme.student.mapper;

import com.ilem.domain.SimsInstruct;
import com.ilme.student.model.SimsInstructExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimsInstructMapper {
    long countByExample(SimsInstructExample example);

    int deleteByExample(SimsInstructExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsInstruct record);

    int insertSelective(SimsInstruct record);

    List<SimsInstruct> selectByExample(SimsInstructExample example);

    SimsInstruct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsInstruct record, @Param("example") SimsInstructExample example);

    int updateByExample(@Param("record") SimsInstruct record, @Param("example") SimsInstructExample example);

    int updateByPrimaryKeySelective(SimsInstruct record);

    int updateByPrimaryKey(SimsInstruct record);
}