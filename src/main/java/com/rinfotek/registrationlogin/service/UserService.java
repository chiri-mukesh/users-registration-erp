package com.rinfotek.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rinfotek.registrationlogin.model.User;
import com.rinfotek.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
