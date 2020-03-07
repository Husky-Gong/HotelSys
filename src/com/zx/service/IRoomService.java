package com.zx.service;

/*
Room method
 */

import com.zx.domain.Room;

import java.util.List;

public interface IRoomService {
    // search rooms with hotel name
    List<Room> queryList(String hotelName);
}
