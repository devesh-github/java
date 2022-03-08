package com.itouchsquare;


import java.sql.Timestamp;


public class Patient 
{
	private String patient_ID;
	private String hospital_reg_code;
	private String gender;
	private String patient_firstname;
	private String patient_lastname;
	private String patient_dob;
	private String patient_height;
	private String patient_weight;
	private String patient_phone_number;
	private String patient_email;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_date;
	
	public String getPatient_ID() {
		return patient_ID;
	}
	public void setPatient_ID(String patientID) {
		patient_ID = patientID;
	}
	
	
	
	public String getHospital_reg_code() {
		return hospital_reg_code;
	}
	public void setHospital_reg_code(String hospitalRegCode) {
		hospital_reg_code = hospitalRegCode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPatient_firstname() {
		return patient_firstname;
	}
	public void setPatient_firstname(String patientFirstname) {
		patient_firstname = patientFirstname;
	}
	public String getPatient_lastname() {
		return patient_lastname;
	}
	public void setPatient_lastname(String patientLastname) {
		patient_lastname = patientLastname;
	}
	
	public String getPatient_height() {
		return patient_height;
	}
	public void setPatient_height(String patientHeight) {
		patient_height = patientHeight;
	}
	public String getPatient_weight() {
		return patient_weight;
	}
	public void setPatient_weight(String patientWeight) {
		patient_weight = patientWeight;
	}
	
	public String getPatient_phone_number() {
		return patient_phone_number;
	}
	public void setPatient_phone_number(String patientPhoneNumber) {
		patient_phone_number = patientPhoneNumber;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patientEmail) {
		patient_email = patientEmail;
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
	public String getPatient_dob() {
		return patient_dob;
	}
	public void setPatient_dob(String patientDob) {
		patient_dob = patientDob;
	}
	
}
