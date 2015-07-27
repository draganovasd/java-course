import java.util.Scanner;
import java.util.Arrays;
public class ReversedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");	
		System.out.println("Enter the number of elements in the array:");
		int n = input.nextInt();
		
		int[] Array = new int[n];
		int[] reversedArray = new int[Array.length];
		
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			Array[i] = input.nextInt();
		}
		
		
		for (int i = 0; i < Array.length ; i++) {
			reversedArray[i] = Array[n - i - 1];
		}

		input.close();
		System.out.print(Arrays.toString(reversedArray));
	}

	}


