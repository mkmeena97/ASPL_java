package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.AppUser;
import com.example.demo.repositories.AppUserRepository;

@Service
public class AuthService {
	
	private final AppUserRepository userAppUserRepository;
	
	public AuthService(AppUserRepository userAppUserRepository) {
		this.userAppUserRepository = userAppUserRepository;
	}

	public AppUser saveUser(AppUser user) {
		// TODO Auto-generated method stub
		return userAppUserRepository.save(user);
	}

}
