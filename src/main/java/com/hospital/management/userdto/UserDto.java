package com.hospital.management.userdto;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto {
	
@NonNull
private String firstName;

@NonNull
private String lastName;


private String address;

@NotNull
private Integer mobileno;

@NotNull
private String email;

@NotNull
private String password;

}
