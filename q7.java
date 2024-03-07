package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class q7 {
	public static <t> void average(ArrayList<t> arr) {
		int sum = 0;
		for(t i:arr) {
			sum = sum + (int)i;
			
			
		}
		System.out.println("Average is " + sum /arr.size());
		
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		ArrayList <Integer> obj = new ArrayList<>();
		System.out.println("How many number to want to add");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			obj.add(sc.nextInt());
		}
		q7 objj = new q7();
		objj.average(obj);
		
		
		
		

	}

}
