package com.advait.spring.CoreSpring.lc.xmlconfig;

public class Patient {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	System.out.println("Inside setter");
	this.id = id;
}
public void hi() {
	System.out.println("Inside Hi");
}
public void bye() {
	System.out.println("Inside Bye");
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}
}
