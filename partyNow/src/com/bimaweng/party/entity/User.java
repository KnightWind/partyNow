package com.bimaweng.party.entity;

import java.util.Date;

/**
 * @desc 
 * @author knight wang
 * @date 2013-6-24
 */
public class User {
	
	private int userId;
	
	private String username;
	
	private String alias;
	
	private String password;
	
	private String phoneNumber;
	
	private String email;
	
	private int gender;
	
	private Date birthDay;
	
	private String avatarUrl;
	
	private String regsiterTime;
	
	private int isErased;
	
	private Date erasedTime;
	
	private int erasePeople;
	
	private String idCard;
	
	private int registerType;
	
	private String realName;
	
	
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getRegsiterTime() {
		return regsiterTime;
	}

	public void setRegsiterTime(String regsiterTime) {
		this.regsiterTime = regsiterTime;
	}

	public int getIsErased() {
		return isErased;
	}

	public void setIsErased(int isErased) {
		this.isErased = isErased;
	}

	public Date getErasedTime() {
		return erasedTime;
	}

	public void setErasedTime(Date erasedTime) {
		this.erasedTime = erasedTime;
	}

	public int getErasePeople() {
		return erasePeople;
	}

	public void setErasePeople(int erasePeople) {
		this.erasePeople = erasePeople;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getRegisterType() {
		return registerType;
	}

	public void setRegisterType(int registerType) {
		this.registerType = registerType;
	}
	
	
	
	
	
}
