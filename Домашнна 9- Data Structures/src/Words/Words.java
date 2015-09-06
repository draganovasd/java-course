package Words;

import java.util.Set;
import java.util.TreeMap;

public class Words {

	public static void main(String[] args) {
		
		String [] words={"one","two","two","three","three","three","four","four","four","four","five","five","five","five","five","six",
				          "seven","eight","nine", "teh"};		
		TreeMap<String,Integer> word = new TreeMap<String,Integer>();         
		for(String addWord:words){
			Integer count=word.get(addWord);
			if(count==null){
				count=0;				
			}
			word.put(addWord,count+1);
		}
		Set<String> wordsKeys=word.keySet();		
		for(String addWord:wordsKeys){
			int count=word.get(addWord);
			System.out.printf("%s -> %d times",addWord,count);
			System.out.println();
			
		}
	}
}
