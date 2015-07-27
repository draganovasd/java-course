import java.util.Scanner;
import java.util.Random;
public class Ìultiplication {

	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0; i<20; i++ ){
		int result;
		int a,b,c;
		a=rand.nextInt(50);
		b=rand.nextInt(50);
		c=rand.nextInt(50);

		result=Multiplicate(a,b,c);
		System.out.print("Result= ");
		System.out.print(result);
		System.out.println();
		}

	}
	public static int Multiplicate(int a, int b, int c){
		int multiplication=0;
		multiplication=a*b*c;
		return multiplication;
	}

}
