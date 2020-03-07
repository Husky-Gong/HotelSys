package com.zx.mapper;

import com.zx.domain.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer id);

    /*
    Search rooms with hotel name
     */
    List<Room> selectList(@Param("hotelName") String hotelName);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

}