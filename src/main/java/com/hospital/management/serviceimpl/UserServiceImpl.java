package com.hospital.management.serviceimpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.management.entity.User;
import com.hospital.management.repository.UserRepository;
import com.hospital.management.service.UserService;
import com.hospital.management.userdto.UserDto;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;


	@Override
	public String addUser(UserDto dto) {
		 User user = userRepository.findByEmail(dto.getEmail());
		 if(Objects.nonNull(user)) {
			 return "user exist";
		 }
		 else {
			 
			 user= new User();
			 user.setUserFirstName(dto.getFirstName());
			 user.setUserLastName(dto.getLastName());
			 user.setAddress(dto.getAddress());
			 user.setMobileNo(dto.getMobileno());
			 user.setEmail(dto.getEmail());
			 user.setPassword(dto.getPassword());
			 userRepository.save(user);
			 
			 return "User Added Successfully";
		 }
		
		 	 
	}
	
	
	
	

}
