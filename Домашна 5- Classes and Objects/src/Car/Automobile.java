package Car;

public class Automobile extends Car {
	private int expense;

	
	public Automobile(){
		this.expense=0;
		
	}
	
	public Automobile(int price,int expense){
		super(price);
		setExpense(expense);
		
	}
	public void setExpense(int expense){
		this.expense=expense;
	}
	public int getexpense(){
		return this.expense;
	}
	
	public void printFuelAndExpense(){
		System.out.println("Total expens: "+this.expense);
	}

	public static void main(String[] args) {
		Automobile MyAuto=new Automobile(6000,6);
		
		MyAuto.printFuelAndExpense();
		MyAuto.printPrice();
		
		

	}

}
