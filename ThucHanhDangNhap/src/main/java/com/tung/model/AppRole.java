package com.tung.model;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.List;

@Entity
@Table(name = "app_roles")
public class AppRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(targetEntity = AppUser.class)
    private List<AppUser> appUsers;

    public AppRole() {
    }

    @Override
    public String getAuthority() {
        return this.name;
    }

    public AppRole(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AppUser> getCustomers() {
        return appUsers;
    }

    public void setCustomers(List<AppUser> customers) {
        this.appUsers = appUsers;
    }
}

