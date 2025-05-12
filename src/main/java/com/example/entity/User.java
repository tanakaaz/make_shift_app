package com.example.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class User{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @column(nullable = false,unique = true)
    private String username;
    @column(nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}