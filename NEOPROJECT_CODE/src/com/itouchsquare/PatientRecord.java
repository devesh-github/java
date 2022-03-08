package com.itouchsquare;

public class PatientRecord 
{
	private String Patient_record_id;
	private String Patient_id;
	private String Hospital_id;
	private String Admission_date;	
	private String Medical_condition;
	private String complication;
	private String treatment_mode;
	private String Medication;
	private String muternal;
	private String treatment_duration;
	private String created_by;
	private String created_on;
	private String last_modified_by;
	private String last_modified_date;
	
	public String getPatient_record_id() {
		return Patient_record_id;
	}
	public void setPatient_record_id(String patientRecordId) {
		Patient_record_id = patientRecordId;
	}
	public String getPatient_id() {
		return Patient_id;
	}
	public void setPatient_id(String patientId) {
		Patient_id = patientId;
	}
	public String getHospital_id() {
		return Hospital_id;
	}
	public void setHospital_id(String hospitalId) {
		Hospital_id = hospitalId;
	}
	public String getAdmission_date() {
		return Admission_date;
	}
	public void setAdmission_date(String admissionDate) {
		Admission_date = admissionDate;
	}
	public String getMedical_condition() {
		return Medical_condition;
	}
	public void setMedical_condition(String medicalCondition) {
		Medical_condition = medicalCondition;
	}
	public String getComplication() {
		return complication;
	}
	public void setComplication(String complication) {
		this.complication = complication;
	}
	public String getTreatment_mode() {
		return treatment_mode;
	}
	public void setTreatment_mode(String treatmentMode) {
		treatment_mode = treatmentMode;
	}
	public String getMedication() {
		return Medication;
	}
	public void setMedication(String medication) {
		Medication = medication;
	}
	public String getMuternal() {
		return muternal;
	}
	public void setMuternal(String muternal) {
		this.muternal = muternal;
	}
	public String getTreatment_duration() {
		return treatment_duration;
	}
	public void setTreatment_duration(String treatmentDuration) {
		treatment_duration = treatmentDuration;
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
	public String getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(String lastModifiedDate) {
		last_modified_date = lastModifiedDate;
	}
	
	
}
