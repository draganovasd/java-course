
import java.util.Scanner;
public class Array4x4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int Arr[][] = new int[4][4];
		int line;
		for(int i=0 ; i<Arr[0].length ; i++){
			Arr[0][i]=line=input.nextInt();
		}
		for(int i=0 ; i<Arr[1].length ; i++){
			Arr[1][i]=line=input.nextInt();
		}
		for(int i=0 ; i<Arr[2].length ; i++){
			Arr[2][i]=line=input.nextInt();
		}
		for(int i=0 ; i<Arr[3].length ; i++){
			Arr[3][i]=line=input.nextInt();
		}
		
		for(int i=0 ; i<Arr[0].length ; i++){
			if(Arr[0][i]%2!=0){
				Arr[0][i]=2*Arr[0][i];
			}
		}
		
		for(int i=0 ; i<Arr[1].length ; i++){
				if(Arr[1][i]%2!=0){
					Arr[1][i]=2*Arr[1][i];
				}
		}
		for(int i=0 ; i<Arr[2].length ; i++){
			if(Arr[2][i]%2!=0){
				Arr[2][i]=2*Arr[2][i];
			}
	}
		for(int i=0 ; i<Arr[3].length ; i++){
			if(Arr[3][i]%2!=0){
				Arr[3][i]=2*Arr[3][i];
			}
	}
		
		System.out.println();
		for(int row = 0; row < Arr.length; row++){
			for(int col = 0; col < Arr[row].length; col++){
				System.out.print(Arr[row][col] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
