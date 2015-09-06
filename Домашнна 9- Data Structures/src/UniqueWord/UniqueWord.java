package UniqueWord;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class UniqueWord {

	public static void main(String[] args) {
		TreeMap<String,Integer> word = new TreeMap<String,Integer>();
		HashSet<String> set = new HashSet<String>();
		Scanner input = new Scanner(System.in, "UTF-8");
		String text;
		System.out.println("Please input text : ");
		text=input.nextLine();
		String[] parts=text.split(" ");
		
		for(String addWord:parts){
			Integer count=word.get(addWord);
			if(count==null){
				count=0;				
			}
			word.put(addWord,count+1);
		}
		
		Set<String> wordsKeys=word.keySet();	
		
		for(String addWord:wordsKeys){
			int count=word.get(addWord);
			if(count==1){
			set.add(addWord);	
			}
		}
		
		System.out.println("The Unique words are : ");
		
		for (String s : set) {
		    System.out.print(s +" , ");
		}
		input.close();
	}
}
