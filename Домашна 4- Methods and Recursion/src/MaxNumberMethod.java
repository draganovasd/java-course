import java.util.Scanner;
public class MaxNumberMethod {

	public static void main(String[] args) {
		int maxNumber;
		int firstNumber;
		System.out.print("Please enter the first number: ");
		firstNumber=inputNumber();
		int secondNumber;
		System.out.print("Please enter the second number: ");
		secondNumber=inputNumber();
		maxNumber=compareNubers(firstNumber, secondNumber);
		System.out.print("The bigger number is : "+maxNumber);
	}
	
	public static int inputNumber() {
		Scanner input = new Scanner(System.in, "UTF-8");
		    int number;		
			number = input.nextInt();
		    return number;
	}
	
	public static int compareNubers(int firstNumber, int secondNumber){
		int maxNumber;
		if(firstNumber>secondNumber){
			maxNumber=firstNumber;
		}else {
			maxNumber=secondNumber;
		}
		
		return maxNumber;
	}
    
}
