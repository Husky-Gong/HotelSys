package com.zx.service.impl;

import com.zx.domain.Hotel;
import com.zx.mapper.HotelMapper;
import com.zx.service.IHotelService;
import com.zx.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HotelServiceImpl implements IHotelService {
    @Override
    public List<Hotel> selectAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        HotelMapper hotelMapper = sqlSession.getMapper(HotelMapper.class);
        List<Hotel> hotels = hotelMapper.selectList();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        for(Hotel h:hotels){
            System.out.println(h);
        }
        sqlSession.close();
        return hotels;
    }
}
