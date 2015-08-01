package Stock;

public class Fruits extends Stock {
	private String taste;
	private String kilograms;
	
	public Fruits(){
		super();
		this.taste="";
		this.kilograms="";
	}
	public Fruits(double price, boolean inStock, String taste, String kilograms){
		super(price, inStock);
		setTaste(taste);
		setKilograms(kilograms);
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getTaste() {
		return this.taste;
	}
	
	public void setKilograms(String kilograms) {
		this.kilograms = kilograms;
	}
	public String getKilograms() {
		return this.kilograms;
	}
	
	

	public static void main(String[] args) {
		
	}

}
