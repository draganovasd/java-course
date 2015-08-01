package Stock;

public class Meat extends Stock {
	private String animal;
	private boolean raw;
	
	public Meat(){
		super();
		this.animal="";
		this.raw=true;
	}
	public Meat(double price, boolean inStock ,String animal, boolean raw){
		super(price, inStock);
		setAnimal(animal);
		setMeat(raw);
		
	}
	public void setAnimal(String animal){
		this.animal=animal;
	}
	public String getAnimal(){
		return this.animal;
	}
	public void setMeat(boolean raw){
		this.raw=raw;
	}
	public boolean getMeat(){
		return this.raw;
	}


}
