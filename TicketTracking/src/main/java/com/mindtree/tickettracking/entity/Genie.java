package com.mindtree.tickettracking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "genie")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Genie {

	@Id
	private int genieId;
	
	private String genieDescription;
	
	private boolean genieStatus;

	@Override
	public String toString() {
		return "Genie [genieId=" + genieId + ", genieDescription=" + genieDescription + ", genieStatus=" + genieStatus
				+ "]";
	}

	public int getGenieId() {
		return genieId;
	}

	public void setGenieId(int genieId) {
		this.genieId = genieId;
	}

	public String getGenieDescription() {
		return genieDescription;
	}

	public void setGenieDescription(String genieDescription) {
		this.genieDescription = genieDescription;
	}

	public boolean isGenieStatus() {
		return genieStatus;
	}

	public void setGenieStatus(boolean genieStatus) {
		this.genieStatus = genieStatus;
	}

	public Genie(int genieId, String genieDescription, boolean genieStatus) {
		super();
		this.genieId = genieId;
		this.genieDescription = genieDescription;
		this.genieStatus = genieStatus;
	}

	public Genie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
