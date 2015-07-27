import java.util.Scanner;

public class Summ2 {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int number=inputNumber();
		int Sum=Summ(number);
		System.out.print("The sum from 1 to "+number +" is " + Sum);

	}

	public static int Summ(int num){		
		if(num>1){
			return num + Summ(num-1);
		}else{
			return 1;
		}
	}
	
	public static int inputNumber() {
		Scanner input = new Scanner(System.in, "UTF-8");
		int number=0;
		while(input.hasNextInt()){			
			number = input.nextInt();
			if(number>=10 && number<=30000){
				break;
			}
			System.out.print("Invalid number!\nEnter a number between 10 and 30 000: ");
		}
		input.close();
		return number;
	}

	}


