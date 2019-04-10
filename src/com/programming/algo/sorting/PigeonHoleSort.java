package com.programming.algo.sorting;

import java.util.ArrayList;


@SuppressWarnings("unchecked")
public class PigeonHoleSort {

/*
 *  1. Find min & max values in array. and take the range as RANGE=max-min+1
 *  2. setup an array of list having same size as range, called as pigeonhole array.
 *  3. visit each element in org array and put them in pigeonhole, element at index i would be at index {arr[i]-min} in pigeonhole.
 *  4. Loop over pigeonhole array and put non-empty holes back to org array in order same as pigenhole array.
 *  5. Complexity : O(range+n).
 *  6. This algo is revised version of count sort
 *  
 *  
 *  Ref:
 *  https://www.youtube.com/watch?v=nVQz0kZNC64&list=PLqM7alHXFySHrGIxeBOo4-mKO4H8j2knW&index=17
 * 
 * 
 * 
 * 
 */
	
	public void sort(int [] arr) {
		
		int length = arr.length;
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<length;i++)
		{
			
			if(arr[i]<min)
				min=arr[i];
			if(arr[i] > max)
				max=arr[i];
		}
		
		int range= max-min+1;
		
		
		ArrayList [] pigeonHoles = new ArrayList [range];
		
		
		for(int i=0;i<length;i++)
		{
			if(pigeonHoles[arr[i]-min]==null)
			{
				pigeonHoles[arr[i]-min]=new ArrayList();
			}
			pigeonHoles[arr[i]-min].add(arr[i]);
		}
		
		int index=0;
		for(int i=0;i<range;i++) {
			
			ArrayList list = pigeonHoles[i];
			
			if(list!=null) {
			for(Object element: list)
			{
				
				arr[index++]=(Integer)element;
			}
			
			}
		}
		
	}
	
	
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	
	public static void main(String [] args) {
		int arr [] = { 5,2,19,11,12,4,23,6,11};
		
		PigeonHoleSort ps = new PigeonHoleSort();
		ps.sort(arr);
        ps.printArr(arr);		
		
		
	}
}
