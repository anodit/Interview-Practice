package com.interview.generics;

public class Box<T> {
	T container;
	public Box(T container){
		this.container=container;
	}
	
	public Object getValue() {
		return this.container;
	}
	
	public void getContainerInstance() {
		if(container instanceof String) {
			System.out.println("String instance");
		}else if(container instanceof Integer) {
			System.out.println("Integer instance");
		}
	}

}
