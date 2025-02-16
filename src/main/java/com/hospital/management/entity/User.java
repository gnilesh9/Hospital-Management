package com.hospital.management.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable{


private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;

@Column(name = "firstName",length = 15 , nullable = false)
private String userFirstName;

@Column(name = "lastName", length = 20 ,nullable = false)
private String userLastName;

@Column(name = "address", length = 100)
private String address;

@Column(name = "mobile", length = 10 ,nullable = false)
private int mobileNo;

@Column(name = "email", length = 50 ,nullable = false)
private String email;

@Column(name = "password", length = 50 ,nullable = false)
private String password;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserFirstName() {
	return userFirstName;
}

public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}

public String getUserLastName() {
	return userLastName;
}

public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getMobileNo() {
	return mobileNo;
}

public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
			+ ", address=" + address + ", mobileNo=" + mobileNo + ", email=" + email + ", password=" + password
			+ "]";
}

}
