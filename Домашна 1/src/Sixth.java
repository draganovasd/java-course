import java.util.Scanner;
public class Sixth {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Please eter the radius of a circle r ! ");
	System.out.println();
	System.out.print("r= ");
	double radius= input.nextDouble();
	double P=2*3.14*radius;
	double S=3.14*radius*radius;
	System.out.println("The length of the circle is : " +P);
	System.out.println("The area of the circle is : " +S);
	input.close();

	}

}
