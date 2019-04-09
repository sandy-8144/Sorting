package com.programming.algo.sorting;

public class CountSort {

	private static int RANGE=9;
/*
  * It is used when numbers are in a particular range e.g. 0-9. only for positive int. e.g. sort students (~lakhs) based on their marks
  * ######Steps####### 
  * 1. A count [] is created which tracks the number of times a digit occurred.
  * 2. increase the count by count+privous_index_count
  * 3. create new output [] .
  * 4. iterate original array treat the element as index in count [], value of count[element] will give position of element. 
  * 5. put the element in output [] are reduce the count value in count [].
  * 
  * TC: O(RANGE+ num_of_elements)
  * Ref: 
  * 
  * https://www.youtube.com/watch?v=7zuGmKfUt7s&list=PLqM7alHXFySHrGIxeBOo4-mKO4H8j2knW&index=6
  * 
  */
	
	public int [] sort(int [] arr) {
		int length = arr.length;
		int [] output = new int[length];
		int [] count = new int[RANGE+1];
		
		// getting the count of each element in arr []
		for(int i = 0; i<length;i++)
		{
			count[arr[i]]=count[arr[i]]+1;
		}
		
		// step 2
		for(int i = 1; i <count.length; i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		//step 5
		
		for(int i=0; i <length;i++)
		{
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]] = count[arr[i]]-1;
			
		}
		
		return output;
		
		
	}
	
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	public static void main(String [] args) {
		int arr [] = { 1,1,3,4,2,7,8,6};
		
		CountSort cs = new CountSort();
		int [] finalArr = cs.sort(arr);
        cs.printArr(finalArr);		
		
		
	}
	
}
