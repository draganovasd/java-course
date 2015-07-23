import java.util.Scanner;
import java.util.Arrays;
public class EvenElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter Array size :");
		int n=input.nextInt();
		int[] Array= new int [n];
		int arr;
		int Sum=0;
		for(int i=0; i < Array.length ; i++ ){
			{
		   Array[i]=arr=input.nextInt();
			}
		}
		for(int i=0 ; i < Array.length ; i++){
			if(Array[i]%2==0){
				Sum+=Array[i];
			}
		}
		System.out.print("The Summ of the even numbers is : " +Sum);
		input.close();
	}

	}


