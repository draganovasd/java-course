import java.util.Arrays;
import java.util.Scanner;
public class TaskOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");	
		System.out.println("Enter the number of elements in the array:");
		int n = input.nextInt();
		int[] Array = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			Array[i] = input.nextInt();
			
			reverseArray(Array);
			
			
		}
		input.close();
	}
	
	public static void reverseArray(int[] array){
		int[] reversedArray = new int[array.length];
		for (int i = 0; i < array.length ; i++) {
			reversedArray[i] = array[array.length - i - 1];
		}
		System.out.print(Arrays.toString(reversedArray));
	}
}
