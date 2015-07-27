import java.util.Scanner;
public class FactorialRecursive {

	public static void main(String[] args) {

			System.out.print("Factorial of number: ");
			int num=inputNumber();
			int factorial=factorialCalculation(1, num);
			System.out.println("Factoriel of !" + num + " is " + factorial);
		}
		
		public static int factorialCalculation(int firstNumber, int lastNumber){
			if(firstNumber<lastNumber){
				return firstNumber*factorialCalculation(firstNumber+1, lastNumber);
			}else{
				return lastNumber;
			}
		}
		
		public static int inputNumber() {
			Scanner input = new Scanner(System.in, "UTF-8");
			int inputNum = input.nextInt();	
			input.close();
			return inputNum;
		}
}

