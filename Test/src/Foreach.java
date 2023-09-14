
public class Foreach {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,5,40};
		
		int max = arr[0];
		
		for(int k:arr) {
			
//			System.out.print(k+" ");
			
			if(k>max) {
				max = k; 
			}
		}
		System.out.print(max);
	}

}
