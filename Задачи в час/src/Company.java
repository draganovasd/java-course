
import java.util.ArrayList;
public class Company {
	public static void main(String[] args) {
		
		
		ArrayList<Company> people = new ArrayList<Company>();

		people.add(new Company("Gerdjikov", 5));
		people.add(new Company("Gerdjikoadsv", 15));
		people.add(new Company("Gerdji",25));
		Company bigest=people.get(0);
		
			if(people.get(0).number>people.get(1).number && people.get(0).number>people.get(2).number){
				bigest=people.get(0);
			}
			else if(people.get(1).number>people.get(0).number && people.get(1).number>people.get(2).number){
				bigest=people.get(1);
			}
			else{
				bigest=people.get(2);
			}
			people.remove(bigest);
			
			System.out.println(people);
			
			people.add(new Company("ani", 1225));
			people.add(new Company("adsads", 2315));
			
			System.out.println(people);
			
			if(people.get(0).name.length()>people.get(1).name.length() && people.get(0).name.length()>people.get(2).name.length() && people.get(0).name.length()>people.get(3).name.length()){
				people.set(0, new Company ( "NEW COMPANY",777));
			}
			else if(people.get(1).name.length()>people.get(0).name.length() && people.get(1).name.length()>people.get(2).name.length() &&people.get(1).name.length()>people.get(3).name.length()){
				people.set(1, new Company ( "NEW COMPANY",777));
			}
			else if(people.get(2).name.length()>people.get(0).name.length() && people.get(2).name.length()>people.get(1).name.length() &&people.get(2).name.length()>people.get(3).name.length()){
				people.set(2, new Company ( "NEW COMPANY",777));
			}
			else{
				people.set(3, new Company ( "NEW COMPANY",777));
			}
			System.out.println(people);
			
	}
	
	private  String name;
	private int number;
	
	public Company(){
		setName(" ");
		setNumber(0);
	}
	
	public Company(String name, int number){
		setName(name);
		setNumber(number);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	public String toString(){
		return name+" "+number;
		
	}

}
