package com.programming.algo.sorting;

public class MergeSort {
/*
 * 1. Stable sorting algo. if list has equal elements then in sorted list order is maintained. 
 * e.g. (1,4) (3,5), (2,5),(3,4). if this is sorted based on x cordinate then order would be
 * 
 * (1,4),(2,5),(3,5),(3,4). since 3 is repeated, hence whichever comes first in original list will come first in final list.
 * 
 * 2. Not In-place algo.: InPlace means , alogs which needs constant amount of memory. merge sort needs O(n) memory
 * 3. Time Complexity: O(nlogn) in all cases
 * 
 * Ref:
 * 
 * https://www.youtube.com/watch?v=TzeBrDU-JaY&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=5
 * 
 * 
 */
	
	
	public void sort(int [] arr) {
		
		int length = arr.length;
		if(length < 2)
			return;
		
		int mid = (length+1)/2; 
		/*
		 *  take ceiling . if no of elements is 7 then 4th should be mid. which is 7+1/2. 
		 *  if no of element in 8 then , 8+1/2, which is 4.
		 */
		
		
		int leftArr [] = new int [mid];
		int rightArr [] = new int [length-mid];
		
		for(int i =0; i<mid;i++)
			leftArr[i]=arr[i];
		
		for(int i =mid; i<length;i++)
			rightArr[i-mid]=arr[i];
		
		sort(leftArr);
		sort(rightArr);
		mergeArr(arr,leftArr,rightArr);
		leftArr=null;
		rightArr=null;
		
		
		
		
	}
	
	
	private void mergeArr(int [] f, int [] left , int [] right) {
		
		
		int length1 = left.length;
		int length2=right.length;
		
		
		int i =0,j=0,k=0;
		
		while(i<length1 && j<length2) {
			
			if(left[i] <= right[j])
			{
				
				f[k++]=left[i++];
			}else {
				
				f[k++]=right[j++];
			}
		}
		
		while(i<length1) {
			
			f[k++]=left[i++];
		}
		
      while(j<length1) {
			
			f[k++]=right[j++];
		}
		
		
	}
	
	
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	
	public static void main(String [] args) {
		int arr [] = { 5,2,19,11,12,4,23,6};
		
		MergeSort ms = new MergeSort();
		ms.sort(arr);
        ms.printArr(arr);		
		
		
	}
}
