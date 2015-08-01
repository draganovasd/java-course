package Person;

public class Assistant extends Lecturer implements checkHomework{
	
	private boolean mainAssist;
	
	public Assistant(){
		mainAssist=false;
	}
	public Assistant(String name, String familyName, int workExp, String university, boolean mainAssist){
		super(name,familyName,workExp,university);
		setMainAssist(mainAssist);
	}
	public void setMainAssist(boolean assist){
		this.mainAssist=assist;
	}
	public boolean getMainAssist(){
		return this.mainAssist;
	}
	public void sayName(){
		System.out.println("My name is "+this.firstName +" and it is " +this.mainAssist  +" that I am main Assistant");
	}
	@Override
	public void checkHomework() {
		System.out.println("Checking the homework! ");
		
	}
	public void checkExam(){
		System.out.println("I can check exams!");
	}
	public void writeArticles(){
		System.out.println("I can write articles!");
	}
	
	

}
