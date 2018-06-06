package com.test.ksy;

public class Temporary extends Employee{
	// 임시직 클래스
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
