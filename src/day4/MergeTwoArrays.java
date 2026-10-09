package day4;

public class MergeTwoArrays {
	public static void main(String[] args) {         
		int[] arr1 = {1, 3, 5};        
		int[] arr2 = {2, 4, 6};        
		int[] merged = new int[arr1.length + arr2.length];        
		System.arraycopy(arr1, 0, merged, 0, arr1.length);         
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);         
		System.out.print("Merged Array: ");         
		for (int num : merged) System.out.print(num + " ");     
		} 

}
