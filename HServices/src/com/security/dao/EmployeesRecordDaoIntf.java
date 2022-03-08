package com.security.dao;

import java.util.List;

import com.security.dao.common.GenericDaoIntf;
import com.security.entity.Employee;

public interface EmployeesRecordDaoIntf extends GenericDaoIntf<Employee> {
	
	public Employee getEmployeeRecordForEmpNO(Long empNO);
	//public List<RepresentativeRecordAcode> getPCEHRRecordForRecIDAndNomName(Long recordId,String nomineename);
	//public List<Object[]> getPCEHRRecordDetails(Long recordId);
	//public List<PcehrRecord> getPCEHRRecordForRecordIdDOB(Long recordId,Date dob);
	//public int updateEmployeeRecord(Long recordId);
	
	
	//HSQL
	/*SQL_RETRIEVE_AC_DETAILS - INNER JOIN PCEHR_RECORD
	SQL_RETRIVE_RECORD_LIST - INNER JOIN PCEHR_RECORD
	SQL_RETRIVE_PCEHR_RECORD_DETAILS - INNER JOIN
	SQL_COMPARE_DOB
	SQL_SEARCH_PCEHR_RECORD - INNER JOIN
	SQL_CONSENT_FOR_DEMOGRAPHICS - INNER JOIN
	SQL_CONSENT_FOR_DEMOGRAPHICS_IHI - INNER JOIN
	SQL_HAS_PARENT_AND_DOB_GRT_18 - INNER JOIN*/
	
	//UPDATE
	/*SQL_UPDATE_PCEHRRECORD_STATUS
	SQL_UPDATE_PACC_PACCX*/
	
	//Record from 2 tables
	/*SQL_RETRIEVE_PCEHR_DETAILS
	SQL_COMPARE_DOB*/
	
}
