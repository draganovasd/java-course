import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("Please enter 4 numbers");
        System.out.println();
        System.out.println("First number:");
        double first = input.nextDouble();
        
        System.out.println("Second number:");
        double second = input.nextDouble();
        
        System.out.println("Third number:");
        double third = input.nextDouble();
        
        System.out.println("Fourth number:");
        double fourth = input.nextDouble();
        double sum=first+second+third+fourth;
        System.out.println("The sum numbers is: "+ sum);
        
        input.close();

	}

}
