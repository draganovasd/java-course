package Account;

public class CorporativeAccount extends Account{
	
	private String firmName;
	private long bulstat;
	
	public CorporativeAccount(){
		
	}
	public CorporativeAccount(double money, String firmName, long bulstat) throws NegativeMoneyException{
		super(money);
		setFirmName(firmName);
		setBulstat(bulstat);
	}
	
	public void setFirmName(String name){
		this.firmName=name;
	}
	public String getFirmName(){
		return this.firmName;
	}
	
	public void setBulstat(long bulstat){
		this.bulstat=bulstat;
	}
	public long getBulstat(){
		return this.bulstat;
	}
	

}
