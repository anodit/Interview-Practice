package com.interview.collection.framework;

import java.util.ArrayList;
import java.util.List;

//Q. Write a program in java to join two arraylists into one arraylist.
public class JoinArrayList {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Sunday");
		l1.add("Monday");
		l1.add("Tuesday");
		l1.add("Wednesday");
		
		System.out.println("List 1 -> "+l1);
		
		List<String> l2 = new ArrayList<>();
		l2.add("Thrusday");
		l2.add("Friday");
		l2.add("Saturday");
		
		System.out.println("List 2 -> "+l2);
		
		List<String> joinedList = new ArrayList<>();
		joinedList.addAll(l1);
		joinedList.addAll(l2);
		
		System.out.println("Combined List -> "+joinedList);
		
	}
}
