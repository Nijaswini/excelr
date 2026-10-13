package day11;

public class Beta2 extends Thread{
	@Override
	public void run() {
		for(int i=1000;i<=2000;i++)
			System.out.println("\t" +i);
	}
}
