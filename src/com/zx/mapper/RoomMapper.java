package com.zx.mapper;

import com.zx.domain.Room;

import java.util.List;

public interface RoomMapper {
    List<Room> selectList(@Param("hotelName") String hotelName);

    int delete(@Param("id") String id);

    int insert(Room room);

}
