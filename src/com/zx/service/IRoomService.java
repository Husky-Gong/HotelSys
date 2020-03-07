package com.zx.service;

import com.zx.domain.Room;

import java.util.List;

public interface IRoomService {
    List<Room> queryList(String hotelName);

    void delete(String id);

    void add(Room room);

}
