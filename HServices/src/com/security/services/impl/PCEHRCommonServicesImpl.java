/**
 * 
 */
package com.security.services.impl;



import java.io.BufferedReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.security.services.PCEHRCommonServicesIntf;

/**
 * @author r.kachinatte.ramatpa
 *
 */
public class PCEHRCommonServicesImpl implements PCEHRCommonServicesIntf {
	
	/*private static final Logger LOGGER = Logger.getLogger(PCEHRCommonServicesImpl.class);
	private PcehrIdentityDaoIntf pcehrIdentityDao =null;
	private AChangeNotificationRelationDaoIntf changeNotifiDAO =null;
	public PcehrRecordDaoIntf pcehrRecordDao =null;
	private IdentityRecordRelationshipDaoIntf irrDao =null;
	private PcehrIdentity pcehrIdentity  =null;
	private MedicareConsentsRelationshipDaoIntf medicareDao =null;
	private IdentityRecordRelationshipDaoIntf irrDAO =null;
	private PcehrRecord pcehrRecord  =null;
	private TermsAndConditionDaoIntf tcDao =null;
    public static int commitStatus = 0; //0 means no commit in progress. if 1 - commit in progress by some method. Implemented for JMS purpose
    //private CommonUtil CommonUtil;
    private EcncontactRecordRelationshipDaoIntf ecnDAO =null;
    
	public PCEHRCommonServicesImpl() {
		pcehrIdentityDao = new PcehrIdentityDaoImpl(null);
		pcehrRecordDao = new PcehrRecordDaoImpl(null);
		irrDao = new IdentityRecordRelationshipDaoImpl(null);
		medicareDao =new MedicareConsentsRelationshipDaoImpl(null);
		ecnDAO =new EcncontactRecordRelationshipDaoImpl(null);
		changeNotifiDAO = new AChangeNotificationRelationDaoImpl(null);
		irrDAO =new IdentityRecordRelationshipDaoImpl(null);
		tcDao =new TermsAndConditionDaoImpl(null);
	}
	
	private static StringBuilder clobToString(Clob data) {
		 System.out.println("clobToString "+data);
		 StringBuilder sb = new StringBuilder();
		 String line =null;
		 try {         
			 Reader reader = data.getCharacterStream();         
			 BufferedReader br = new BufferedReader(reader);          
			          
			 while(null != (line = br.readLine())) {             
				 sb.append(line);         
				 }         
			 br.close();  
			
			 } 
		 catch (Exception e) {
			 e.printStackTrace();
			  
			 }
		 
		 return sb;

	 }
	public List<TermsAndConditon> getTermsConditions(){
		StringBuilder tcContent =null;
		Long maxTCVersion =tcDao.getMaxTCVersion();
		List<TermsAndConditon>  tcList =tcDao.getTermsAndConditions(maxTCVersion);
	 
		return tcList;
		
	}
	
	public String getRelationshipRole(Long userID, Long recordID) throws PCEHRSecurityException {
		//PAServiceDAOIntf paServDao = PAServiceDAOImpl.getInstance();
		String role = null;
		boolean isActiveAuthRelExist = false;
		boolean isActiveSelfRelExist = false;
		SystemUtils systemUtils =SystemUtils.getInstance();
		List<IdentityRecordRelationship> irrList =null;
		
		List<Long> validAuthRelTypes = new ArrayList<Long>();
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.parent")));
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.legallyAppointedAuthRep")));
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.guardian")));
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.authRepresentative")));
		
		LOGGER.debug("userID : " +userID+ " recordID : "+recordID);
		
		if (userID != null && recordID != null) {
			irrList =irrDAO.getIdentityRecRel(userID,recordID,SecurityConstants.RELATIONSHIP_STATUS_ID);
			Long lRole =null;
			if(irrList!=null &&irrList.size()>0){
				
			}
			//Long lRole = paServDao.getRelationshipType(userID.toString(),recordID);
			LOGGER.debug("lRole : "+lRole);
			LOGGER.debug("validAuthRelTypes.contains(lRole) : " +validAuthRelTypes.contains(lRole));
			if (lRole != null && (validAuthRelTypes.contains(lRole))) {
				role = SystemUtils.getInstance().getProperty("osb.element.user.role.authrep");
			}		
		} else if (recordID != null) {
			List<Long> relationshipTypeIdValues =new ArrayList();
			relationshipTypeIdValues.add(Long.valueOf(systemUtils.getProperty("db.pcehr.relTypeID.parent")));
			relationshipTypeIdValues.add(Long.valueOf(systemUtils.getProperty("db.pcehr.relTypeID.legallyAppointedAuthRep")));
			relationshipTypeIdValues.add(Long.valueOf(systemUtils.getProperty("db.pcehr.relTypeID.guardian")));
			irrList =irrDAO.getIdentityRecRelForRecIdRelTIdValRelSId(recordID,relationshipTypeIdValues,SecurityConstants.RELATIONSHIP_STATUS_ID);
			//isActiveAuthRelExist = paServDao.isActiveAuthRelExist(recordID);				
			//LOGGER.debug("isActiveAuthRelExist : " );
			
			if(irrList!=null&&irrList.size()>0) {
				role = systemUtils.getProperty("osb.element.user.role.authrep");
			} else {
				//isActiveSelfRelExist = paServDao.isActiveSelfRelExist(recordID);
				relationshipTypeIdValues =new ArrayList();
				relationshipTypeIdValues.add(Long.valueOf(systemUtils.getProperty("db.pcehr.relTypeID.selfAccess")));
				irrList = irrDAO.getIdentityRecRelForRecIdRelTIdValRelSId(recordID,relationshipTypeIdValues,SecurityConstants.RELATIONSHIP_STATUS_ID);
				LOGGER.debug(" isActiveSelfRelExist : "+isActiveSelfRelExist);
				if (irrList!=null && irrList.size()>0) {
					role = SystemUtils.getInstance().getProperty("osb.element.user.role.Individual");
				}
			}
		}
		
		LOGGER.debug("role : "+role);
		return role;
	}


	*//**
	 * Private method used to create or update ecn attributes.
	 *
	 * @param ecnAttributes the ecn attributes
	 * @param recordID the record id
	 * @param isEcnListConsidered the is ecn list considered
	 * @return isEcnListConsidered, true if ecnAttributes is to be considered, else false
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public boolean createOrUpdateEcnAttributes(List<ECNAttributes> ecnAttributes, Long recordID, boolean isEcnListConsidered) throws PCEHRSecurityException {
		boolean isCreatedOrUpdated = false;
		Map<String, Object> resultData = new HashMap<String, Object>();
		if(isEcnListConsidered == true) {
		//	PAServiceDAOIntf serviceDAO = PAServiceDAOImpl.getInstance();
			List<EcncontactRecordRelationship> listInsert = new ArrayList<EcncontactRecordRelationship>();
			List<EcncontactRecordRelationship> listUpdate = new ArrayList<EcncontactRecordRelationship>();
			List<EcncontactRecordRelationship> listDeactivate = new ArrayList<EcncontactRecordRelationship>();
			
			boolean isAllECN = true;
			//List<ECNAttributes> dBEcnAttributes = serviceDAO.getECNAttributes(recordID,isAllECN);
			List<EcncontactRecordRelationship> dBEcnAttributes = ecnDAO.getECNdetails(recordID, isAllECN);
			Map<String,EcncontactRecordRelationship> dBMapEcnAttributes = new HashMap<String,EcncontactRecordRelationship>();
			Map<String,EcncontactRecordRelationship> dBRemMapEcnAttributes = new HashMap<String,EcncontactRecordRelationship>();
			if(dBEcnAttributes != null && !dBEcnAttributes.isEmpty()){
				LOGGER.info("Start of create or update  ECN Attributes");
				for(EcncontactRecordRelationship dBEcnAttr : dBEcnAttributes){
					String ecnKey = dBEcnAttr.getEcnContactType().getEcnContactTypeId()+dBEcnAttr.getEcnContactName();
					dBMapEcnAttributes.put(ecnKey,dBEcnAttr);
					dBRemMapEcnAttributes.put(ecnKey,dBEcnAttr);
				}
			}
			
			if(ecnAttributes == null || ecnAttributes.isEmpty()) {
				listDeactivate.addAll(new ArrayList<EcncontactRecordRelationship>(dBMapEcnAttributes.values()));
			} else {	
				Set<ECNAttributes> filteredECNAttributes = new HashSet<ECNAttributes>();
				LOGGER.debug("ECN List Before Filter : " + ecnAttributes);
				filteredECNAttributes.addAll(ecnAttributes);
				LOGGER.debug("ECN List After Filter : " + filteredECNAttributes);
				ecnAttributes.removeAll(ecnAttributes);
				LOGGER.debug("ECN List After removing : " + ecnAttributes);
				ecnAttributes.addAll(filteredECNAttributes);
				LOGGER.debug("ECN List After Filter : " + ecnAttributes);
				for (ECNAttributes ecnAttribute : ecnAttributes) {
					String ecnAttKey = ecnAttribute.getContactTypeID()+ecnAttribute.getContactName();
					EcncontactRecordRelationship dbECN = dBMapEcnAttributes.get(ecnAttKey);
		               if (dbECN == null) {
		                     listInsert.add(CommonUtil.converToEcnEntity(ecnAttribute));
		               } else {
		                     if(!ecnAttribute.equals(dbECN)){
		                            listUpdate.add(CommonUtil.converToEcnEntity(ecnAttribute));
			                     }else{
			                    	 LOGGER.debug("dbECN : " + dbECN);
			                    	 LOGGER.debug("dbECN.getContactStatus() : " + dbECN.getEcnStatus());
			                    	 if(dbECN.getEcnStatus()!=null && dbECN.getEcnStatus().equals(SystemUtils.getInstance().getProperty("db.pcehr.ecn.contact.status.disable"))){
			                    		 EcncontactRecordRelationship ecnAttr = new EcncontactRecordRelationship();
			                    		 //ecnAttr.setContactTypeID(dbECN.getContactTypeID());
			                    		 EcnContactType ecnContact = new EcnContactType();
			                    		 ecnContact.setEcnContactTypeId(dbECN.getEcnContactType().getEcnContactTypeId());
			                    		 ecnAttr.setEcnContactType(ecnContact);	
			                    		 //ecnAttr.setContactName(dbECN.getContactName());
			                    		 ecnAttr.setEcnContactName(dbECN.getEcnContactName());
			                    		 listUpdate.add(ecnAttr);
			                    	 }
			                     }
		                     String ecnDBKey = dbECN.getEcnContactType().getEcnContactTypeId()+dbECN.getEcnContactName();
		                     dBRemMapEcnAttributes.remove(ecnDBKey);
		               }
		        }
				LOGGER.debug("dBRemMapEcnAttributes : " + dBRemMapEcnAttributes);
				LOGGER.debug("dBMapEcnAttributes : " + dBMapEcnAttributes);
		        listDeactivate.addAll(new ArrayList<EcncontactRecordRelationship>(dBRemMapEcnAttributes.values()));
			}
	        
	        if(listInsert != null && !listInsert.isEmpty()){
	               for (EcncontactRecordRelationship insertECN : listInsert){
	            	   EcncontactRecordRelationship dbECN = ecnDAO.get(insertECN.getEcnContactId()) ;
	            	   //resultData = serviceDAO.createECN(CommonUtil.getECNAttributeMapForCreate(insertECN, recordID));
	            	   EcncontactRecordRelationship swappedEcnEntity =CommonUtil.swapEcnEntity(dbECN,insertECN);
	            	   if(swappedEcnEntity!=null){
	            	   ecnDAO.saveOrUpdateECN(swappedEcnEntity);
	            	   }
	            	   Boolean resSuccess = (Boolean) resultData.get(SystemUtils.getInstance().getProperty("pcehr.dml.success"));
		   			   Long resSeqId = (Long) resultData.get(SystemUtils.getInstance().getProperty("pcehr.seq.id"));
		   			   if(resSuccess != null){
		   				isCreatedOrUpdated = resSuccess.booleanValue();
		   			   }
    	   			   LOGGER.debug("ECN Contact ID: " + resSeqId);
		           }
	        }
	        
	        if(listUpdate != null && !listUpdate.isEmpty()){
	               for (EcncontactRecordRelationship updateECN : listUpdate){
	            	   updateECN.setEcnStatus(new BigDecimal(SystemUtils.getInstance().getProperty("db.pcehr.ecn.contact.status.enable")));
	            	   //isCreatedOrUpdated = serviceDAO.updateECN(CommonUtil.getECNAttributeMap(updateECN), recordID, updateECN.getContactTypeID(), updateECN.getContactName());
	            	   if(updateECN.getEcnContactId()!=0L){
	            		   ecnDAO.saveOrUpdateECN(updateECN);   
	            	   }
	               }
	        }
	        
	        if(listDeactivate != null && !listDeactivate.isEmpty()){
	               for (EcncontactRecordRelationship deactivateECN : listDeactivate){
	            	   deactivateECN.setEcnStatus(new BigDecimal((SystemUtils.getInstance().getProperty("db.pcehr.ecn.contact.status.disable"))));
	            	   //isCreatedOrUpdated = serviceDAO.updateECN(CommonUtil.getECNAttributeMap(deactivateECN), recordID, deactivateECN.getContactTypeID(), deactivateECN.getContactName());
	            	   if(deactivateECN.getEcnContactId()!=0L){
	            		   ecnDAO.saveOrUpdateECN(deactivateECN);   
	            	   }
	               }
	        }
		}
		LOGGER.info("End of create or update  ECN Attributes");
        return isCreatedOrUpdated;
	}
	*//**
	 * Private method that returns the authority having the max (start date or end date), from the input list of authorities.
	 *
	 * @param authorities the authorities
	 * @param dateType the date type
	 * @return AuthorityAttributes the max date and auth
	 *//*
	
	
	*//**
	 * Checks if is valid pcehr record.
	 * 
	 * @param recordID the record id
	 * @param recordStatus the record status
	 * @return true, if is valid pcehr record
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public boolean isValidPCEHRRecord(Long recordID, String recordStatus) throws PCEHRSecurityException {
		LOGGER.debug("recordID : " + recordID);
		LOGGER.debug("recordStatus : " + recordStatus);
		boolean isValidRecord = false;

		if (recordID != null && recordStatus != null && recordStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.record.status.active"))) {
			LOGGER.info("Start of IsValidPCEHRRecord");
			isValidRecord = true;
		}
		LOGGER.info("End of IsValidPCEHRRecord");
		return isValidRecord;
	}
	
	
	@Override
	public Map<String, Object> checkPCEHRIdentityExistence(Long userID) throws PCEHRSecurityException {
		Map<String, Object> pcehrIdentityMap = null;
		boolean isPCEHRIdentityExist = false;
		if(commitStatus==0) sendMsgToOSB(SecurityConstants.MESSAGE_STATUS_IN_PROGRESS, "checkPCEHRIdentityExistence");
		LOGGER.debug("userID value : " + userID);
		//ArrayList<Object[]> recList = DBOperations.get(SQL_DOES_PCEHR_IDENTITY_FOR_USERID_EXIST, userID);
		
		pcehrIdentity = (PcehrIdentity) pcehrIdentityDao.get(userID);
		if (pcehrIdentity != null) {
			pcehrIdentityMap = new HashMap<String, Object>();
			LOGGER.debug("pcehrIdentity found for userID : " + pcehrIdentity);
			isPCEHRIdentityExist = true;
			pcehrIdentityMap.put("isPCEHRIdentityExist", isPCEHRIdentityExist);
			pcehrIdentityMap.put("pcehrIdentity", pcehrIdentity);
		}
	    if(commitStatus==0) sendMsgToOSB(SecurityConstants.MESSAGE_STATUS_END, "checkPCEHRIdentityExistence END");
	    
		return pcehrIdentityMap;
	}
	
	*//**
     * Send msg to osb.
     *
     * @param messageStatus the message status
     * @param description the description
     *//*
    private void sendMsgToOSB(String messageStatus, String description){
         AuditLog.sendMessageToOSB(messageStatus,SecurityConstants.MESSAGE_SOURCCOMPONENT_PNA, SecurityConstants.MESSAGE_MSGLOGLEVEL_INFO, 
                                                               SecurityConstants.MESSAGE_CODE_PERMIT, description);        
    }

	@Override
	public Map<String, Object> checkPCEHRExistence(Long recordID) throws PCEHRSecurityException {
		Map<String, Object> pcehrRecordMap = null;
		boolean isPCEHRExist = false;
        if(commitStatus==0) sendMsgToOSB(SecurityConstants.MESSAGE_STATUS_IN_PROGRESS, "checkPCEHRExistence");
		LOGGER.debug("recordID value : " + recordID);
		//ArrayList<Object[]> recList = DBOperations.get(SQL_DOES_PCEHR_FOR_RECORDID_EXIST, recordID);

		pcehrRecord = (PcehrRecord) pcehrRecordDao.get(recordID);
		if (pcehrRecord != null) {
			pcehrRecordMap = new HashMap<String, Object>();
			LOGGER.debug("pcehrRecord found for recordID : " + pcehrRecord);
			isPCEHRExist = true;
			pcehrRecordMap.put("isPCEHRExist", isPCEHRExist);
			pcehrRecordMap.put("pcehrRecord", pcehrRecord);
		}
        if(commitStatus==0) sendMsgToOSB(SecurityConstants.MESSAGE_STATUS_END, "checkPCEHRExistence END");

		return pcehrRecordMap;
	}
	
	*//**
	 * Private method used to create or update consents.
	 *
	 * @param consents the consents
	 * @param recordID the record id
	 * @param userId the userId
	 * @param isConsentListConsidered the is consent list considered
	 * @return isConsentListConsidered, true if consentList is to be considered, else false
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
public  boolean createOrUpdateConsents(List<ConsentAttributes> consents, Long recordID, Long userId, boolean isConsentListConsidered) throws PCEHRSecurityException {
        
        boolean isCreatedOrUpdated = false;
        String dbConsentkey = null;
        String consentAttributeKey = null;
		   Map<String, Object> resultData = new HashMap<String, Object>();
        
        if(isConsentListConsidered == true && consents != null) {
			LOGGER.info("Start of create or update consents");
	      //   PAServiceDAOIntf serviceDAO = PAServiceDAOImpl.getInstance();
	         List<MedicareConsentsRelationship> listInsert = new ArrayList<MedicareConsentsRelationship>();
	         List<MedicareConsentsRelationship> listUpdate = new ArrayList<MedicareConsentsRelationship>();
	       
	         Date currentDate = Calendar.getInstance().getTime();
	         Long pcehrIdentityIhi = null;
	         Long aodrIdentityIhi = null;
	       
	        // Long relType = serviceDAO.getRelationshipType(userId.toString(), recordID);
	         IdentityRecordRelationship relList= irrDao.getIdentityRecRel(userId,recordID,SecurityConstants.relationship_Status_Id);
	         Long relType =null;
	         if(relList!=null){
	        	 relType =relList.getRelationshipType().getRelationshipTypeId();
	         }
	         LOGGER.debug("Relationship Type: " + relType);
	       
	         //Retrieve IHI for rec id
	         //Set both aodrIdentityIhi and pcehrIdentityIhi to recIhi
	         //Retrieve PI for RecId if consent type is AODR or if relType = self/LegAppAR/Guardian
	        // pcehrIdentityIhi = serviceDAO.getIHIForRecordId(recordID);
	         PcehrRecord pcehrRecord = pcehrRecordDao.get(recordID);
	         if(pcehrRecord!=null){
	        	 pcehrIdentityIhi =pcehrRecord.getDemographic().getIhi();
	         }
	         aodrIdentityIhi = pcehrIdentityIhi;
        
                    
          if(relType != null && !relType.equals(0)){
              if (relType.equals(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.parent")))){
                    //pcehrIdentityIhi =  serviceDAO.getIHIForUserId(userId);
            	  PcehrIdentity pcehrIdentity =  pcehrIdentityDao.get(userId);
            	  if(pcehrIdentity!=null){
            		  pcehrIdentityIhi =pcehrIdentity.getDemographic().getIhi();
            	  }
            	  
              }
          }
          LOGGER.debug("PCEHR Identity IHI: " + pcehrIdentityIhi);
              
          //List<ConsentAttributes> dbConsents = serviceDAO.getConsentAttributesForCreateOrUpdate(recordID);
          List<MedicareConsentsRelationship> dbConsents = medicareDao.getMedicareConsentsRelationshipDetails(recordID,null);
          Map<String,MedicareConsentsRelationship> dbMapConsents = new HashMap<String,MedicareConsentsRelationship>();
          if(dbConsents != null && !dbConsents.isEmpty()){
        	  Long concentType = null;
                 for(MedicareConsentsRelationship dbConsent:dbConsents){
                       //If consent type is ACIR, use only ConsentTypeID for dbConsentkey creation
                	 concentType =dbConsent.getMedicareConsentType().getConsentTypeId();
                	 String concentTypeStr= concentType.toString();
                       if(concentTypeStr.equals(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"))){
                             dbConsentkey = concentTypeStr;
                       } else {                   
                             dbConsentkey = concentTypeStr + dbConsent.getConsentGivenBy();
                       }
                       LOGGER.debug("dbConsentkey : " + dbConsentkey);
                       dbMapConsents.put(dbConsentkey,dbConsent);                       
                       LOGGER.debug("dbMapConsents Map : " + dbMapConsents);
                 }
          }
          
          
          for (ConsentAttributes consentAttribute : consents) {
              LOGGER.debug("Input consents : " + consentAttribute);
              LOGGER.debug("Input consents - Consent Type ID : " + consentAttribute.getConsentTypeID());
              //If consent type is AODR, set ConGiveBy = aodrIdentity, 
              //else set ConGiveBy = pcehrIdentity
                if(consentAttribute.getConsentTypeID().equals(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr")) && aodrIdentityIhi != null){
                    consentAttribute.setConsentGivenBy(aodrIdentityIhi.toString());
              } else {
                    consentAttribute.setConsentGivenBy(pcehrIdentityIhi.toString());
              }
              LOGGER.debug("Consent Given By after setting : " + consentAttribute.getConsentGivenBy());
              //If consent type is ACIR, use only ConsentTypeID for consentAttributeKey creation
                if(consentAttribute.getConsentTypeID().equals(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"))){
                    consentAttributeKey = consentAttribute.getConsentTypeID();
              } else {
                    consentAttributeKey = consentAttribute.getConsentTypeID() + consentAttribute.getConsentGivenBy();
              }
              LOGGER.debug("consentAttributeKey : " + consentAttributeKey);
              MedicareConsentsRelationship dbConsent = dbMapConsents.get(consentAttributeKey);
                 if (dbConsent == null) {
                       listInsert.add(CommonUtil.convertToMedicareConsents(consentAttribute));
                 } else {
                         LOGGER.debug("consentAttribute.equals(dbConsent) :: " + consentAttribute.equals(dbConsent));
                       if(!consentAttribute.equals(dbConsent)) {
                              listUpdate.add(CommonUtil.convertToMedicareConsents(consentAttribute));
                       }
                       LOGGER.debug("dbConsentkey : " + consentAttributeKey);
                       dbMapConsents.remove(consentAttributeKey);                           
                 }
          }                 
          
          if(listInsert != null && !listInsert.isEmpty()){
                 for (MedicareConsentsRelationship insertConsent : listInsert){
                             insertConsent.setCreatedDate(currentDate);
                             insertConsent.setLastUpdatedDate(currentDate);
                             LOGGER.debug("insertConsent.getConsentStatus() : " + insertConsent.getConsentStatus());
                             //resultData = serviceDAO.createConsent(CommonUtil.getConsentsAttributeMapForCreate(insertConsent, recordID));
                             medicareDao.saveOrUpdates(insertConsent);
                             Boolean resSuccess = (Boolean) resultData.get(SystemUtils.getInstance().getProperty("pcehr.dml.success"));
       		   			    Long resSeqId = (Long) resultData.get(SystemUtils.getInstance().getProperty("pcehr.seq.id"));
       		   			    if(resSuccess != null){
       		   				 isCreatedOrUpdated = resSuccess.booleanValue();
       		   			    }
           	   				LOGGER.debug("Consent ID: " + resSeqId);
                 }
          }
          
          if(listUpdate != null && !listUpdate.isEmpty()){
                 for (MedicareConsentsRelationship updateConsent : listUpdate){                          
                       updateConsent.setLastUpdatedDate(currentDate);
                       //if(updateConsent.getConsentTypeID().equals(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"))){
                       if((String.valueOf(updateConsent.getMedicareConsentType().getConsentTypeId()).equals(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir")))){
                             //isCreatedOrUpdated = serviceDAO.updateConsent(CommonUtil.getConsentsAttributeMap(updateConsent), recordID, Long.parseLong(updateConsent.getConsentTypeID()),null);
                    	   medicareDao.saveOrUpdates(updateConsent);
                       } else {
                             //isCreatedOrUpdated = serviceDAO.updateConsent(CommonUtil.getConsentsAttributeMap(updateConsent), recordID, Long.parseLong(updateConsent.getConsentTypeID()),updateConsent.getConsentGivenBy());
                    	   medicareDao.saveOrUpdates(updateConsent);
                       }
                 }
          }        
         
        }
        
		LOGGER.info("End of create or update consents");
    return isCreatedOrUpdated;
  }

	*//**
	 * Private method used to create or update accessnotification.
	 *
	 * @param accessNotifications the access notifications
	 * @param recordID the record id
	 * @param isAccessNListConsidered the is access n list considered
	 * @return isAccessNListConsidered, true if accessNotificationsList is to be considered, else false
	 * true, if successful
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
 public boolean createOrUpdateAccessnotification(List<AccessNotifcationAttributes> accessNotifications, Long recordID, boolean isAccessNListConsidered) throws PCEHRSecurityException {
	boolean isCreatedOrUpdated = false;
	Map<String, Object> resultData = new HashMap<String, Object>();
	if(isAccessNListConsidered == true) {
		List<AChangeNotificationRelation> accessNotifiReqEntity =CommonUtil.convertToAChangeNotification(accessNotifications);
		//PAServiceDAOIntf serviceDAO = PAServiceDAOImpl.getInstance();
		List<AChangeNotificationRelation> listInsert = new ArrayList<AChangeNotificationRelation>();
		List<AChangeNotificationRelation> listUpdate = new ArrayList<AChangeNotificationRelation>();
		List<AChangeNotificationRelation> listDeactivate = new ArrayList<AChangeNotificationRelation>();
        Date currentDate = Calendar.getInstance().getTime();
		
		//List<AccessNotifcationAttributes> dBAccessNotifcation = serviceDAO.getAccessNotifications(recordID);
        List<AChangeNotificationRelation> dBAccessNotifcation= changeNotifiDAO.getNotifcationsForRecordAndChannelId(recordID,SecurityConstants.channelId);
		Map<Long,AChangeNotificationRelation>  dBMapAccessNotifcation = new HashMap<Long,AChangeNotificationRelation>();
		Map<Long,AChangeNotificationRelation> dBRemMapAccessNotifcation = new HashMap<Long,AChangeNotificationRelation>();
		if(dBAccessNotifcation != null && !dBAccessNotifcation.isEmpty()){
			LOGGER.info("Start of create or update Access Notification");
			for(AChangeNotificationRelation dBNotificationAttr : dBAccessNotifcation){
				//dBMapAccessNotifcation.put(dBNotificationAttr.getAccessChangeEventType(),dBNotificationAttr);
				dBMapAccessNotifcation.put(dBNotificationAttr.getAccessChangeEventType().getAccessChangeEventType(),dBNotificationAttr);
				//dBRemMapAccessNotifcation.put(dBNotificationAttr.getAccessChangeEventID(),dBNotificationAttr);
				dBRemMapAccessNotifcation.put(dBNotificationAttr.getAccessChangeEventType().getAccessChangeEventId(),dBNotificationAttr);
			}
		}
		
		if(accessNotifiReqEntity == null || accessNotifiReqEntity.isEmpty()) {
			listDeactivate.addAll(new ArrayList<AChangeNotificationRelation>(dBMapAccessNotifcation.values()));
		} else {				
			Set<AChangeNotificationRelation> filteredAccessNotifications = new HashSet<AChangeNotificationRelation>();
			LOGGER.debug("Access Notification List Before Filter : " + accessNotifiReqEntity);
			filteredAccessNotifications.addAll(accessNotifiReqEntity);
			LOGGER.debug("Access Notification  List After Filter : " + filteredAccessNotifications);
			accessNotifiReqEntity.removeAll(accessNotifiReqEntity);
			LOGGER.debug("Access Notification  List After removing : " + accessNotifiReqEntity);
			accessNotifiReqEntity.addAll(filteredAccessNotifications);
			LOGGER.debug("Access Notification  List After Filter : " + accessNotifiReqEntity);
			
			for (AChangeNotificationRelation accessNotifcationAttributes : accessNotifiReqEntity) {
				AChangeNotificationRelation dBNotificationAttr = dBMapAccessNotifcation.get(accessNotifcationAttributes.getAccessChangeEventType().getAccessChangeEventType());
	               if (dBNotificationAttr == null) {
	                     listInsert.add(accessNotifcationAttributes);
	               } else {
	            	     LOGGER.debug("accessNotifcationAttributes.equals(dBNotificationAttr) :: " + accessNotifcationAttributes.equals(dBNotificationAttr));
	                     if(!accessNotifcationAttributes.equals(dBNotificationAttr)) {
	                            listUpdate.add(accessNotifcationAttributes);
	                     }
	                     dBRemMapAccessNotifcation.remove(dBNotificationAttr.getAccessChangeEventType().getAccessChangeEventType());
	               }
	        }
	        listDeactivate.addAll(new ArrayList<AChangeNotificationRelation>(dBRemMapAccessNotifcation.values()));
		}
        
        if(listInsert != null && !listInsert.isEmpty()){
               for (AChangeNotificationRelation insertAccessNoti : listInsert){
   				   insertAccessNoti.setCreatedDate(currentDate);
   				   insertAccessNoti.setLastUpdatedDate(currentDate);
   				   //resultData = serviceDAO.createAccessNotification(CommonUtil.getAccessNotificationMapForCreate(insertAccessNoti, recordID));
   				   changeNotifiDAO.saveOrUpdates(insertAccessNoti);
   				   //Boolean resSuccess = (Boolean) resultData.get(SystemUtils.getInstance().getProperty("pcehr.dml.success"));
	   			   //Long resSeqId = (Long) resultData.get(SystemUtils.getInstance().getProperty("pcehr.seq.id"));
	   			   //if(resSuccess != null){
	   				//isCreatedOrUpdated = resSuccess.booleanValue();
	   			   //}
	   			   //LOGGER.debug("Access Change Notification ID: " + resSeqId);
               }
        }
        
        if(listUpdate != null && !listUpdate.isEmpty()){
               for (AChangeNotificationRelation updateAccessNoti : listUpdate){
            	   updateAccessNoti.setLastUpdatedDate(currentDate);
            	   
            	   //isCreatedOrUpdated = serviceDAO.updateAccessNotification(CommonUtil.getAccessNotificationMap(updateAccessNoti), recordID, updateAccessNoti.getAccessChangeEventID());
            	  changeNotifiDAO.saveOrUpdates(updateAccessNoti);
               }
        }
        
        if(listDeactivate != null && !listDeactivate.isEmpty()){
               for (AChangeNotificationRelation deactivateAccessNotf : listDeactivate){
            	   //deactivateAccessNotf.setNotificationChannelID(Integer.parseInt(SystemUtils.getInstance().getProperty("db.pcehr.notificationChannelID.none")));
            	   NotificationChannel nChannel =new NotificationChannel();
            	   nChannel.setNotificationChannelId(Long.parseLong(SystemUtils.getInstance().getProperty("db.pcehr.notificationChannelID.none")));	            	   
            	   deactivateAccessNotf.setNotificationChannel(nChannel);
            	   deactivateAccessNotf.setLastUpdatedDate(currentDate);
            	   //isCreatedOrUpdated = serviceDAO.updateAccessNotification(CommonUtil.getAccessNotificationMap(deactivateAccessNotf), recordID,deactivateAccessNotf.getAccessChangeEventID());
            	   changeNotifiDAO.saveOrUpdates(deactivateAccessNotf);
               }
        }
	}
	LOGGER.info("End of create or update Access Notification");
    return isCreatedOrUpdated;
}

	
	
	*//**
	 * Insert or update authority.
	 *
	 * @param authorities the authorities
	 * @param recId the rec id
	 * @param userId the user id
	 * @return true, if successful
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public boolean insertOrUpdateAuthority(List<AuthorityAttributes> authorities, Long recId, Long userId) throws PCEHRSecurityException {
		LOGGER.debug("From insertOrUpdateAuthority method - Input params: "+authorities+" ,RecId: "+recId+" ,UserId: "+userId);
		//PAServiceDAOIntf serviceDAO = PAServiceDAOImpl.getInstance();
		boolean isCreatedOrUpdated = false;
		List<AuthorityAttributes> finalListEnableInsert = new ArrayList<AuthorityAttributes>();
		List<AuthorityAttributes> finalListDisableInsert = new ArrayList<AuthorityAttributes>();
		List<AuthorityAttributes> listDeactivate = new ArrayList<AuthorityAttributes>();
		
		//Get all active authorities in DB for rec and user
		List<AuthorityAttributes> dbAuthorities = serviceDAO.getAuthorityForRecAndUser(recId, userId);
		
		//Deactivate this list of authorities obtained from DB
		if(dbAuthorities != null && !dbAuthorities.isEmpty()){
			LOGGER.info("Start of insertOrUpdateAuthority");
			listDeactivate.addAll(dbAuthorities);
			LOGGER.debug("From insertOrUpdateAuthority method - Deactivate List: "+listDeactivate);
		}
		
		//Create enable auth list and disable auth list
		if(authorities.size() == 1){
			finalListEnableInsert.addAll(authorities);
		} else {
			AuthorityAttributes maxAuth = getMaxDateAndAuth(authorities, SystemUtils.getInstance().getProperty("start.date.type"));
			if(maxAuth != null && authorities.contains(maxAuth)){
				finalListEnableInsert.add(maxAuth);
				authorities.remove(maxAuth);
				finalListDisableInsert.addAll(authorities);
			}
		}
		LOGGER.debug("Final Deactivate list: "+listDeactivate.toString());
		LOGGER.debug("Final Insert Enable list: "+finalListEnableInsert.toString());
		LOGGER.debug("Final Insert Disable list: "+finalListDisableInsert.toString());
		
		if(listDeactivate != null && !listDeactivate.isEmpty()){
			for (AuthorityAttributes deactivateAuth : listDeactivate){
				isCreatedOrUpdated = serviceDAO.deactivateAuthority(recId, userId, deactivateAuth.getAuthorityType(), deactivateAuth.getAuthorityDocType());
			}
		}
		
		if(finalListEnableInsert != null && !finalListEnableInsert.isEmpty()){
			isCreatedOrUpdated = createAuthorities(finalListEnableInsert,recId, userId, Long.valueOf(SystemUtils.getInstance().getProperty("db.enable.auth.status")));
		}
		
		if(finalListDisableInsert != null && !finalListDisableInsert.isEmpty()){
			isCreatedOrUpdated = createAuthorities(finalListDisableInsert,recId, userId, Long.valueOf(SystemUtils.getInstance().getProperty("db.disable.auth.status")));
		}
		
		LOGGER.debug("From insertOrUpdateAuthority method - Data inserted or updated: "+isCreatedOrUpdated);
		LOGGER.info("End of insertOrUpdateAuthority");
		return isCreatedOrUpdated;
	}
	
	*//**
	 * Gets the manage consumer pcehr consent details.
	 *
	 * @param IHI the iHI
	 * @return the manage consumer pcehr consent details
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public ManageConsumerPCEHRConsentDetails getManageConsumerPCEHRConsentDetails(String IHI) throws PCEHRSecurityException {
		//PAServiceDAOIntf paServDao = PAServiceDAOImpl.getInstance();
		ManageConsumerPCEHRConsentDetails manageConsumerPCEHRConsentDetails = new ManageConsumerPCEHRConsentDetails();
		PcehrFlagGroup pcehrFlagGroup = new PcehrFlagGroup();
		pcehrFlagGroup.setPcehrIdentityFlag(Boolean.FALSE);
		pcehrFlagGroup.setPcehrRegistrationFlag(Boolean.FALSE);
		pcehrFlagGroup.setPcehrIdentityFlag(Boolean.valueOf(createConsentToMedicareForDemographics(IHI)));			
		boolean pcehrRegistrationFlag = createConsentToMedicareForConsent(IHI);	
		
		pcehrFlagGroup.setPcehrRegistrationFlag(Boolean.valueOf(pcehrRegistrationFlag));
		manageConsumerPCEHRConsentDetails.setPcehrFlagGroup(pcehrFlagGroup);
		
		List<ManageConsumerPCEHRConsentDetails.PbsRpbsFlagGroup> pbsRpbsFlagGroups = manageConsumerPCEHRConsentDetails.getPbsRpbsFlagGroup();
		List<ManageConsumerPCEHRConsentDetails.MedicareDVAFlagGroup> medicareDVAFlagGroups = manageConsumerPCEHRConsentDetails.getMedicareDVAFlagGroup();
		ManageConsumerPCEHRConsentDetails.AcirFlagGroup acirFlagGroup = null;
		ManageConsumerPCEHRConsentDetails.AodrFlagGroup aodrFlagGroup = null;
		
		List<Map<String,Boolean>> consentsList = new ArrayList<Map<String,Boolean>>();
		Map<String,Boolean> aciraodrMap = new HashMap<String, Boolean>();
		Map<Integer,String> consentGivenByMap = new HashMap<Integer,String>();
        List<Long> consentType = new ArrayList<Long>();
		consentType.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir")));
		consentType.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr")));
		List<MedicareConsentsRelationship> consents =null;
		String acirihi = IHI;
		int i = 0;
		if (pcehrRegistrationFlag) {	
			LOGGER.info("Start of getManageConsumerPCEHRConsentDetails");
			//Long lRecordId = paServDao.retrivePCEHRRecord(IHI);
			PcehrRecord recordList =pcehrRecordDao.getPCEHRRecordForIHI(Long.valueOf(IHI));
			Long lRecordId =null;
			if(recordList!=null){
				lRecordId =recordList.getRecordId();
			}
			//consents = paServDao.getConsentAttributes(lRecordId );
			 consents =medicareDao.getMedicareConsentsRelationshipDetails(null, lRecordId);
			if(consents != null && consents.size() > 0)	{	
				String consentGivenBy = null;
				String consentTypeId =null;
				String consentStatus =null;
				Map<String,Boolean> consentMap = null;
			
				for (MedicareConsentsRelationship consent : consents) {
					consentTypeId = String.valueOf(consent.getMedicareConsentType().getConsentTypeId());
					consentStatus =String.valueOf(consent.getConsentStatus());
					if(!consentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir")) &&
							!consentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr")) ){
						if(consentGivenBy ==null || !consentGivenBy.equals(consent.getConsentGivenBy())){
							consentGivenBy =String.valueOf(consent.getConsentGivenBy());
							consentGivenByMap.put(i , consentGivenBy);
							LOGGER.debug("Consent givenBy" + consentGivenBy);							
							if(consentMap!=null && consentMap.size()>0){
								consentsList.add(consentMap);
							}
							i++;
							consentMap = new HashMap<String, Boolean>();
						} 
						if (consentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbs"))) {
							if(consentStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consentestatus.given"))){
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbs"), Boolean.TRUE);
							}else{
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbs"), Boolean.FALSE);
							}
							
						}
						if (consentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbspastassimilation"))) {
							if(consentStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consentestatus.given"))){
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbspastassimilation"), Boolean.TRUE);
							}else{
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbspastassimilation"), Boolean.FALSE);
							}
							
						}
						if (consentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbs"))) {
							if(consentStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consentestatus.given"))){
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbs"), Boolean.TRUE);
							}else{
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbs"), Boolean.FALSE);
							}
							
						}
						if (consentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbspastassimilation"))) {
							if(consentStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consentestatus.given"))){
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbspastassimilation"), Boolean.TRUE);
							}else{
								consentMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbspastassimilation"), Boolean.FALSE);
							}
							
						}
					}
				}
				consentsList.add(consentMap);
				//consents = paServDao.getConsentAttributes(lRecordId , consentType);
				
				consents =medicareDao.getMedicareConsentsRelationshipDetails(lRecordId, null, consentType, false);
				
				for (MedicareConsentsRelationship consent : consents) {
					String medicareConsentTypeId =String.valueOf(consent.getMedicareConsentType().getConsentTypeId());
					String medicareConsentStatus =String.valueOf(consent.getConsentStatus());
					if (medicareConsentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"))) {
						
						if(medicareConsentStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consentestatus.given"))){
							aciraodrMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"), Boolean.TRUE);
						}else{
							aciraodrMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"), Boolean.FALSE);
						}
						acirihi = String.valueOf(consent.getConsentGivenBy());
					}
					if (medicareConsentTypeId.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr"))) {
						if(medicareConsentStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.consentestatus.given"))){
							aciraodrMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr"), Boolean.TRUE);
						}else{
							aciraodrMap.put(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr"), Boolean.FALSE);
						}
						
					}
				}
				
				boolean acirFlag = false;
				boolean aodrFlag = false; 
				i = 0;
				LOGGER.debug("Consent List " + consentsList.toString());
				for(Map<String,Boolean> lconsentMap:consentsList){
					if(lconsentMap!=null && !lconsentMap.isEmpty()){
						LOGGER.debug("Consent List " + lconsentMap.toString());
						String pbsihi = consentGivenByMap.get(i);
						String mbsihi = consentGivenByMap.get(i);
						
						boolean pbsFound = false;
						boolean mbsFound = false;
						boolean pbsSimFound = false;
						boolean mbsSimFound = false;
						if(lconsentMap.containsKey(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbs"))){						
							pbsFound = Boolean.valueOf(lconsentMap.get(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbs")));
						}
						if(lconsentMap.containsKey(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbspastassimilation"))){
							pbsSimFound = Boolean.valueOf(lconsentMap.get(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.pbspastassimilation")));							
						}
						if(lconsentMap.containsKey(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbs"))){
							mbsFound = Boolean.valueOf(lconsentMap.get(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbs")));							
						}
						if(lconsentMap.containsKey(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbspastassimilation"))){
							mbsSimFound = Boolean.valueOf(lconsentMap.get(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.mbspastassimilation")));
						}
						
						ManageConsumerPCEHRConsentDetails.PbsRpbsFlagGroup pbsRpbsFlagGroup = new ManageConsumerPCEHRConsentDetails.PbsRpbsFlagGroup();
						pbsRpbsFlagGroup.setIhiNumberAuthorisedRepresentative(pbsihi);
						pbsRpbsFlagGroup.setPbsRpbsFlag(pbsFound);
						pbsRpbsFlagGroup.setBackDateIndicator(pbsSimFound);
						pbsRpbsFlagGroups.add(pbsRpbsFlagGroup);
						
						ManageConsumerPCEHRConsentDetails.MedicareDVAFlagGroup medicareDVAFlagGroup = new ManageConsumerPCEHRConsentDetails.MedicareDVAFlagGroup();
						medicareDVAFlagGroup.setBackDateIndicator(mbsSimFound);
						medicareDVAFlagGroup.setIhiNumberAuthorisedRepresentative(mbsihi);
						medicareDVAFlagGroup.setMedicareDVAFlag(mbsFound);
						medicareDVAFlagGroups.add(medicareDVAFlagGroup);
					}
					i++;
				}
				if(aciraodrMap.containsKey(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir"))){
					acirFlag = Boolean.valueOf(aciraodrMap.get(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.acir")));
				}
				if(aciraodrMap.containsKey(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr"))){
					aodrFlag = Boolean.valueOf(aciraodrMap.get(SystemUtils.getInstance().getProperty("db.pcehr.consenttype.aodr")));
				}
				acirFlagGroup = new ManageConsumerPCEHRConsentDetails.AcirFlagGroup();
				acirFlagGroup.setAcirFlag(acirFlag);
				acirFlagGroup.setIhiNumberAuthorisedRepresentative(acirihi);
				aodrFlagGroup = new ManageConsumerPCEHRConsentDetails.AodrFlagGroup();
				aodrFlagGroup.setAodrFlag(aodrFlag);
				manageConsumerPCEHRConsentDetails.setAcirFlagGroup(acirFlagGroup);
				manageConsumerPCEHRConsentDetails.setAodrFlagGroup(aodrFlagGroup);				
				return manageConsumerPCEHRConsentDetails;
			}
		}
		if(!pcehrRegistrationFlag || consents==null){
			ManageConsumerPCEHRConsentDetails.PbsRpbsFlagGroup pbsRpbsFlagGroup = new ManageConsumerPCEHRConsentDetails.PbsRpbsFlagGroup();
			pbsRpbsFlagGroup.setBackDateIndicator(false);
			pbsRpbsFlagGroup.setIhiNumberAuthorisedRepresentative(IHI);
			pbsRpbsFlagGroup.setPbsRpbsFlag(false);
			pbsRpbsFlagGroups.add(pbsRpbsFlagGroup);
			ManageConsumerPCEHRConsentDetails.MedicareDVAFlagGroup medicareDVAFlagGroup = new ManageConsumerPCEHRConsentDetails.MedicareDVAFlagGroup();
			medicareDVAFlagGroup.setBackDateIndicator(false);
			medicareDVAFlagGroup.setIhiNumberAuthorisedRepresentative(IHI);
			medicareDVAFlagGroup.setMedicareDVAFlag(false);
			medicareDVAFlagGroups.add(medicareDVAFlagGroup);
			acirFlagGroup = new ManageConsumerPCEHRConsentDetails.AcirFlagGroup();
			acirFlagGroup.setAcirFlag(false);
			acirFlagGroup.setIhiNumberAuthorisedRepresentative(IHI);
			aodrFlagGroup = new ManageConsumerPCEHRConsentDetails.AodrFlagGroup();
			aodrFlagGroup.setAodrFlag(false);
			manageConsumerPCEHRConsentDetails.setAcirFlagGroup(acirFlagGroup);
			manageConsumerPCEHRConsentDetails.setAodrFlagGroup(aodrFlagGroup);
		}
		LOGGER.info("End of getManageConsumerPCEHRConsentDetails");			
		return manageConsumerPCEHRConsentDetails;
	}

	*//**
	 * Private method that returns the authority having the max (start date or end date), from the input list of authorities.
	 *
	 * @param authorities the authorities
	 * @param dateType the date type
	 * @return AuthorityAttributes the max date and auth
	 *//*
	public AuthorityAttributes getMaxDateAndAuth(List<AuthorityAttributes> authorities, String dateType){
		Date maxDate = null;
		AuthorityAttributes authority = null;
		if(authorities != null && !authorities.isEmpty()){
			LOGGER.info("Start of getMaxDateAndAuth");
			if(authorities.size() == 1) {
				maxDate = authorities.get(0).getEndDate();
				authority = authorities.get(0);
			} else {
				for(int i = 0; i < (authorities.size() - 1); i++){
					Date date1 = null;
					Date date2 = null;
					if(authorities.get(i) != null){
						if(dateType != null && dateType.equals(SystemUtils.getInstance().getProperty("end.date.type"))) {
							date1 = authorities.get(i).getEndDate();
						} else if (dateType != null && dateType.equals(SystemUtils.getInstance().getProperty("start.date.type"))) {
							date1 = authorities.get(i).getStartDate();
						}
					}
					
					if(authorities.get(i+1) != null){
						if(dateType != null && dateType.equals(SystemUtils.getInstance().getProperty("end.date.type"))) {
							date2 = authorities.get(i+1).getEndDate();
						} else if (dateType != null && dateType.equals(SystemUtils.getInstance().getProperty("start.date.type"))) {
							date2 = authorities.get(i+1).getStartDate();
						}
					}
					
					if(date1 != null && maxDate == null){
						maxDate = date1;
						authority = authorities.get(i);
					} 
					
					if(date2 != null){
						if(maxDate == null || date2.after(maxDate)){
							maxDate = date2;
							authority = authorities.get(i+1);
						}
					}
				}
			}
		}
		if(authority == null && maxDate == null && authorities.size() > 0){
			authority = authorities.get(0);
		}
		LOGGER.debug("Max Date and authority from getMaxDateAndAuth method: "+maxDate+" - Auth Details - "+authority);
		LOGGER.info("End of getMaxDateAndAuth");
		return authority;
	}
	
	public String getRelationshipRole(Long userID, Long recordID) throws PCEHRSecurityException {
		String role = null;
		boolean isActiveAuthRelExist = false;
		boolean isActiveSelfRelExist = false;
		IdentityRecordRelationship identityRecordRelationship;

		List<Long> validAuthRelTypes = new ArrayList<Long>();
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.parent")));
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.legallyAppointedAuthRep")));
		validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.guardian")));
		//validAuthRelTypes.add(Long.valueOf(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.authRepresentative")));
		
		List<Long> validSelfRelTypes = new ArrayList<Long>();
		validSelfRelTypes.add(Long.parseLong(SystemUtils.getInstance().getProperty("db.pcehr.relTypeID.selfAccess")));
		
		LOGGER.debug("userID : " +userID+ " recordID : "+recordID);
		
		if (userID != null && recordID != null) {
			identityRecordRelationship = irrDao.getIdentityRecRel(userID,recordID,0L);//0L - relStatusId
			Long lRole = identityRecordRelationship.getRelationshipType().getRelationshipTypeId();
			
			LOGGER.debug("lRole : "+lRole);
			LOGGER.debug("validAuthRelTypes.contains(lRole) : " +validAuthRelTypes.contains(lRole));
			
			if (lRole != null && (validAuthRelTypes.contains(lRole))) {
				role = SystemUtils.getInstance().getProperty("osb.element.user.role.authrep");
			}	
			
		} else if (recordID != null) {
			isActiveAuthRelExist = isActiveRelExist(recordID,validAuthRelTypes);				
			LOGGER.debug("isActiveAuthRelExist : " +isActiveAuthRelExist);
			
			if(isActiveAuthRelExist) {
				role = SystemUtils.getInstance().getProperty("osb.element.user.role.authrep");
			} else {
				isActiveSelfRelExist = isActiveRelExist(recordID,validSelfRelTypes);
				LOGGER.debug(" isActiveSelfRelExist : "+isActiveSelfRelExist);
				if (isActiveSelfRelExist) {
					role = SystemUtils.getInstance().getProperty("osb.element.user.role.Individual");
				}
			}
		}
		
		LOGGER.debug("role : "+role);
		return role;
	}
	
	public boolean isActiveRelExist(Long recordID, List<Long> relationshipTypeIdValues) throws PCEHRSecurityException {
    	boolean isActiveRelExist = false;
		List<IdentityRecordRelationship> recList = irrDao.getIdentityRecRelForRecIdRelTIdValRelSId(recordID, relationshipTypeIdValues, 0L);//0L - relStatusId		
		LOGGER.debug("Active records found for recordID : " + recList);
		
		if (recList != null && !recList.isEmpty()) {
			isActiveRelExist = true;
		}
		return isActiveRelExist;
	}
	
	*//**
	 * Private method used to retrieve pcehr record or check pcehr record existence based on recordID/IHI.
	 * 
	 * @param recordID the record id
	 * @param IHI the iHI
	 * @return the service messages
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public ServiceMessages retrivePcehrRecord(Long recordID, String IHI) throws PCEHRSecurityException {
		//PAServiceDAOIntf paServDao = PAServiceDAOImpl.getInstance();
		Long pcehrRecordID = recordID;
		boolean isPCEHRExists = false;
		
		if (recordID != null) {
			Map<String, Object> pcehrRecordMap = checkPCEHRExistence(recordID);
			if (pcehrRecordMap == null && pcehrRecordMap.isEmpty()) {
				isPCEHRExists = (Boolean) pcehrRecordMap.get("isPCEHRExist");
			}
			if (!isPCEHRExists) {
				return CommonUtil.setMessages(StatusCodes.PcehrRecordNotFound, null);
			}
			LOGGER.debug("Record ID: " + pcehrRecordID);
		}
		if (recordID == null || recordID.equals(0L)) {
			if (IHI != null && IHI.length() > 0) {
				pcehrRecordID = (pcehrRecordDao.getPCEHRRecordForIHI(Long.parseLong(IHI))).getRecordId();
				LOGGER.debug("Record ID: " + pcehrRecordID);
			}
		}
		if (pcehrRecordID == null || pcehrRecordID.equals(0L)) {
			return CommonUtil.setMessages(StatusCodes.PcehrRecordNotFound, null);
		}
		LOGGER.info("PCEHR Record found");
		return CommonUtil.setMessages(StatusCodes.PcehrRecordFound, pcehrRecordID);
	}
	
	*//**
	 * Private method used to retrieve pcehr identity or check pcehr identity existence based on userID/IHI.
	 * 
	 * @param userID the user id
	 * @param IHI the IHI
	 * @return the service messages
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public ServiceMessages retrivePcehrIdentity(Long userID, String IHI) throws PCEHRSecurityException {
		Long pcehrIdty = userID;
		boolean isIdentityExists = false;
		Map<String, Object> pcehrIdentityMap = null;
		
		if (userID != null) {
			pcehrIdentityMap = checkPCEHRIdentityExistence(userID);
			if (pcehrIdentityMap == null && pcehrIdentityMap.isEmpty()) {
				isIdentityExists = (Boolean) pcehrIdentityMap.get("isPCEHRIdentityExist");
				pcehrIdentity =  (PcehrIdentity) pcehrIdentityMap.get("pcehrIdentity");
			}
			if (!isIdentityExists) {
				return CommonUtil.setMessages(StatusCodes.PcehrIdentityNotFound, null);
			}
			LOGGER.debug("User ID: " + pcehrIdty);
		}
		if (userID == null || userID.equals(0L)) {
			if (IHI != null && IHI.length() > 0) {
				pcehrIdty = (pcehrIdentityDao.get(IHI)).getUserId();
				LOGGER.debug("User ID: " + pcehrIdty);
			}
		}
		if (pcehrIdty == null || pcehrIdty.equals(0L)) {
			return CommonUtil.setMessages(StatusCodes.PcehrIdentityNotFound, null);
		}
		LOGGER.info("PCEHR Identity found");
		return CommonUtil.setMessages(StatusCodes.PcehrIdentityFound, pcehrIdty);
	}
	
	*//**
	 * Checks if is verified identity.
	 *
	 * @param userID the user id
	 * @param ihi the ihi
	 * @return the service messages
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public ServiceMessages isVerifiedIdentity(Long userID, String ihi) throws PCEHRSecurityException {
		Long pcehrIdty = userID;
		Map<String, Object> pcehrIdentityMap = null;
		boolean isIdentityExists = false;
		
		if (userID != null) {
			pcehrIdentityMap = checkPCEHRIdentityExistence(userID);
			String ihiForPI = ((PcehrIdentity)pcehrIdentityDao.get(userID)).getDemographic().getIhi().toString();
			//String ihiForPI = paServDao.getIHIForUserId(userID);
			if (pcehrIdentityMap == null && pcehrIdentityMap.isEmpty()) {
				isIdentityExists = (Boolean) pcehrIdentityMap.get("isPCEHRIdentityExist");
				pcehrIdentity =  (PcehrIdentity) pcehrIdentityMap.get("pcehrIdentity");
			}
			if ((!isIdentityExists) || (ihiForPI == null)) {
				return CommonUtil.setMessages(StatusCodes.PcehrIdentityIsUnverified, null);
			}
			LOGGER.debug("User ID: " + pcehrIdty + " and IHI for User ID: " + ihiForPI);
		}
		if (userID == null || userID.equals(0L)) {
			if (ihi != null && ihi.length() > 0) {
				pcehrIdty = (pcehrIdentityDao.get(ihi)).getUserId();
				LOGGER.debug("User ID: " + pcehrIdty);
			}
		}
		if (pcehrIdty == null || pcehrIdty.equals(0L)) {
			return CommonUtil.setMessages(StatusCodes.PcehrIdentityIsUnverified, null);
		}
		LOGGER.info("PCEHR Identity Verified");
		return CommonUtil.setMessages(StatusCodes.PcehrIdentityIsVerified, null);
	}
	
	*//**
	 * This is a private method, called by createPCEHRIdentity (public method).
	 * 
	 * @param IHI the iHI
	 * @param demographics the demographics
	 * @param pcehrIdentityList the pcehr identity list
	 * @param documents the documents
	 * @param isChildMethod true/false
	 * @return ServiceMessages the Service message containing the newly created pcehr identity
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	private ServiceMessages createPCEHRIdentity(String IHI, Demographics demographics, PCEHRIdentity pcehrIdentityList, List<Document> documents, boolean isChildMethod) throws PCEHRSecurityException {
		//PAServiceDAOIntf serviceDAO = PAServiceDAOImpl.getInstance();
		ServiceMessages serviceMsg = null;
		Demographics ldemographics = demographics;
		Map<String, Object> resultData = new HashMap<String, Object>();
		Long userId = null;

		Date currentDate = Calendar.getInstance().getTime();
		if (IHI != null && !IHI.equalsIgnoreCase("")) {
			LOGGER.info("Start of createPCEHRIdentity");
			Long pcehrIdentity = serviceDAO.retrivePCEHRIdentity(IHI);
			if (pcehrIdentity != null) {
				serviceMsg = CommonUtil.setMessages(StatusCodes.PcehrIdentityFound, pcehrIdentity);
				return serviceMsg;
			}
		}

		boolean pcehrCreate = false;
		boolean demoExists = false;
		if ((IHI != null && !IHI.trim().isEmpty())) {
			if (ldemographics == null) {
				ldemographics = new Demographics();
			}
			demoExists = serviceDAO.checkDemographicsexistence(IHI);
			if (!demoExists) {
				ldemographics.setIhi(IHI);
				pcehrCreate = serviceDAO.createDemographics(CommonUtil.getDemographicsAttributeMap(ldemographics), IHI);
			}
		}

		pcehrIdentityList.setIdentityCreationDate(currentDate);
		pcehrIdentityList.setIdentityLastUpdateDate(currentDate);

		if (IHI != null && !IHI.trim().isEmpty()) {
			if (pcehrCreate || demoExists) {
				pcehrIdentityList.setIhi(Long.parseLong(IHI));
				resultData = serviceDAO.savePCEHRIdentity(CommonUtil.getPCEHRIdentityForCreateAttributeMap(pcehrIdentityList));
			}
		} else {
			resultData = serviceDAO.savePCEHRIdentity(CommonUtil.getPCEHRIdentityForCreateAttributeMap(pcehrIdentityList));
		}
		
		Boolean resSuccess = (Boolean) resultData.get(SystemUtils.getInstance().getProperty("pcehr.dml.success"));
		Long resSeqId = (Long) resultData.get(SystemUtils.getInstance().getProperty("pcehr.seq.id"));
		if(resSuccess != null){
			pcehrCreate = resSuccess.booleanValue();
		}
		userId = resSeqId;
		LOGGER.debug("User ID: " + userId);
		LOGGER.debug("PCHER creation success or failure: " + pcehrCreate);
		if (pcehrCreate) {
			if (documents != null && !documents.isEmpty()) {
				for (Document doc : documents) {
					if (!serviceDAO.checkDocumentExistence(userId, Long.parseLong(doc.getDocumentType()))) {
						LOGGER.debug("PCHER Record Creation :: doc.getDocumentType() :: " + doc.getDocumentType());
						LOGGER.debug("PCHER Record Creation :: userId :: " + userId);
						serviceDAO.createDocument(Long.parseLong(doc.getDocumentType()), userId);
					}
				}
			}
			return CommonUtil.setMessages(StatusCodes.PcehrIdentityCreated, userId);
		}
		serviceMsg = CommonUtil.setMessages(StatusCodes.PcehrIdentityCreationFailure, null);
		LOGGER.info("End of createPCEHRIdentity");
		return serviceMsg;
	}
	
	*//**
	 * Link pcehr identity record relation.
	 * 
	 * 
	 * @return true, if successful
	 * @throws PCEHRSecurityException the pCEHR security exception
	 *//*
	public boolean linkPCEHRIdentityRecordRelation(IdentityRecordRelationship newIdentityRecordRelationship) throws PCEHRSecurityException {
		boolean isInserted = false;
		irrDao.saveOrUpdates(newIdentityRecordRelationship);
		
		return isInserted;
	}
	
	public boolean createConsentToMedicareForConsent(String ihi) throws PCEHRSecurityException {
		//PAServiceDAOIntf paServDao = PAServiceDAOImpl.getInstance();
		boolean pcehrRegistrationFlag = false;
		Long lRecordId =null;
		String recordStatus =null;
		//Long lRecordId = paServDao.retrivePCEHRRecord(ihi);
		PcehrRecord  recordList= pcehrRecordDao.getPCEHRRecordForIHI(Long.valueOf(ihi));
        if(recordList!=null){
        	lRecordId =	recordList.getRecordId();
        	 
        }
		if (lRecordId == null || lRecordId.equals(0L)) {
			LOGGER.info("Start of createConsentToMedicareForConsent");
			return pcehrRegistrationFlag;
		}
		//Map<String, Object> map = paServDao.retrivePcehrRecordStatusAndIHI(lRecordId);
		//String recordStatus = (String) map.get(SecurityConstants.PCEHR_RECORD.RECORD_STATUS);
		recordStatus = recordList.getRecordStatus();
		if (recordStatus.equalsIgnoreCase(SystemUtils.getInstance().getProperty("db.pcehr.record.status.active"))) {
			pcehrRegistrationFlag = true;
		} else {
			pcehrRegistrationFlag = false;
		}
		LOGGER.info("End of createConsentToMedicareForConsent");
		return pcehrRegistrationFlag;
	}
	
	public boolean isRelationshipsExistsForConsents(Long userID, String IHI)throws PCEHRSecurityException {
		boolean isRelationPresent = false;
		if(userID != null && !userID.equals("") ){
			List<PcehrIdentity> identityList=	pcehrIdentityDao.getPcehrIdentityDetails(userID, SecurityConstants.RECORD_STATUS, SecurityConstants.relationship_Status_Id);
			if(identityList!=null&&identityList.size()>0){
				isRelationPresent =true;
			}
		}else{
			List<IdentityRecordRelationship> irrList =irrDao.getIdentityRecRel(Long.valueOf(IHI),SecurityConstants.RECORD_STATUS, SecurityConstants.relationship_Status_Id);
			if(irrList!=null&&irrList.size()>0){
				isRelationPresent =true;
			}
		}
		return isRelationPresent;
	}
	public boolean createConsentToMedicareForDemographics(String ihi) throws PCEHRSecurityException {
		//PAServiceDAOIntf paServDao = PAServiceDAOImpl.getInstance();
		boolean pcehrIdentityFlag = false;
		Long lUserId =null;
		//Long lUserId = paServDao.retrivePCEHRIdentity(ihi);
		List<PcehrIdentity> identityList= pcehrIdentityDao.getPCEHRIdentityDetailsForIHI(Long.valueOf(ihi));
		if(identityList!=null&&identityList.size()>0){
			lUserId = identityList.get(0).getUserId();
		}
		if (lUserId == null || lUserId.equals(0L)) {
			LOGGER.info("Start of createConsentToMedicareForDemographics");
			return pcehrIdentityFlag;
		}
		//pcehrIdentityFlag = paServDao.isRelationshipsExistsForConsents(lUserId, ihi);
		pcehrIdentityFlag = isRelationshipsExistsForConsents(lUserId,ihi);
		LOGGER.info("End of createConsentToMedicareForDemographics");
		return pcehrIdentityFlag;
	}*/
	
}
