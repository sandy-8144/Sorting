package com.programming.algo.sorting;

public class QuickSort {
/*
 * TC: Average case: O(nlogn), worse case: O(n^2)
 * 
 * In-place sort, not stable sort
 * 
 * 
 * QuickSort(A,start,end)
 * {
 *      // single element is always sorted
 *       
 *   if(start > end) {
 *   int pivotIndex = partition(A,start,end)
 *   QuickSort(A,start,pivotIndex-1);
 *   QuickSort(A,pivotIndex+1,end);
 * 
 * }
 * }
 * 
 * 
 * int partition(A,start,end)
 * {
 *    int pivot=A[end];
 *    
 *    int pIndex=start;
 *    
 *    for i = start to end-1
 *    {
 *       if(A[i] <=pivot)
 *       {
 *           swap(A[i],A[pIndex])
 *           pIndex= pIndex+1
 *       }
 *    
 *    }
 *    
 *    swap(A[pIndex],A[end])
 *    return pIndex;
 * }
 * 
 * 
 * 
 */
	
	
	public void sort(int [] arr, int start, int end) {
		
		if(start < end) {
			int pIndex = partition(arr,start,end);
			sort(arr,start,pIndex-1);
			sort(arr,pIndex+1,end);			
			
		}
		
		
	}
	
	
	private int partition(int [] arr, int start, int end) {
		
		int pivot = arr[end];
		int pIndex = start;
		
		for(int i=start;i<end;i++)
		{
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i]= arr[pIndex];
				arr[pIndex]=temp;
				
				pIndex++;
			}
				
			
		}
		
		int temp = arr[pIndex];
		arr[pIndex]= arr[end];
		arr[end]=temp;
	
		return pIndex;
		
	}
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	
	public static void main(String [] args) {
		int arr [] = { 5,2,19,11,12,4,23,6};
		
		QuickSort qs = new QuickSort();
		qs.sort(arr,0,7);
        qs.printArr(arr);		
		
		
	}
	
	
	
}
