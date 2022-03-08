package com.itouchsquare;

import java.sql.Date;

public class NeoAddress 
{
	
	private String a_id;
	private String add_line1;
	private String add_line2;
	private String add_line3;
	private String city;
	private String zip_code;
	private String state;
	private String country;
	
	private String created_by;
	private String created_on;
	private String last_modified_by;
	private Date last_modified_date;
	private String referenceid;
	
	public String getReferenceid() {
		return referenceid;
	}
	public void setReferenceid(String referenceid) {
		this.referenceid = referenceid;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date lastModifiedDate) {
		last_modified_date = lastModifiedDate;
	}
	public String getAdd_line1() {
		return add_line1;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String aId) {
		a_id = aId;
	}
	public void setAdd_line1(String addLine1) {
		add_line1 = addLine1;
	}
	public String getAdd_line2() {
		return add_line2;
	}
	public void setAdd_line2(String addLine2) {
		add_line2 = addLine2;
	}
	public String getAdd_line3() {
		return add_line3;
	}
	public void setAdd_line3(String addLine3) {
		add_line3 = addLine3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zipCode) {
		zip_code = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
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
	
	
}
