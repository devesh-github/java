package com.itouchsquare;

import java.sql.Date;

public class HospitalDataEntry
{
	private String hospital_id;
	private String reg_code;
	private String hospital_name;
	private String hospital_region;
	private String hospital_zone;	
	private String hospital_phone;
	private String hospital_email;
	
	
	private String created_by;
	private String created_on;
	private String last_modified_by;
	private Date   last_modified_date;
	
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String createdBy) {
		created_by = createdBy;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String createdOn) {
		created_on = createdOn;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String lastModifiedBy) {
		last_modified_by = lastModifiedBy;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date lastModifiedDate) {
		last_modified_date = lastModifiedDate;
	}
	public String getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(String hospitalId) {
		hospital_id = hospitalId;
	}
	public String getReg_code() {
		return reg_code;
	}
	public void setReg_code(String regCode) {
		reg_code = regCode;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospitalName) {
		hospital_name = hospitalName;
	}
	public String getHospital_zone() {
		return hospital_zone;
	}
	public void setHospital_zone(String hospitalZone) {
		hospital_zone = hospitalZone;
	}
	public String getHospital_region() {
		return hospital_region;
	}
	public void setHospital_region(String hospitalRegion) {
		hospital_region = hospitalRegion;
	}
	public String getHospital_phone() {
		return hospital_phone;
	}
	public void setHospital_phone(String hospitalPhone) {
		hospital_phone = hospitalPhone;
	}
	public String getHospital_email() {
		return hospital_email;
	}
	public void setHospital_email(String hospitalEmail) {
		hospital_email = hospitalEmail;
	}
	
	

}
