
package Greeting;
import java.util.Scanner;
public class Greeting {
	private String sentance;
	
	public Greeting(){
		sentance=" ";
	}
	public Greeting(String sentance){
		setSentance(sentance);
	}
	

	public String getSentance() {
		return sentance;
	}
	public void setSentance(String sentance) {
		this.sentance = sentance;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please input a sentance !");
		String a=input.nextLine();
		Greeting sentance=new Greeting(a);
		boolean startsWith = a.startsWith("Greeting");
		System.out.format("The sentance begins with thew word \"Greeting\": %s \n", startsWith);
        boolean endsWith = a.endsWith(".");
		System.out.format("The sentance ends with the word \".\": %s \n", endsWith);
	    boolean contains = a.contains("water");
		System.out.format("The sentance contains the word \"water\": %s \n", contains);
		
			
		}

	}
