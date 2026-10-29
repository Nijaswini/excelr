package Practice;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter A NUMBER:");
				int num = scanner.nextInt();
			
				squareanumber(num);
				
			}
			static void squareanumber(int num) {
				double result=Math.pow(num, 2);
				//double result= num*num;
				//System.out.printf("square of the number %d is %.1f",num,result);
			//static int square(int num) { return num * num;}
			//static int cube(int num) { return num * num * num;}
		//	static String getFullName(String first, String last){ return first+" "+last;
			     /*  static boolean ageCheck(int age) {
					if(age>=18) {
						return true;
					}else {
						return false;
					}
				}*/
			
			}
			}

