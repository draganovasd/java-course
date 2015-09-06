package Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int number;
	HashMap<String, ArrayList<Double>> subjects = new HashMap<String, ArrayList<Double>>();
	
	public Student(){
		firstName="";
		lastName=" ";
		number=0;
	}
	public Student(String firstName, String lastName, int number){
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void addSubjectMark(Scanner input){
		System.out.println();
		System.out.print("Please enter a subject :");
		String subject=input.nextLine();
		ArrayList<Double> marks = new ArrayList<Double>();
		System.out.print("Please enter number of marks : ");
		int count=input.nextInt();
		for(int i=1; i<count+1 ; i++){
			System.out.printf("Mark[%d] :",i);
			double mark=input.nextDouble();
			input.nextLine();
			marks.add(mark);
		}
		subjects.put(subject, marks);
		calculateAvarageMark( subject);
		
	}
	
	public void calculateAvarageMark(String subject){
		List<Double> marks;
		double sum = 0;
		if(subjects.containsKey(subject)){
			marks = subjects.get(subject);			
			for(double mark : marks){
				sum += mark;
			}
			System.out.println();
			System.out.printf("Average mark for subject %s is %f", subject, (sum/marks.size()));
			System.out.println();
		}
	
	}
	@Override
	public String toString(){
		return String.format("%s %s %s" ,this.firstName,this.lastName,this.number );
	}

	@Override
	public int hashCode() {
		return this.subjects.hashCode();
	}

}
