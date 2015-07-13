import java.util.Scanner;
public class Åighth {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Please enter a number ! ");
	System.out.print("number: ");
	int number=input.nextInt();
	
	if(number%2==0)
	{
		System.out.println("The number is åven");
	}
   if (number%2==1)
   {
	   System.out.println("The number is odd");
   }
   input.close();
	}

}
