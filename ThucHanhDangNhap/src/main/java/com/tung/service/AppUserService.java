package com.tung.service;

import com.tung.model.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AppUserService  {
    public AppUser findByUserName(String username);
}