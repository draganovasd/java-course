import java.util.Scanner;
import java.util.Arrays;
public class FromAtoB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int a,b;
		System.out.print("a= ");
		a=input.nextInt();
		System.out.print("b= ");
		b=input.nextInt();
		for(int i=a; i<b ; i++ ){
			if(i % 3 == 0){
				System.out.print(i +" " );
			}
		
		}
	 input.close();
		

	}

}
