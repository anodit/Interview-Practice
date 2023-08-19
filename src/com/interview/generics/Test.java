package com.interview.generics;
import java.util.List;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		// Generic advantage -> provide type safety
		List<Integer> al = new ArrayList<>();
		al.add(10);
//		al.add("LWDE"); --> at compile time we get error
		al.add(20);
		System.out.println(al);
	}

}
