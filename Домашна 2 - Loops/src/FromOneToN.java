import java.util.Scanner;
public class FromOneToN {

	public static void main(String[] args) {
		System.out.println("Please enter number : ");
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("N= ");
		int number=input.nextInt();
		for(int i=1; i<number ;i++){
			System.out.println(i);
		}
		input.close();
	}

}

