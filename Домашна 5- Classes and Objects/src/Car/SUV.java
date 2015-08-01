package Car;

public class SUV extends Car{
	private boolean highly;
	
	private SUV(){
		super();
		this.highly=true;
	}
	public SUV(int price, boolean highly){
		super(price);
		setHighly(highly);
	}
	public void setHighly(boolean highly){
		this.highly=highly;
	}
	public boolean getHighly(){
		return this.highly;
	}
	public void printHighly(){
		System.out.println("The car is highly: "+this.highly);
	}

	public static void main(String[] args) {
		SUV suv=new SUV(6000, false);
		suv.printPrice();
		suv.printHighly();

	}

}
