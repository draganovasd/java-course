import java.util.Scanner;
import java.util.Arrays;
public class IndeXx10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter Array size :");
		int n=input.nextInt();
		int[] Array= new int [n];
		for(int i=0; i < Array.length ; i++ ){
			Array[i]=i*10;
		}
		System.out.println(Arrays.toString(Array));
		input.close();

	}

}
