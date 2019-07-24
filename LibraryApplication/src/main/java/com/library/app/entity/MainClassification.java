package com.library.app.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // specifies that the class is an entity and is mapped to a database table
@Table(schema="libraryapp", name="mainClassification") //specifies the name of the database table to be used for mapping.

public class MainClassification {
	@Id // specifies the primary key of an entity (id is primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //provides for the specification of generation strategies for the values of primary keys.
	private Long mainClassId;
	private String mainClassName;
	
	//Generate Getters and Setters
	public Long getMainClassId() {
		return mainClassId;
	}
	public void setMainClassId(Long mainClassId) {
		this.mainClassId = mainClassId;
	}
	public String getMainClassName() {
		return mainClassName;
	}
	public void setMainClassName(String mainClassName) {
		this.mainClassName = mainClassName;
	}
	
	//Generate constructor using fields
	public MainClassification(Long mainClassId, String mainClassName) {
		super();
		this.mainClassId = mainClassId;
		this.mainClassName = mainClassName;
	}
	public MainClassification() {
		super();
	}
	
}
