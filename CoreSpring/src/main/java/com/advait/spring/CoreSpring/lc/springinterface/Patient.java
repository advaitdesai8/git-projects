package com.advait.spring.CoreSpring.lc.springinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
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
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy");
	}

}
