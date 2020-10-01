package com.tung.service;

import com.tung.model.AppRole;
import com.tung.model.AppUser;
import com.tung.repository.AppRoleRepository;
import com.tung.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class AppUserServiceImpl implements AppUserService, UserDetailsService {
    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public AppUser findByUserName(String username) {
      return appUserRepository.findByUserName(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser myUser = appUserRepository.findByUserName(username);
        List<AppRole> myRole = new ArrayList<AppRole>();
        myRole.add(myUser.getRole());

        User user = new User(myUser.getUserName(), myUser.getPassword(), myRole);
        return user;
    }
}