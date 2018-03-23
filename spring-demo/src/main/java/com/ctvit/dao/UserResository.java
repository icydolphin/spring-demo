package com.ctvit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctvit.entity.TUser;

public interface UserResository extends JpaRepository<TUser, String> {

}
