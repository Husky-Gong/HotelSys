package com.zx.service.impl;

import com.zx.domain.Room;
import com.zx.mapper.RoomMapper;
import com.zx.service.IRoomService;
import com.zx.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoomServiceImpl implements IRoomService {
    /*
    Use mybatis to search
     */
    @Override
    public List<Room> queryList(String hotelName) {
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        RoomMapper roomMapper = SqlSessionUtil.getSqlSession().getMapper(RoomMapper.class);
        roomMapper.selectList(hotelName);
        List<Room> rooms = roomMapper.selectList(hotelName);
        sqlSession.close();
        return rooms;
    }

    @Override
    public void deleteByPrimaryKey(String id) {
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        System.out.println(id);
        roomMapper.deleteByPrimaryKey(Integer.parseInt(id));
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void add(Room room) {
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        roomMapper.insert(room);
        sqlSession.commit();
        sqlSession.close();
    }


}
