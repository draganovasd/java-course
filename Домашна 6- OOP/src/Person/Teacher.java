package Person;

public  class Teacher extends Person implements checkHomework  {
	
	private String subject;;
	
	public Teacher(){
		this.subject="";
	}
	public Teacher(String name, String familyName, int workExp, String subject){
		super(name, familyName, workExp);
		setSubject(subject);
		
	}
	public void setSubject(String subject){
		this.subject=subject;
	}
	public String getSubject(){
		return this.subject;
	}
	public void checkHomework(){
		System.out.println("I can check Homeworks!");
	}
	 public void HelloMethod(){
		 System.out.print("Hello ! How are you ? ");
	 }
	 public void GoodbyeMethod(){
		 System.out.print("Goodbye! See you later !");
	 }

}
