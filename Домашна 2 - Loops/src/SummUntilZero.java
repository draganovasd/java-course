import java.util.Scanner;
public class SummUntilZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Iput numbers. For end of imput press 0.");
		double result=0;
		 double number=0;
		do{
			System.out.print("number: ");
			number=input.nextDouble();
			result+=number;
			
		}while(number !=0);
		System.out.println("The summ is : "+result);
		input.close();
		
	}

}
