package com.javaex.ex05;

public class Depart extends Employee{

//	필드
	private String department;

//	생성자
	public Depart() {
	}

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

//	겟터셋터
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
//	메소드 일반
	
	 public void showInformation() {
	        System.out.println("이름:" + super.getName() + "\t연봉:" + super.getSalary() + "\t부서:" + this.department);
	    }
	
	
}
