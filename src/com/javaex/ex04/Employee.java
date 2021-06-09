package com.javaex.ex04;

public class Employee extends User{

//	필드
	private int salary;
	
//	생성자
	public Employee() {
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
//	겟터셋터
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
//	메소드 일반
	public void showInfo() {
		System.out.println("#아이디:" + super.getId() + ", #패스워드:" + super.getPassword() + ", #이름:" + super.getName() + ", #월급:"
				+ this.salary);
		System.out.println(super.getName() + "의 월급은" + this.salary + "원 입니다.");
	}

	
}