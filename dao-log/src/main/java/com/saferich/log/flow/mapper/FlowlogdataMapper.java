package com.saferich.log.flow.mapper;

import com.saferich.log.flow.model.Flowlogdata;
import com.saferich.log.flow.model.FlowlogdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowlogdataMapper {
    int countByExample(FlowlogdataExample example);

    int deleteByExample(FlowlogdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Flowlogdata record);

    int insertSelective(Flowlogdata record);

    List<Flowlogdata> selectByExample(FlowlogdataExample example);

    Flowlogdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flowlogdata record, @Param("example") FlowlogdataExample example);

    int updateByExample(@Param("record") Flowlogdata record, @Param("example") FlowlogdataExample example);

    int updateByPrimaryKeySelective(Flowlogdata record);

    int updateByPrimaryKey(Flowlogdata record);
}