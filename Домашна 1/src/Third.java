import java.util.Scanner;
public class Third {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Please enter first name :");
    String firstName = input.nextLine();
   
    System.out.println("Please enter familly name :");
    String familyName = input.nextLine();
    
    System.out.println("Please enter years :");
    int years=input.nextInt();
    
    System.out.println("Please enter gender (M-for male, F-for female) :");
    char gender = input.next().charAt(0);
    
    System.out.println("Please enter ID number :");
    long idNumber=input.nextLong();
    
    System.out.println("Please enter mobile number :");
    long mobileNumber=input.nextLong();
    
    System.out.print("First name: " +firstName);
    System.out.println();
    System.out.print("Family name: " +familyName);
    System.out.println();
    System.out.print("Years: " +years);
    System.out.println();
    System.out.print("Gender: " +gender);
    System.out.println();
    System.out.print("ID number: " +idNumber);
    System.out.println();
    System.out.print("Mobile number: " +mobileNumber);
    System.out.println();
    
   input.close();
	}

}
