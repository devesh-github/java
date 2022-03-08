package com.itouchsquare;

import java.security.Timestamp;

public class Login 
{	
	private String login_ID;
	private String login_PWD;
	private String usr_user_Id;
	private String hos_reg_ID;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_date;
	
	public String getLogin_ID() {
		return login_ID;
	}
	public void setLogin_ID(String loginID) {
		login_ID = loginID;
	}
	public String getLogin_PWD() {
		return login_PWD;
	}
	public void setLogin_PWD(String loginPWD) {
		login_PWD = loginPWD;
	}
	
	public String getUsr_user_Id() {
		return usr_user_Id;
	}
	public void setUsr_user_Id(String usrUserId) {
		usr_user_Id = usrUserId;
	}
	public String getHos_reg_ID() {
		return hos_reg_ID;
	}
	public void setHos_reg_ID(String hosRegID) {
		hos_reg_ID = hosRegID;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String createdBy) {
		created_by = createdBy;
	}
	public Timestamp getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Timestamp createdOn) {
		created_on = createdOn;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String lastModifiedBy) {
		last_modified_by = lastModifiedBy;
	}
	public Timestamp getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Timestamp lastModifiedDate) {
		last_modified_date = lastModifiedDate;
	}
	
}
