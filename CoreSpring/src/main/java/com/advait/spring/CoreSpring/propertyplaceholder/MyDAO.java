package com.advait.spring.CoreSpring.propertyplaceholder;

public class MyDAO {
private String server;

MyDAO(String server){
	this.server=server;
}

@Override
public String toString() {
	return "MyDAO [server=" + server + "]";
}
}
