package com.spring.bean;

public class A {
	private String id;
	private String a1;
	private String c1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String geta1() {
		return a1;
	}
	public void seta1(String a1) {
		a1 = a1;
	}
	public String getc1() {
		return c1;
	}
	public void setc1(String c1) {
		c1 = c1;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", a1=" + a1 + ", c1=" + c1 + "]";
	}
	
	
}
