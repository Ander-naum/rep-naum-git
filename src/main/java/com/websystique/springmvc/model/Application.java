package com.websystique.springmvc.model;


import java.sql.Time;
import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

@Table(name="tbdtpe01")
public class Application {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany
	@JoinColumn(name="NOTICE")
	private FotoDoc NOTICE;
	
	@Column(name = "NOTICE_NUM", nullable = true)
	private String noticeNum;
	
	@CreationTimestamp
	@Column(name ="DATA_NOTICE", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp dataNotice;
	
	@Column(name ="DATA_DTP",nullable = false)
	private Timestamp dateDtp;
	
	@Column(name = "TIME_DTP",nullable = false)
	private Time timeDtp;
	
	@Column(name = "DTP_ADDRESS",nullable = true)
	private String dtpAddress;
	
	@Column(name = "A_INSURED",nullable = true)
	private String aInsured;
	
	@Column(name ="A_INSURED_NAME",nullable = true)
	private String aInsuredName;
	
	@Column(name = "A_INSURED_ADDRESS",nullable = true)
	private String aInsuredAddres;
	
	@Column(name = "A_BODY_NO",nullable = true)
	private String aBodyNo;
	
	@Column(name = "A_VEH_TYPE",nullable = true)
	private String aVehTyp;
	
	@Column(name = "A_VEH_MARK",nullable = true)
	private String aVehMark;
	
	@Column(name = "A_VEH_SIGN",nullable = true)
	private String aVehSign;
	
	@Column(name="A_VEH_YEAR",nullable = true)
	private String aVehYear;
	
	@Column(name ="A_VEH_TP",nullable = true)
	private String aVehTp;
	
	@Column(name = "A_VEH_CONDITION",nullable = true)
	private String aVehCondition;
	
	@Column(name="A_OWNER_NAME",nullable = true)
	private String aOwnerName;
	
	@Column(name="A_OWNER_ADDRESS",nullable = true)
	private String aOwnerAddress;
	
	@Column(name = "A_COMPANY", nullable = false)
	private String aCompany;
	
	@Column(name = "A_POLICE_NUM", nullable = false)
	private String aPoliceNum;
	
	@Column(name = "A_INC_DOC", nullable = false)
	private String aIncDoc;
	
	@Column(name = "A_DATE_BEGIN", nullable = true)
	private Timestamp aDateBegin;
	
	@Column(name = "A_TIME_BEGIN",nullable = true)
	private Time aTimeBegin;
	
	@Column(name = "A_DATE_END", nullable = true)
	private Timestamp aDateEnd;
	
	@Column(name = "A_DRIVER_NAME", nullable = true)
	private String aDriverName;
	
	@Column(name = "A_DRIVER_OWNERSHIP", nullable = true)
	private String aDriverOwnership;
	
	@Column(name = "A_DRIVER_ADDRESS", nullable = true)
	private String aDriverAddress;
	
	@Column(name = "A_DRIVER_LICENSE_NUM",nullable = true)
	private String aDriverLicenseNum;
	
	@Column(name = "A_DRIVER_LICENSE_CAT", nullable = true)
	private String aDriverLicenseCat;
	
	@Column(name = "A_DRIVER_TEL",nullable = false)
	private String aDriverTel;
	
	@Column(name = "A_DRIVER_EMAIL", nullable = false)
	private String  aDriverEmail;
	
	@Column(name = "B_OWNER_NAME",nullable = true)
	private String bDriverName;
	
	@Column(name = "B_OWNER_ADDRESS",nullable = true)
	private String bOwnerAddress;
	
	@Column(name = "B_DRIVER_ADDRESS", nullable = true)
	private String bDriverAddress;
	
	@Column(name = "B_VEH_MARK",nullable = true)
	private String dVehMark;
	
	@Column(name = "B_VEH_SIGN",nullable = true)
	private String bVehSign;
	
	@Column(name = "B_VEH_TYPE", nullable = true)
	private String bVehType;
	
	@Column(name = "B_OWNER",nullable = true)
	private String bOwner;
	
	@Column(name = "BASIS_REGISTRATION",nullable = false)
	private String basisRegistration;
	
	@Column(name = "DAMAGE_VEH", nullable = true)
	private String damageVeh;
	
	@Column(name = "DAMAGE_PROPERTY", nullable = true)
	private String damageProperty;
	
	@Column(name = "DAMAGE_HEALTH", nullable = true)
	private String damageHealth;
	
}
