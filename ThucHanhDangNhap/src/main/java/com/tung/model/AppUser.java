package com.tung.model;

import javax.persistence.*;


@Entity
@Table(name = "app_users")
public class AppUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column
    private String password;

    public AppUser() {
    }

    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppRole role;

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole appRole) {
        this.role = appRole;
    }

    public AppUser(String userName, String address) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }


}
