package com.example.project2.EntityDB;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bakery_detials")
public class EntityDB {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="s_no")
	private int S_no;
	@Column(name="Owner_name")
	private String name;
	@Column(name="Bakery_name")
	private String b_name;
	@Column(name="Famous_sweet")
	private String sweet;
	@Column(name="Famous_savory")
	private String savory;
	@Column(name="servent_no")
	private int b_no;
	public int getS_no() {
		return S_no;
	}
	public void setS_no(int s_no) {
		S_no = s_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getSweet() {
		return sweet;
	}
	public void setSweet(String sweet) {
		this.sweet = sweet;
	}
	public String getSavory() {
		return savory;
	}
	public void setSavory(String savory) {
		this.savory = savory;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	
	
	

}
