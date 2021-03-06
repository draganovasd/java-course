package Person;

public class Lecturer extends Person implements checkHomework {
	private String university;
	private final int maxLections = 10;
	
	public Lecturer(){
		this.university="";
	}
	public Lecturer(String name, String familyName, int workExp, String university){
		super(name,familyName,workExp);
		setUniversity(university);
	}
	public void setUniversity(String university){
		this.university=university;
	}
	public String getUniversity(){
		return this.university;
	}
	@Override
	public void checkHomework() {
		System.out.println("I can check Homeworks!");
		
	}
	public void HelloMethod() {
		 System.out.println("Hello ! How are you ? ");
	}
	public int getMaxLektions() {
		return this.maxLections;
	}
	public void printMaxLections(){
		System.out.println("Max lections per week is: "+this.maxLections);
	}
	
	public void exercises(String subject) {
		System.out.printf("Today I have exercise on "+subject);
	}

	public void exercises(String subject, int hours) {
		System.out.printf("Today I have exercise on " +subject +" which will continue " + hours +" hours !");
	}

	public void exercises(String subject, int hours, int group) {
		System.out.printf("Today I have exercise on " +subject  +" with group "+ group +" which will continue " + hours +" hours !");
	}

}
