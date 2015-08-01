package Person;

public class Professor extends Lecturer implements checkHomework {
	
	private String title;
	
	private Professor(){
		this.title="";
		
	}
	public Professor(String name, String familyName, int workExp, String university,String title){
		super(name,familyName,workExp,university);
		setTitle(title);	
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}
	@Override
	public void checkHomework() {
		System.out.println("Checking the homework! ");
	}
	public void conductExam(){
		System.out.println("I can conduct exams!");
	}
	
	public void sayTitleAndExperience(){
		System.out.println("My title is "+title +" and I have " +workExp +" years of working experience !");
	}
	
	
		
	
	
	
	
	

}
