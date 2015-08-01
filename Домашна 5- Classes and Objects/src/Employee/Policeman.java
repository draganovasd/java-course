package Employee;

public class Policeman extends Employee{
	private String policemanRank;
	public Policeman(){
		super();
		this.policemanRank=" ";
	}
	public Policeman(String rank, int workHours,int salary){
		super(salary,workHours);
		setRank(rank);
		
	}
	
	public void setRank(String Rank){
		this.policemanRank=Rank;
		
	}
	
	public String getRank(){
		return this.policemanRank;
	}
	
	public void printRank(){
		System.out.println("The rank of the policeman is: "+this.policemanRank);
	}
	public static void main(String[] args) {
	Policeman MyPoliceman= new Policeman("Officer",1300, 150);
		MyPoliceman.printRank();
		MyPoliceman.print();

	}
}
