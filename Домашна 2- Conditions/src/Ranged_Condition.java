import java.util.Scanner;
public class Ranged_Condition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter a number ! ");
		System.out.print("Number: ");
		int number=input.nextInt();
		if(1<=number && number <=5){
			if(number%2==0){
				System.out.println("The number is even");
			}
			else {
				System.out.println("The number is odd");
			}
		}
		else if (6<=number&&number<=15){
			if(number%3==0){
				System.out.println("The number is devided by 3");
			}
			else { 
				System.out.println("The number is not devided by 3");
			}
		}
		else{
			if(number>0){
				System.out.println("The number is positive");
			}
			else if(number<0){
				System.out.println("The number is negative");
			}
			else {
			    System.out.println("The number is Zero");
			}
		}	
	    input.close();
		}

}
