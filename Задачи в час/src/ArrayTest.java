import java.util.Scanner;
public class ArrayTest {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in, "UTF-8");
		int[][] ourArray = new int[4][4]; 
		int i=0;
		int j=0;
		int arr;
		System.out.println("Enter Array : ");
		
			for(i=0; i < ourArray.length ; i++ ){
				for(j=0 ; j<ourArray.length ; j++){
				ourArray[i][j]=arr=input.nextInt();
				}
				
			}
			for(i=0; i < ourArray.length ; i++ ){
				for(j=0 ; j<ourArray.length ; j++){
					if(ourArray[i][j]%2!=0){
						ourArray[i][j]=2*ourArray[i][j];
					}
				}
				
			}
			System.out.println();
			System.out.println("The new Array with even numbers is : ");
		for(int row = 0; row < ourArray.length; row++){
			for(int col = 0; col < ourArray[row].length; col++){
				System.out.print(ourArray[row][col] + " ");
			}
			System.out.println();
		}
	}
}

