package com.interview.dsa.searching;

public class LinearSearch {

	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		int[] arr = {2,5,4,3,456,3,5,3,23,3,3};
		
		System.out.println(ls.search(arr,11,5));
	}

	public int search(int[]arr,int n,int key) {
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
