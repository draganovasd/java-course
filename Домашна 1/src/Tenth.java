import java.util.Scanner;
public class Tenth {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Please enter the length of the side of a triangle and its height");
	
	System.out.print("a= ");
	int a=input.nextInt();
	
	System.out.print("h=");
	int h=input.nextInt();
	
    int S;
    S=(a*h)/2;
    System.out.print("The the area of the triangle is S=" +S);
    input.close();
	
	}

}
