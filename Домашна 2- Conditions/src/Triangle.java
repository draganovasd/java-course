import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter the three sides of the triangle ! ");
		System.out.print("a: ");
		int a=input.nextInt();
		System.out.print("b: ");
		int b=input.nextInt();
		System.out.print("c: ");
		int c=input.nextInt();
		if(a<b+c && b<c+a && c<a+b){
			System.out.println("It is possible to have such a triangle !");
		}
		else { 
			System.out.println("It is immpossible to have such a triangle !");
		}
		input.close();

	}

}
