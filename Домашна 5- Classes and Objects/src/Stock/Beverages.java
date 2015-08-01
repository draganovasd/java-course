package Stock;

public class Beverages extends Stock{
	private String fizzy;
	private String alcohol;
	
	public Beverages(){
		super();
		this.fizzy="";
		this.alcohol="";
	}
	
	public Beverages(double price, boolean inStock, String fizzy, String alcohol){
		super(price,inStock);
		setFizzy(fizzy);
		setAlcohol(alcohol);
		
	}
	
	public void  setFizzy(String fizzy){
		this.fizzy=fizzy;
		
	}
	public String getFizzy(){
		return this.fizzy;
	}
	public void setAlcohol(String alcohol){
		this.alcohol=alcohol;
	}
	public String getAlcohol(){
		return this.alcohol;
	}

	public static void main(String[] args) {
		

	}

}
