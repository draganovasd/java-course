import java.util.Scanner;
public class BonusPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter your points  [1;9] ! ");
		System.out.print("Points: ");
		int points=input.nextInt();
		
				if(1<=points&&points<=3){
					int	bonus=5;
					int result=bonus*points;
		System.out.println("Your result is: "+result);
		}
		else if(4<=points&&points<=6){
			int	bonus=10;
			int result=bonus*points;
		System.out.println("Your result is: "+result);
		}
		else if(7<=points&&points<=9){
			int	bonus=50;
			int result=bonus*points;
		System.out.println("Your result is: "+result);
		}
		else{
			System.out.println("Your points are out of the interval [1;9]");
		}
				
		
		input.close();
		
		

	}

}
