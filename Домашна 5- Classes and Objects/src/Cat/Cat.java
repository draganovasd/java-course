package Cat;

public class Cat {
	private String name;
	private int age;
	
	public  Cat(){
		this.name="";
		this.age=0;
	}
	
	public Cat(String name, int age){
		this();
		setName(name);
		setAge(age);
		
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public String getAge(){
		return this.name;
	}
	
	
	public void Say(){
		System.out.println("Name: "+this.name +"\tYears: "+this.age);
	}

	public static void main(String[] args) {
		 String [] CatName={"Gosho","Pisan","Misho","Shishko", "Topcho"};
         int[]Age={2,5,10,4,6};
        
         Cat[] arr=new Cat[5];
         for(int i=0;i<arr.length;i++){
                 String Name=CatName[i];
                 int age=Age[i];
                 Cat MyCat=new Cat(Name,age);
                 MyCat.Say();
         }

	}

}
