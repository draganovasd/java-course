import java.util.Scanner;
public class NgradeM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter number N and its grade M");
        System.out.print("N= ");
        int n=input.nextInt();
        System.out.print("M= ");
        int m=input.nextInt();
        System.out.print("The result is " + Math.pow(n, m));
        input.close();
	}

}