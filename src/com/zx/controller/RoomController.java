package com.zx.controller;

import cn.hutool.core.util.StrUtil;
import com.zx.domain.Hotel;
import com.zx.domain.Room;
import com.zx.service.IHotelService;
import com.zx.service.IRoomService;
import com.zx.service.impl.HotelServiceImpl;
import com.zx.service.impl.RoomServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@WebServlet
public class RoomController extends HttpServlet {

    IRoomService roomService = new RoomServiceImpl();
    IHotelService hotelService = new HotelServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String service = req.getParameter("service");
        try {
            Method method=this.getClass().getDeclaredMethod(service,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        String hotelName = req.getParameter("hotelName");
        if(StrUtil.isNotBlank(hotelName)){
            req.setAttribute("hotelName",hotelName);
        }
        List<Room> rooms=roomService.queryList(hotelName);
        req.setAttribute("rooms",rooms);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }

    public void toAdd(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        List<Hotel> hotels=hotelService.queryAll();
        req.setAttribute("hotels",hotels);
        req.getRequestDispatcher("add.jsp").forward(req,resp);
    }

    public void doAdd(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String hotelId = req.getParameter("hotelId");
        String info = req.getParameter("info");
        Room room = new Room();
        room.setHotelId(Integer.parseInt(hotelId));
        room.setPrice(Integer.parseInt(price));
        room.setType(Integer.parseInt(type));
        room.setInfo(info);
        roomService.add(room);
        resp.sendRedirect("room.do?service=list");
    }
}
