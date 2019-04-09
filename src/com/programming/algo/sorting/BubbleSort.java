package com.programming.algo.sorting;

public class BubbleSort {

	/*
	 * start with  length 1 to N. compare each element with its next element , if first element is greater than the next one then swap. 
	 *  In this process max element will reach to last. now repeat this process for 1 to N-1
	 *  
	 *   TC: O(n^2)
	 * 
	 */
	
	public void sort(int [] arr) {
		
		int length = arr.length;
		
		for(int i =0; i < length-1;i++)
			for(int j = 0 ; j <length-1-i;j++)
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
										
				}
		
		
		
	}
	
	public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	
	public static void main(String [] args) {
		int arr [] = { 5,2,19,11,12,4,23,6};
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
        bs.printArr(arr);		
		
		
	}
}
