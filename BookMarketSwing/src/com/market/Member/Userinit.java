package com.market.Member;
//고객 정보를 관리하는 클래스
public class Userinit {
	private String name;
	private String phone;

	public Userinit(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
