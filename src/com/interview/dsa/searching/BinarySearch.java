package com.interview.dsa.searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6,7,9,34,54,65,77,867,56654,667545,7876543};
		System.out.println(BinarySearch(arr,7876543));
		
	}
	
	public static int BinarySearch(int[] arr,int key) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]>key) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}

}
