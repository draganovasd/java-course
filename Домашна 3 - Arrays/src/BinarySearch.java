import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in, "UTF-8");
		int numberOfElements;
		int search=0;
		int first=0;
		int j;
		System.out.print("Enter number of elements: ");
		numberOfElements=input.nextInt();
		int last=numberOfElements-1;
		int middle=(first+last)/2;
		int Array[]=new int[numberOfElements];
		
		System.out.println("Input "  +numberOfElements  +"  elelements in the Array ");
		for(int i=0; i<numberOfElements ; i++){
			Array[i]=input.nextInt();
		}
		System.out.print("Enter the number you want to find: ");
		search=input.nextInt();
	
		     boolean flag = true;  
		     int temp;   

		     while ( flag )
		     {
		            flag= false;    
		            for( j=0;  j < Array.length -1;  j++ )
		            {
		                   if ( Array[ j ] > Array[j+1] )   
		                   {
		                           temp = Array[ j ];               
		                           Array[ j ] = Array[ j+1 ];
		                           Array[ j+1 ] = temp;
		                          flag = true;              
		                  } 
		            } 
		      } 
		     System.out.print("The sorted array is : ");
		     System.out.println(Arrays.toString(Array));
		     
		     int retVal = Arrays.binarySearch(Array,search);
		     System.out.println("The index of element " + "\"" +search +"\"" + " is : " + retVal);

			
		
		
		input.close();

	}
}
	 