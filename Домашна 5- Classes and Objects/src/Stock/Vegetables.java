package Stock;

public class Vegetables extends Stock {
	private String name;
	private String colour;
	
	public Vegetables(){
		super();
		this.name="";
		this.colour="";
	}
	public Vegetables(double price, boolean inStock ,String name, String colour){
		super(price,inStock);
		setName(name);
		setColour(colour);
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setColour(String colour){
		this.colour=colour;
	}
	public String getColour(){
		return this.colour;
	}

	public static void main(String[] args) {
		

	}

}
