import java.util.Scanner;
public class Summ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in , "UTF-8");
		System.out.print("Please enter a number: ");
		int n;
		long Sum=0;
		n=input.nextInt();
		Sum=Summ(n);
		if(n<10){
			System.out.print("Please enter number>=10 !");
		}
		else{
			System.out.print("The sum from 1 to "+n +" is " + Sum);
		}
		

	}
	public static long Summ(long number){
		int sum=0;		
			for(int i=1; i<=number ; i++){
				sum+=i;
		}
		
	return sum;	
	}

}
