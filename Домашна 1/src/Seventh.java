import java.util.Scanner;
public class Seventh {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Please input a number ! ");
	System.out.println();
	
	System.out.print("number = "); // ��������� �������;
	int number=input.nextInt();
	boolean result1=true, result2=false;
	if(number%5==0 && number%7==0) //��������� ���� ������� �� ���� ��� ������� �� 5 � �� 7
	{
	 System.out.println("The result is "+result1);
	}
	else 
	System.out.println("The result is "+result2);
	 input.close();
	}
  
}
