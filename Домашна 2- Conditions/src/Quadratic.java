import java.util.Scanner;
 
public class Quadratic
{
  public static void main(String[] args)
  {
	  Scanner input = new Scanner(System.in, "UTF-8");
	    double a = 0;
	    double b = 0;
	    double c = 0;
	    double discriminant = 0;
	    double d = 0;
	    System.out.print("Enter the value of a : ");
	    a = input.nextDouble();
	    System.out.print("Enter the value of b : ");
	    b = input.nextDouble();
	    System.out.print("Enter the value of c : ");
	    c = input.nextDouble();
	    discriminant=Math.pow(b, 2)-4*a*c;
        d = Math.sqrt(discriminant);
        System.out.println("D= " +discriminant);
   
    if (discriminant > 0) {
       System.out.println("First root of the equation : "+(-b + d) / (2*a));
        
       System.out.println("Second root of the equation : " +(-b - d) / (2*a));
    }
    else if (discriminant==0){
    	System.out.println("There is only one root:  " +b/(2*a));
    }
    else{
       System.out.println("The roots are not real numbers.");
    }
    
    input.close();
  }
}
