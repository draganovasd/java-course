package Cards;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Cards {

	public static void main(String[] args) {
		TreeMap<String,Integer> word = new TreeMap<String,Integer>();
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter the cards of the player :");
		String[] text=new String[5];
		for(int i=0; i<text.length;i++){
		 text[i]=input.nextLine();
		}
		
		for(String addWord:text){
			Integer count=word.get(addWord);
			if(count==null){
				count=0;				
			}
			word.put(addWord,count+1);
		}
		Set<String> wordsKeys=word.keySet();	
		
		for(String addWord:wordsKeys){
			int count=word.get(addWord);
			if(count==2){
				System.out.println("The player has PAIR ");
			}
			else if (count==3){
				System.out.println("The player has SET ");
			}
			else if (count==4){
				System.out.println("The player has QUADS ");
			}
		}
		
		

	}

}
