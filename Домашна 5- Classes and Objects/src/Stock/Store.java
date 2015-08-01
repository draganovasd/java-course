package Stock;
import Stock.Stock;

public class Store {
	private String storeName;
	private String location;

	public Store() {
		setName("");
		setLocation("");
	}
	
	public Store(String storeName, String location) {
		setName(storeName);
		setLocation(location);
	}
	public void setName(String storeName){
		this.storeName=storeName;
	}
	public String getName(){
		return this.storeName;
	}
	public void setLocation(String location){
		this.location=location;
		
	}
	public String getLocation(){
		return this.location;
	}
	
	
	public static void main(String[] args) {
		
	
		

	}

}
