import java.util.Scanner;
public class Ninth {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Please insert two numbers !");
	System.out.print("Number 1: ");
	int number1=input.nextInt();
	
	System.out.print("Number 2: ");
	int number2=input.nextInt();
	
	int rest=number1%number2;
	System.out.print("The rest is: "+rest);
	
    input.close();
	}

}
