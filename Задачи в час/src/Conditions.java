import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter a number :");
		int number=input.nextInt();
		if(number==0){
			System.out.println("The number is Zero");
		}
		else{
		 if(number>0){
		  if(number%2==0) {
			 System.out.println("The number is Positive Even");
			 
		 }
		 else if(number%2!=0){
			 System.out.println("The number is Positive Odd");
		 }
		 }
		 else {
			 if(number%2==0){
				 System.out.println("The number is Negative Even");
			 }
			 else if(number%2!=0){
				 System.out.println("The number is Negative Odd");
			 }
		 }
		}
			 input.close();
		

	}

}
