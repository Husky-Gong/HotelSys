package com.zx.mapper;

import com.zx.domain.Hotel;

import java.util.List;

public interface HotelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);

    List<Hotel> selectList();
}