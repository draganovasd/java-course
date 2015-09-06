package UppLowCase;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class UpLowCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		Queue<Character> queue = new LinkedList<Character>();
		Stack<Character> myStack = new Stack<Character>();
		
		System.out.println("Please input text  !");

		String text;
		text=input.nextLine();
		for(int i=0; i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))==true){
				Character temp=text.charAt(i);
				myStack.push(temp);
				
			}
		   
		    else if(Character.isLowerCase(text.charAt(i))==true){
		    	Character tempQue=text.charAt(i);
		    	queue.offer(tempQue);
		    	
		    }
		    
		}
		System.out.print("Upper Case : ");
		while(!myStack.isEmpty()){
			Character current = myStack.pop();			
			System.out.print(current + " ");
		}
		System.out.println();
		System.out.print("Lower Case :");
		
		while (queue.size() > 0) {		
			Character currentQ= queue.poll();		
			System.out.print(currentQ +" ");	
		}
	}


}
