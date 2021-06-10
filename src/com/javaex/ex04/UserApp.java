package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
	
	User[] user = new User[3];
		
	user[0] = new Customer("jws", "j1234", "정우성", 1000);
	user[1] = new Customer("yjs", "y2345", "이효리", 2000);
	user[2] = new Employee("master", "m7788", "운영자", 5000000);
	
	for(int i = 0; i < user.length; i++) {
		user[i].showInfo();
	}
	System.out.println(user[2].getName() + "의 월급은" + ((Employee)user[2]).getSalary() + "원 입니다.");
	}

}
