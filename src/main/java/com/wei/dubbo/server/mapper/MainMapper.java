package com.wei.dubbo.server.mapper;

import java.util.List;

import com.wei.dubbo.core.model.Main;

public interface MainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Main record);

    int insertSelective(Main record);

    Main selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Main record);

    int updateByPrimaryKey(Main record);
    
    List<Main> selectAllList();
    
}