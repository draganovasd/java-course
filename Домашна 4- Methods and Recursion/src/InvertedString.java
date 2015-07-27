import java.util.Scanner;

public class InvertedString {

	public static void main(String[] args) {
		String nameOfString;
		
		nameOfString=inputString();
	    nameOfString=reverseString(nameOfString);
	    print(nameOfString);

	}
	
	public static String inputString(){
		Scanner input = new Scanner(System.in , "UTF-8");
		String inputString;
		System.out.print("Please input string: ");
		inputString=input.nextLine();
		input.close();
		return inputString;		
	}
	
	public static String reverseString(String string){
		String invertedString="";
		for(int i = string.length()-1 ; i >= 0 ; i--){
			invertedString+=string.charAt(i);
		}
		
		return invertedString;
	}
	
	public static void print(String content){
		System.out.print("The reversed String is: ");
		System.out.print(content);
		System.out.println();
	}
}
	
	
	
	
	
	
	
