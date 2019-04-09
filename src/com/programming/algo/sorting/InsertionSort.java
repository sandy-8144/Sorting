package com.programming.algo.sorting;

public final class InsertionSort {

	/*
	 * 1. A single element is always sorted.
	 * 2. set a marker for sorted element.
	 * 3. Repeat the following till unsorted array is empty
	 *        a) get the first element in unsorted array
	 *        b) find appropriate position of this element in sorted array
	 *                i) swap element to right and create correct position
	 *        c) increment the marker of sorrted array by 1
	 * 4. its are inserting card at appropriate position.
	 * Ref: 
	 * https://www.youtube.com/watch?v=OGzPmgsI-pQ&list=PLqM7alHXFySHrGIxeBOo4-mKO4H8j2knW&index=3
	 * 
	 * 
	 */
	
	
	
	public void sort(int [] arr) {
		
		int length = arr.length;
		int elem, j;
		for(int i=1; i < length;i++) // marker for sorted array
		{
			// first element of unsorted array
			elem = arr[i];
			j=i-1;  
			
			while(j>=0 && arr[j]>elem) {
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1]=elem;
			
			
		}
		
		
	}
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	

public static void main (String [] args) {
	
	
	int arr [] = { 5,2,19,11,12,4,23,6};
	
	InsertionSort is = new InsertionSort();
	is.sort(arr);
    is.printArr(arr);
}
	
}

