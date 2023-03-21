package com.helpwithrecycling.helpwithrecycling.data.entity;

import com.helpwithrecycling.helpwithrecycling.data.enums.UserType;
import jakarta.persistence.*;
import org.hibernate.annotations.Where;

import java.util.List;

@Entity
@Table(name = "users")
public final class Users extends BaseEntity {

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type", nullable = false, length = 50)
    private UserType userType;

    @OneToMany(fetch = FetchType.LAZY)
    @Where(clause = "user_type = 'DRIVER'")
    private List<Garbage> garbage;

    @ManyToMany
    private List<Chats> chats;

    public Users() {
        super();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Garbage> getGarbage() {
        return garbage;
    }

    public void setGarbage(List<Garbage> garbage) {
        this.garbage = garbage;
    }

    public List<Chats> getChats() {
        return chats;
    }

    public void setChats(List<Chats> chats) {
        this.chats = chats;
    }
}
