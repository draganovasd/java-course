import java.util.Arrays;
public class Student {

	protected String firstName;
	protected String lastName;
	protected long facNumber;
	protected int group;
	
	public Student(){
		super();
	}
	
	public Student(String firstName, String lastName, long facNumber, int group){
		setFirstName(firstName);
		setLastName(lastName);
		setFacNumber(facNumber);
		setGroup(group);
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

	public long getFacNumber() {
		return facNumber;
	}

	public void setFacNumber(long facNumber) {
		this.facNumber = facNumber;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String toString() {
		String temp=firstName+" "+lastName+ " "+facNumber +" "+group ;
		
		return temp;
	}

	public static void main(String[] args) {
		
		Student[] People=new Student[5];
		People[0]=new Student("Georgi","Ivanov",56465, 645465);
		People[1]=new Student("Georgi","Ivanov",56465, 645465);
		People[2]=new Student("Georgi","Ivanov",56465, 645465);
		People[3]=new Student("Georgi","Ivanov",56465, 645465);
		People[4]=new Student("Georgi","Ivanov",56465, 645465);
		for (int i = 0; i < People.length; i++) {
			System.out.println(People[i]);
		}
		

	}

}
