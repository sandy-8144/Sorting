package com.programming.algo.sorting;

public class SelectionSort {
/*
 * Logic: Array is treated in two parts ( sorted+unsorted) initial a array is unsorted.
 * Selection : select min element from the array
 * Swap: bring it to starting position
 * shift counter: change the counter of unsorted array by one
 * 
 * TC: O(n^2)
 * Ref:
 * https://www.youtube.com/watch?v=xWBP4lzkoyM&list=PLqM7alHXFySHrGIxeBOo4-mKO4H8j2knW&index=5
 * 
 */
	
	
	public void sort(int [] arr) {
		
		int length = arr.length;
		
		int min=-1;
		for(int i =0; i<length-1;i++) {
			min=i;
			for(int j =i+1; j<length;j++) {			
				if(arr[j]<arr[min])
					min=j;
				
			}		   
			// swap
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		   //counter shift i++
			
		}
	}
	
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	
	public static void main(String [] args) {
		int arr [] = { 5,2,19,11,12,4,23,6};
		
		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
        ss.printArr(arr);		
		
		
	}
}
