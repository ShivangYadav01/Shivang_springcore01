package com.springcore.model;

public class Parent {
	private String companyName;
	private String EmpId;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		System.out.println("p-setName");
		this.companyName = companyName;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		System.out.println("p-setId");
		EmpId = empId;
	}

}
