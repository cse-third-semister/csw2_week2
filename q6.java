package generic;

public class q6 {
	public static <t> void merge(t arr1[], t arr2[] ,t arr3[]) {
		int j=0;
		int k =0;
		for(t i:arr1) {
			arr3[j] = arr1[j];
			j++;
			k++;	
		}
		k =0;
		for(t i:arr2) {
			arr3[j] = arr2[k];
			j++;
			k++;		
		}
		for(t i:arr3) {
			System.out.print(i + ",");	
		}
	}

	public static void main(String[] args) {
		q6 obj = new q6();
		
		
		Integer arr1[] = {};
		Integer arr2[] = {3,4,6};
		Integer arr3[] = new Integer[arr1.length + arr2.length];
		
		obj.merge(arr1, arr2, arr3);
		

	}

}
