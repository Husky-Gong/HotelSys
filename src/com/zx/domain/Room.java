package com.zx.domain;

public class Room {
    private int id;
    private int type;
    private int price;
    private String info;
    private int hotelId;
    private String hotelName;
    private String address;
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Room(int id, int type, int price, String info, int hotelId, String hotelName, String address, String mobile) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.info = info;
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", type=" + type +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public Room() {
    }
}
