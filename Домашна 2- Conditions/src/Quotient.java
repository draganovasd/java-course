import java.util.Scanner;
public class Quotient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter two numbers");
		System.out.print("Number1: ");
		int number1=input.nextInt();
		System.out.print("Number2: ");
		int number2=input.nextInt();
		if(number1>0&&number2>0){
			System.out.println("The symbol is  + ");
		}
		else if(number1>0&&number2<0){
			System.out.println("The symbol is - ");
		}
		else if(number1<0&&number2>0){
			System.out.println("The symbol is - ");
		}
		else {
			System.out.println("The symbol is + ");
		}
		input.close();
	}
    
}
