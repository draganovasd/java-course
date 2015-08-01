package Person;

public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected int workExp;
	static int personCount=0;
	
	public Person(){
		super();
		this.firstName="";
		this.lastName="";
		this.workExp=0;
		
	}
	
	public Person(String name, String familyName, int workExp){
		personCount++;
		setName(name);
		setFamName(familyName);
		setWorkExp(workExp);
	}
	public void setName(String name){
		this.firstName=name;
	}
	public String getName(){
		return this.firstName;
	}
	public void setFamName(String familyName){
		this.lastName=familyName;
	}
	public String getFamName(){
		return this.lastName;
	}
	public void setWorkExp(int workExp){
		this.workExp=workExp;
	}
	public int getWorkExp(){
		return this.workExp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
