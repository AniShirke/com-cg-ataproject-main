package com.cg.ataproject.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "userEmail")
	private String userEmail;

    @JsonFormat(pattern="mm-dd-yyyy")
	private Date userDob;
	  
//	@Column(name = "userDob")
//	private String userDob;

	@Column(name = "userMobileNo")
	private long userMobileNo;

	@Column(name = "userAddress")
	private String userAddress;

	@Column(name = ("userGender"))
	private String userGender;
	
	
	
	

	public User() {
		super();

	}

	public User(int userId, String userName, String userEmail, Date userDob, long userMobileNo, String userAddress,
			String userGender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobileNo = userMobileNo;
		this.userAddress = userAddress;
		this.userGender = userGender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userDob=" + userDob
				+ ", userMobileNo=" + userMobileNo + ", userAddress=" + userAddress + ", userGender=" + userGender
				+ "]";
	}

}
