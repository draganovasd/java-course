import java.util.Scanner;
public class SymetricalArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int sizeOfArray;
		
		System.out.print("Enter the size of the Array: ");
		sizeOfArray=input.nextInt();
		int Array[]=new int[sizeOfArray];
		System.out.println("Please Enter the elements of the Array");
		for(int i=0; i<Array.length; i++){
			Array[i]=input.nextInt();
		}
		for(int i=0; i<(Array.length/2); i++){
			if(Array[i]!=Array[sizeOfArray-i-1]){
				System.out.println("The array is NOT symetric  ");
				break;
			}
			else {
				
				System.out.print("The value is symetric ");
				break;
			}
		}
		
		
		input.close();

	}

}
