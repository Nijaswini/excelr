package day3;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;

		int sum=0;

		System.out.println("Enter your number");

		int num=sc.nextInt();
		
		int flag=0

		for(int i=1;i<num;i++) {

			if(num%i==0) {

				sum=sum+i;

			}

		}

		if(flag==0) {

			System.out.println(num +"is a perfect number");

		}

		else {

			System.out.println(num +"is a  not perfect number");

		}

 

	}

 

}
	}

	
}
