package com.zx.domain;

import java.util.Objects;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private String mobile;

    /**
     * @param id :id
     * @param name : name
     * @param address : address
     * @param mobile : mobile
     */
    public Hotel(int id, String name, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return id == hotel.id &&
                Objects.equals(name, hotel.name) &&
                Objects.equals(address, hotel.address) &&
                Objects.equals(mobile, hotel.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, mobile);
    }
}
