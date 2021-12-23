package com.advait.spring.CoreSpring.constructorinjection.aambuigity;

public class Addition {
	
	Addition(int a ,double b){
		System.out.println("Inside contructor");
		System.out.println(a);
		System.out.println(b);
	}
Addition(int a ,int b){
	System.out.println("Inside contructor int");
}
Addition(String a ,String b){
	System.out.println("Inside contructor string");
}
}
