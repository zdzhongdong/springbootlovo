package com.lovo.mybatis.mapper;

import com.lovo.model.sutEntity;

public interface sutEntityMapper {
    int deleteByPrimaryKey(String stuid);

    int insert(sutEntity record);

    int insertSelective(sutEntity record);

    sutEntity selectByPrimaryKey(String stuid);

    int updateByPrimaryKeySelective(sutEntity record);

    int updateByPrimaryKey(sutEntity record);
}