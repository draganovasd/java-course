package Account;

public class Account {
	private double money;
	
	public Account(){
		
	}
	public Account(double money)  throws NegativeMoneyException{
		setMoney(money);
	}
	
	public void setMoney(double money)  throws NegativeMoneyException{
		checkMoney(money);
		this.money=money;
	}
	
	public double getMoney() {
		return this.money;
	}
	public static void checkMoney(double money) throws NegativeMoneyException{
		if(money<0){
			throw new NegativeMoneyException("You can't enter negative amount of money !!!");
			
		}else {
			return;
		}
	}
	
}
