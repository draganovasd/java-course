package ReversedOrder;
import java.util.Scanner;

public class ReversedOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String test=" ";
		System.out.println("Please input a string to reverse !");
		test=input.nextLine();
		StringBuffer a = new StringBuffer(test);
	    System.out.println(a.reverse());
		

	}

}
