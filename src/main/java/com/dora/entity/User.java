package com.dora.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userd")
public class User {

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  @Column(unique = true)
  private String email;
  private String phone;
  private String password;
  private String quili;
  private String gender;
  private String dob;
  private String address;
  private String skill;
  private String summary;
public User(int id, String name, String email, String phone, String password, String quili, String gender, String dob,
		String address, String skill, String summary) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.password = password;
	this.quili = quili;
	this.gender = gender;
	this.dob = dob;
	this.address = address;
	this.skill = skill;
	this.summary = summary;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getQuili() {
	return quili;
}
public void setQuili(String quili) {
	this.quili = quili;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
			+ ", quili=" + quili + ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", skill=" + skill
			+ ", summary=" + summary + "]";
}
  
}
