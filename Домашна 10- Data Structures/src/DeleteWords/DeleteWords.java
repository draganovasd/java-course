package DeleteWords;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class DeleteWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		Queue<String> queue = new LinkedList<String>();	
		
		System.out.println("Please input text  !");
		String text=input.nextLine();
		
		String[] temp= text.split("[\\W\\s]");	
		
		for(int i=0; i<temp.length ;i++){
			if(temp[i].length()>3){
			
				queue.offer(temp[i]);
				
			}
			
		}
		while (queue.size() > 0) {		
			String content= queue.poll();		
			System.out.print(content + " ");	
		}

	}

}
