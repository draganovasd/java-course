package Thread;

public class Z extends Thread  {

	public void run(){

		for (int i = 0; i < 1000000; i++) {
			System.out.print("z");		
		}
	
	}
	
	public static void main(String[] args) {
		Thread t1 = new Z();
		Thread t2 = new Numbers();
		Thread t3 = new Sleep();
		t1.start();
		t2.start();
		t3.start();

	}

}
