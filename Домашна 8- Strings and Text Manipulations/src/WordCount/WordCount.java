package WordCount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String sentance;
		String word;
		System.out.println("Please input a string !");
		sentance=input.nextLine();
		System.out.println("Please input a word to be counted ! ");
		word=input.nextLine();		
		Matcher m = Pattern.compile(word).matcher(sentance);
		int matches = 0;
		while(m.find())
		    matches++;
		System.out.printf("Number of times the word %s was used  : ",word);
		System.out.println(matches);

	}

}
