package Person;
import java.util.Arrays;
public  class SchoolTeacher extends Teacher implements  checkHomework {
	
	private String[] Classes=new String[5];
	
	public SchoolTeacher(){
		
	}
	public SchoolTeacher(String name, String familyName, int workExp, String subject, String Classes[] ){
		super(name,familyName,workExp,subject);
		setClasses(Classes);
		
	}
	public void setClasses(String[] classes){
		this.Classes=classes;
	}
	public String[] getClasses(){
		return this.Classes;
	}
	public void entertain(){
		System.out.println("I can entertain children ! ");
	}
	
	@Override
	public void checkHomework() {
		System.out.println("I can check Homeworks!");
	}
	public void printClasses() {
		System.out.println("Classes:");
		for (int i = 0; i < Classes.length; i++) {
			System.out.print(" " + Classes[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
			
			}

	}
