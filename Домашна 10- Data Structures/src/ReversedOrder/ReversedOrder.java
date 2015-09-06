package ReversedOrder;

import java.util.Scanner;
import java.util.Stack;

public class ReversedOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		Stack<String> myStack = new Stack<String>();
		
		System.out.println("Please input text  !");
		String text=input.nextLine();
		
		String[] temp= text.split("[\\W\\s]");	

		for(int i=0; i<temp.length ;i++){
			myStack.push(temp[i]);
		}
		
		while(!myStack.isEmpty()){		
			System.out.print(myStack.pop() + " ");
		}
		

	}

	
}
