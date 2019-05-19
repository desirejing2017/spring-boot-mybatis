package com.cmb.demo.mybatis.entity;

import java.io.Serializable;
import java.util.Date;


public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private Date birth;

	private float bonus;

	private String department;

	private String descrption;

	private String name;

	private String password;


	private String postId;

	private int sex;

	private String standId;

	public Employee() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public float getBonus() {
		return this.bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescrption() {
		return this.descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPostId() {
		return this.postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getStandId() {
		return this.standId;
	}

	public void setStandId(String standId) {
		this.standId = standId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", birth=" + birth + ", bonus=" + bonus + ", department=" + department
				+ ", descrption=" + descrption + ", name=" + name + ", password=" + password + ", postId=" + postId
				+ ", sex=" + sex + ", standId=" + standId + "]";
	}

}