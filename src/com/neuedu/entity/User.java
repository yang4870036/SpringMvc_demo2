package com.neuedu.entity;

public class User {
private String username;
private String password;
private String email;
private String age;
private Address address;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", email="
			+ email + ", age=" + age + ", line=" + address.getLine() +",city=" + address.getCity() +",province=" + address.getProvince() +"]";
	
}



}
