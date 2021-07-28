package com.example.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String deptNm;
	private String deptAdd;
	private String deptCd;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long deptId, String deptNm, String deptAdd, String deptCd) {
		super();
		this.id = deptId;
		this.deptNm = deptNm;
		this.deptAdd = deptAdd;
		this.deptCd = deptCd;
	}
	
	public Long getDeptId() {
		return id;
	}
	public void setDeptId(Long deptId) {
		this.id = deptId;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	public String getDeptAdd() {
		return deptAdd;
	}
	public void setDeptAdd(String deptAdd) {
		this.deptAdd = deptAdd;
	}
	public String getDeptCd() {
		return deptCd;
	}
	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + id + ", deptNm=" + deptNm + ", deptAdd=" + deptAdd + ", deptCd=" + deptCd
				+ "]";
	}
	
	

}
