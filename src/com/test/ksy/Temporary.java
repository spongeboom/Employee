package com.test.ksy;

public class Temporary extends Employee{
	int time,pay;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	int getPay() {
		return time * pay;
	}
	
	
}
