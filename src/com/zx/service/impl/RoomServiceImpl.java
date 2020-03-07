package com.zx.service.impl;

import com.zx.domain.Room;
import com.zx.mapper.RoomMapper;
import com.zx.service.IRoomService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoomServiceImpl implements IRoomService {
    @Override
    public List<Room> queryList(String hotelName) {
        SqlSession sqlSession = sqlSessionUtil.getSqlSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        List<Room> rooms = roomMapper.selectList(hotelName);
        return rooms;
    }

    @Override
    public void delete(String id) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        roomMapper.delete(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void add(Room room) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        roomMapper.insert(room);
        sqlSession.commit();
        sqlSession.close();
    }
}
