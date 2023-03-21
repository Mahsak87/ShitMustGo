package com.helpwithrecycling.helpwithrecycling.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "garbage")
public final class Garbage extends BaseEntity {

    @Column(name = "garbage_name", length = 100, nullable = false)
    private String name;

    @Column(name = "garbage_weight")
    private Integer weight;

    @Lob
    @Column(name = "garbage_image")
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Users customer;

    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private Users driver;

    @Column(name = "garbage_lat", nullable = false)
    private int lat;

    @Column(name = "price", nullable = false)
    private long price = 0;

    @Column(name = "garbage_lng", nullable = false)
    private int lng;

    @Column(name = "garbage_address", length = 500)
    private String address;

    @Column(name = "garbage_size", nullable = false)
    private int size;

    public Garbage() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Users getCustomer() {
        return customer;
    }

    public void setCustomer(Users customer) {
        this.customer = customer;
    }

    public Users getDriver() {
        return driver;
    }

    public void setDriver(Users driver) {
        this.driver = driver;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
