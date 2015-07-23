import java.util.Scanner;
public class BiggestNumber2 {
	
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter five numbers");
		System.out.print("Number1: ");
		int number1=input.nextInt();
		System.out.print("Number2: ");
		int number2=input.nextInt();
		System.out.print("Number3: ");
		int number3=input.nextInt();
		System.out.print("Number4: ");
		int number4=input.nextInt();
		System.out.print("Number5: ");
		int number5=input.nextInt();
		if(number1>number2&&number1>number3){
			System.out.println("The biggest number is : "+number1);
		}
		else if(number2>number1&&number2>number3&&number2>number4&&number2>number5){
			System.out.println("The biggest number is : "+number2);
		}
		else if (number3>number1&&number3>number2&&number3>number4&&number2>number5){
			System.out.println("The biggest number is : "+number3);
		}
		else if(number4>number5 && number4>number3 && number4>number2 && number4>number1) {
			System.out.println("The biggest number is : " +number4);
		}
		else if(number5>number4 && number5>number3 && number5>number2 && number5>number1 ){
			System.out.println("The biggest number is : "+number5);
		}
		else {
			System.out.println("The numbers are equal !  ");
		}
		
	input.close();

	}
}

