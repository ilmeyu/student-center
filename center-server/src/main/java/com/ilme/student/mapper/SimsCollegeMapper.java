package com.ilme.student.mapper;

import com.ilem.domain.SimsCollege;
import com.ilme.student.model.SimsCollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimsCollegeMapper {
    long countByExample(SimsCollegeExample example);

    int deleteByExample(SimsCollegeExample example);

    int deleteByPrimaryKey(String id);

    int insert(SimsCollege record);

    int insertSelective(SimsCollege record);

    List<SimsCollege> selectByExample(SimsCollegeExample example);

    SimsCollege selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SimsCollege record, @Param("example") SimsCollegeExample example);

    int updateByExample(@Param("record") SimsCollege record, @Param("example") SimsCollegeExample example);

    int updateByPrimaryKeySelective(SimsCollege record);

    int updateByPrimaryKey(SimsCollege record);
}