package com.tung.repository;

import com.tung.model.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AppUserRepository extends PagingAndSortingRepository<AppUser, Long> {
    public AppUser findByUserName(String username);
}