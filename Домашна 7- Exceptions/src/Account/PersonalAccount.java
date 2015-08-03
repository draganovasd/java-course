package Account;

public class PersonalAccount extends Account {
	private String firstName;
	private long idNumber;
	
	public PersonalAccount(){
		setFirstName(" ");
		setIDNumber(0);
		
	}
	public PersonalAccount(double money, String firstName, long idNumber) throws NegativeMoneyException{
		super(money);
		setFirstName(firstName);
		setIDNumber(idNumber);
	}
	
	public void setFirstName(String name){
		this.firstName=name;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setIDNumber(long number){
		this.idNumber=number;
	}
	public long getIDNumber(){
		return idNumber;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
