package com.mindtree.tickettracking.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.tickettracking.entity.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "campusmind")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class CampusMind {

	@Id
	private String mid;
	
	private String name;
	
	private String projectName;

	@OneToMany
	List<Genie> genie = new ArrayList<Genie>();

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Genie> getGenie() {
		return genie;
	}

	public void setGenie(List<Genie> genie) {
		this.genie = genie;
	}

	@Override
	public String toString() {
		return "CampusMind [mid=" + mid + ", name=" + name + ", projectName=" + projectName + ", genie=" + genie + "]";
	}

	public CampusMind(String mid, String name, String projectName, List<Genie> genie) {
		super();
		this.mid = mid;
		this.name = name;
		this.projectName = projectName;
		this.genie = genie;
	}

	public CampusMind() {
		super();
		// TODO Auto-generated constructor stub
	}

}
