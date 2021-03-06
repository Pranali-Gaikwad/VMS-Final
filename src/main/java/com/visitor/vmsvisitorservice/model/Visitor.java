package com.visitor.vmsvisitorservice.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

//import javax.validation.constraints.Pattern;

@Entity
@Table(name = "visitor")
public class Visitor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private String email;

	private String mobileNo;

	private String address;

	private String idProofType;
	
	private String idProof;
	private String visitorType;
	
	private String reasonForVisit;
	private String contactPersonName;

	private String contactPersonEmail;

	

	private String contactPersonMobileNo;

	@Column(name = "status", nullable = false, columnDefinition = "int default 0")
	private int status;

	public Visitor() {
		super();
	}

	

	public Visitor(long id, String name, String email, String mobileNo, String address, String idProofType,
			String idProof, String visitorType, String reasonForVisit, String contactPersonName,
			String contactPersonEmail, String contactPersonMobileNo, int status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.idProofType = idProofType;
		this.idProof = idProof;
		this.visitorType = visitorType;
		this.reasonForVisit = reasonForVisit;
		this.contactPersonName = contactPersonName;
		this.contactPersonEmail = contactPersonEmail;
		this.contactPersonMobileNo = contactPersonMobileNo;
		this.status = status;
	}



	

	public Visitor(String name, String email, String mobileNo, String address, String idProofType, String idProof,
			String visitorType, String reasonForVisit, String contactPersonName, String contactPersonEmail,
			String contactPersonMobileNo) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.idProofType = idProofType;
		this.idProof = idProof;
		this.visitorType = visitorType;
		this.reasonForVisit = reasonForVisit;
		this.contactPersonName = contactPersonName;
		this.contactPersonEmail = contactPersonEmail;
		this.contactPersonMobileNo = contactPersonMobileNo;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public String getReasonForVisit() {
		return reasonForVisit;
	}

	public void setReasonForVisit(String reasonForVisit) {
		this.reasonForVisit = reasonForVisit;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getContactPersonMobileNo() {
		return contactPersonMobileNo;
	}

	public void setContactPersonMobileNo(String contactPersonMobileNo) {
		this.contactPersonMobileNo = contactPersonMobileNo;
	}



	public String getIdProofType() {
		return idProofType;
	}



	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}



	public String getVisitorType() {
		return visitorType;
	}



	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}
	
	

}