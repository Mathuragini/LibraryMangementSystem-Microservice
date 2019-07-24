package com.library.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // specifies that the class is an entity and is mapped to a database table
@Table(schema="libraryapp", name="subClassification") //specifies the name of the database table to be used for mapping.
public class SubClassification {

	@Id // specifies the primary key of an entity (id is primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //provides for the specification of generation strategies for the values of primary keys.
	private Long subClassId;
	private String subClassName;
	
	//Generate Getters and Setters
	public Long getSubClassId() {
		return subClassId;
	}
	public void setSubClassId(Long subClassId) {
		this.subClassId = subClassId;
	}
	public String getSubClassName() {
		return subClassName;
	}
	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}
	
	//Generate constructor using fields
	public SubClassification(Long subClassId, String subClassName) {
		super();
		this.subClassId = subClassId;
		this.subClassName = subClassName;
	}
	
	
	
	
	
}
