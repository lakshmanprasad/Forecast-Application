package com.lakshman.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBERS")
public class Members {

	@Id
	@Column(name = "psa_id")
	private int psaId;

	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "designation")
	private String designation;

	@Column(name = "billing_rate")
	private int billingRate;

	@Column(name = "billable")
	private Boolean billable;

	@Column(name = "member_group")
	private Boolean memberGroup;

	@Column(name = "admin_group")
	private Boolean adminGroup;
	
	@Column(name = "project_mgr_group")
	private Boolean projectMgrGroup;
	
	
	@Column(name = "projects")
	private String projects;
	
	@Column(name = "groups")
	private String groups;
	
	@Column(name = "cgi_date_of_join")
	private String cgiDoj;
	
	@Column(name = "fsg_date_of_join")
	private String fsgDoj;

	public int getPsaId() {
		return psaId;
	}

	public void setPsaId(int id) {
		this.psaId = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getBillingRate() {
		return billingRate;
	}

	public void setBillingRate(int billingRate) {
		this.billingRate = billingRate;
	}

	public Boolean getBillable() {
		return billable;
	}

	public void setBillable(Boolean billable) {
		this.billable = billable;
	}

	public Boolean getMemberGroup() {
		return memberGroup;
	}

	public void setMemberGroup(Boolean memberGroup) {
		this.memberGroup = memberGroup;
	}

	public Boolean getAdminGroup() {
		return adminGroup;
	}

	public void setAdminGroup(Boolean adminGroup) {
		this.adminGroup = adminGroup;
	}

	public Boolean getProjectMgrGroup() {
		return projectMgrGroup;
	}

	public void setProjectMgrGroup(Boolean projectMgrGroup) {
		this.projectMgrGroup = projectMgrGroup;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public String getCgiDoj() {
		return cgiDoj;
	}

	public void setCgiDoj(String cgiDoj) {
		this.cgiDoj = cgiDoj;
	}

	public String getFsgDoj() {
		return fsgDoj;
	}

	public void setFsgDoj(String fsgDoj) {
		this.fsgDoj = fsgDoj;
	}

}
