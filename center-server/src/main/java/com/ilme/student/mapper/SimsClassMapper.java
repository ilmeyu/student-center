package com.ilme.student.mapper;

import com.ilem.domain.SimsClass;
import com.ilme.student.model.SimsClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimsClassMapper {
    long countByExample(SimsClassExample example);

    int deleteByExample(SimsClassExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsClass record);

    int insertSelective(SimsClass record);

    List<SimsClass> selectByExample(SimsClassExample example);

    SimsClass selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsClass record, @Param("example") SimsClassExample example);

    int updateByExample(@Param("record") SimsClass record, @Param("example") SimsClassExample example);

    int updateByPrimaryKeySelective(SimsClass record);

    int updateByPrimaryKey(SimsClass record);
}