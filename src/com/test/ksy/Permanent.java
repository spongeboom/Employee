package com.test.ksy;

public class Permanent extends Employee{
	// 정규직 클래스
	int salary, bonus;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	int getPay() {
		return salary + bonus;
	}
	

}
