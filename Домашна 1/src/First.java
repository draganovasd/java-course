import java.util.Scanner;
public class First {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	System.out.print("Please enter width: ");
	double width = input.nextDouble();
	System.out.print("Please enter length: ");
	double length =input.nextDouble();
	double area=width*length;
    System.out.print("The area is  : " +area);
    input.close();
	}

}
