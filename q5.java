package generic;

import java.lang.reflect.Array;

public class q5 {
	public static <t> void countoccurance(t arr[],int n) {
		int sum = 0;
		for(t i:arr) {
			if(i.equals(n)) {
				sum++;
				
			}
		}
		System.out.print("Total number is " + sum);
	}

	public static void main(String[] args) {
		q5 obj = new q5();
		Integer arr[] = {1,2,1,2,3,4,5,1,2,3,2,1};
		
		Integer arr1[] = {1,2};
		Integer arr2[] = {3,4};
		obj.countoccurance(arr, 1);
		
		
		
		
		
		

	}

}