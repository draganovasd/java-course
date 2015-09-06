package Town;
import java.util.HashSet;

public class Town {
	private String townName;
	private String countryName;
	private long population;
	
	
	@Override
	public String toString() {
		
		return this.townName+" "+this.countryName+" "+this.population;
	}
	public Town(){
		townName="";
		countryName="";
		population=0;
		
	}
	public Town(String townName, String countryName, long population){
		setTownName(townName);
		setCountryName(countryName);
		setPopulation(population);
	}
	

	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public static void main(String[] args) {
		HashSet<Town> set = new HashSet<Town>();
		boolean check=false;
		Town town1=new Town("Burgas","Bulgaria", 260000);
		Town town2=new Town("Sofia","Bulgaria", 1600000);
		Town town3=new Town("Berlin","Germany", 10355234);
		Town town4=new Town("Washington","USA", 15552345);
		Town town5=new Town("Varna","Bulgaria", 330000);
		
		set.add(town1);
		set.add(town2);
		set.add(town3);
		set.add(town4);
		set.add(town5);
		System.out.println(set);
		for(Town element : set){
			if(element.townName=="Varna"){
				check=true;
			}
	
		}
		
		System.out.println("Check for Varna " +check);		
		set.remove(town5);
		
		for(Town element : set){
			if(element.townName=="Varna"){
				check=true;
			}
			else {
				check=false;
			}
		}
		System.out.println(set);
		System.out.println("Check for Varna " +check);	
	

	}

}
