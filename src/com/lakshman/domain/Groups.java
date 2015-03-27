package com.lakshman.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPS")
public class Groups {

	@Id
	@Column(name = "group_id")
	private int groupId;
	
	@Column(name = "group_name")
	private String groupName;
	
	@Column(name = "projects_id")
	private int projectsId;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getProjectsId() {
		return projectsId;
	}

	public void setProjectsId(int projectsId) {
		this.projectsId = projectsId;
	}



}
