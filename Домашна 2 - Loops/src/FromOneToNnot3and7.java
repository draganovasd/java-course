import java.util.Scanner;
public class FromOneToNnot3and7 {
	public static void main(String[] args) {
		System.out.println("Please enter number : ");
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("N= ");
		int number=input.nextInt();
		for(int i=1; i<number ;i++){
			if(i%3==0 && i%7==0){
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		input.close();
	}

}