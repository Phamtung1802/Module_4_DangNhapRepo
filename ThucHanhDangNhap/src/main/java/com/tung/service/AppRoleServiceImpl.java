package com.tung.service;

import com.tung.repository.AppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AppRoleServiceImpl implements AppRoleService  {
    @Autowired
    private AppRoleRepository appRoleRepository;

}
