import java.util.Scanner;
public class BiggestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter three numbers");
		System.out.print("Number1: ");
		int number1=input.nextInt();
		System.out.print("Number2: ");
		int number2=input.nextInt();
		System.out.print("Number3: ");
		int number3=input.nextInt();
		if(number1>number2&&number1>number3){
			System.out.println("The biggest number is : "+number1);
		}
		else if(number2>number1&&number2>number3){
			System.out.println("The biggest number is : "+number2);
		}
		else if (number3>number1&&number3>number2){
			System.out.println("The biggest number is : "+number3);
		}
		else {
			System.out.println("The numbers are equal !  ");
		}
		input.close();

	}

}
