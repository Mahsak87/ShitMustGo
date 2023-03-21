package com.helpwithrecycling.helpwithrecycling.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chats")
public final class Chats extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Users customer;

    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private Users driver;

    @Column(name = "chat_message", length = 9999, columnDefinition = "text")
    private String message;

    public Chats() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
