package com.tiobe.bean;
/**
* Title: UserBean
* Description: 
* Team: SSflow
* @author Ss
* @date 2017年1月6日
*
*/
public class UserBean {
	private String name;
	private String password;
	private String lastlogintime;
	private String status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
