package day4;

public class PairsWithGivenSum {
	  public static void main(String[] args) {         
		  int[] arr = {1, 2, 3, 4, 5};         
		  int target = 6;        
		  System.out.print("Pairs: ");         
		  for (int i = 0; i < arr.length; i++) {             
			  for (int j = i + 1; j < arr.length; j++) {                 
				  if (arr[i] + arr[j] == target) {                     
					  System.out.print("(" + arr[i] + ", " + arr[j] + ") ");                
					  }            
				  }         
			  }    
		  } 

}
