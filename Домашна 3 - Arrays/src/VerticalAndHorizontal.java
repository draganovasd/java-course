import java.util.Scanner;
public class VerticalAndHorizontal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

				int n;
				int i=0;
				int j=0;
				int arr;
				System.out.print("Enter the number of rows and columns:  ");
				n=input.nextInt();
				int[][] ourArray = new int[n][n];
				System.out.println("Enter Array : ");
				
					for(i=0; i < ourArray.length ; i++ ){
						for(j=0 ; j<ourArray.length ; j++){
						ourArray[j][i]=arr=input.nextInt();
						}
						
					}
					
					System.out.println();
					System.out.println("Array : ");
				for(int row = 0; row < ourArray.length; row++){
					for(int col = 0; col < ourArray[row].length; col++){
						System.out.print(ourArray[row][col] + " ");
					}
					System.out.println();
				}
			}
		}





