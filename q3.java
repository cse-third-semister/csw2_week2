package generic;

public class q3  {
	
	public  static <t> void printarray(t arr[]) {
		for(t i:arr) {
			System.out.print(i + ",");
			
		}

		
		
	}
	

	public static void main(String[] args) {
		q3  obj = new q3();
		Integer s [] = {5,6,9,7};
		obj.printarray(s);
		

	}

}