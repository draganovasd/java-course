import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please input number of element in the Array: ");
		int numberOfElement=input.nextInt();
	    int  Array[]=new int[numberOfElement];
	    System.out.print("Enter the Array:  ");
	    for(int i=0; i<Array.length ;i++){
	    	Array[i]=input.nextInt();
	    }
	    boolean flag = true;  
	     int temp;   
         int j;
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

		

	}

}
