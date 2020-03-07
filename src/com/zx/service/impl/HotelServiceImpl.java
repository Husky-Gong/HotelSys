package com.zx.service.impl;

import com.zx.domain.Hotel;
import com.zx.service.IHotelService;

import java.util.List;

public class HotelServiceImpl implements IHotelService {
    @Override
    public List<Hotel> queryAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        HotelMapper hotelMapper = sqlSession.getMapper(HotelMapper.class);
        List<Hotel> hotels = hotelMapper.selectAll();
        sqlSession.close();
        return hotels;
    }
}
