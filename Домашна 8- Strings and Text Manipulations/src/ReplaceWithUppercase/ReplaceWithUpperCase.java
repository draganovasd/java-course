package ReplaceWithUppercase;
import java.util.Scanner;

public class ReplaceWithUpperCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String sentance;
		String word;
		System.out.println("Please input a string !");
		sentance=input.nextLine();
		System.out.println("Please input a word to be replaced witht uppercase ! ");
		word=input.nextLine();
		String newStr=sentance.replaceAll(word, word.toUpperCase());		
		System.out.println("The new string is : ");
		System.out.println(newStr);
		

	}

}

