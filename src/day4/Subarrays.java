package day4;

public class Subarrays {
	public static void main(String[] args) {        
		int[] arr = {1, 2, 3};        
		int n = arr.length;         
		for (int i = 0; i < n; i++) {            
			for (int j = i; j < n; j++) {                
				System.out.print("{");                 
				for (int k = i; k <= j; k++) {                     
					System.out.print(arr[k] + (k == j ? "" : ", "));                 
					}                 System.out.print("} ");             
				}
		}
	} 
	

}
