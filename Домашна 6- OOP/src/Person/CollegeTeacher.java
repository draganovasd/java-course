package Person;

public class CollegeTeacher extends Teacher implements checkHomework {
	private String college;
	
	public CollegeTeacher(){
		this.college="";
	}
	public CollegeTeacher(String name, String familyName, int workExp, String subject, String college){
		super(name,familyName,workExp,subject);
		setCollege(college);
	}
	public void setCollege(String college){
		this.college=college;
	}
	public String getCollege(){
		return this.college;
	}
	@Override
	public void checkHomework() {
		System.out.println("I can check Homeworks!");
	}
	public void writeArticles(){
		System.out.println("I can write articles!");
	}
	 	
	

}
