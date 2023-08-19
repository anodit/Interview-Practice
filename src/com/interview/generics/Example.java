package com.interview.generics;

public class Example {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>("Demo Prog");
		System.out.println(box1.getValue());
		System.out.println(box1.getValue().getClass().getName());
		box1.container="New Str";
		System.out.println(box1.getValue());
//		box1.container=10;  -> compile time error
		
		Box<Integer> box2 = new Box<>(20);
		System.out.println(box2.getValue());
		System.out.println(box2.getValue().getClass().getName());
		
		box1.getContainerInstance();
		box2.getContainerInstance();
	}

}
