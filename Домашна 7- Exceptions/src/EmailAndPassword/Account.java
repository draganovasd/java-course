package EmailAndPassword;

public class Account {
	public String acc;
	public String pass;
	public String chek0=new String("0");
	public String chek1=new String("1");
	public String chek2=new String("2");
	public String chek3=new String("3");
	public String chek4=new String("4");
	public String chek5=new String("5");
	public String chek6=new String("6");
	public String chek7=new String("7");
	public String chek8=new String("8");
	public String chek9=new String("9");
	
	
	public Account(){
		super();
	}
	
	public Account(String acc, String pass){
		super();
		setAcc(acc);
		setPass(pass);
	}
	
	public void setAcc(String acc){
		 if(acc.length()<6){		 
			 throw new IllegalArgumentException("Account length must be atleast 5 symbols !!!");
		 }
		 else if(acc.indexOf("@")==-1){
			 throw new IllegalArgumentException("Account name must contain  '@'  !!!");		 
		 }
		 else if (acc.indexOf(".")==-1){
			 throw new IllegalArgumentException("Account name must contain ' . '  !!!");
		 }
		this.acc=acc;
	}
	public String getAcc(){
		return this.acc;
	}
	public void setPass(String pass){
		if(pass.length()<6){
			 throw new IllegalArgumentException("Password length must be atleast 6 symbols !!!");
		}
		else  if(pass.indexOf(chek1)!=-1 || pass.indexOf(chek2)!=-1 || pass.indexOf(chek3)!=-1 || pass.indexOf(chek4)!=-1||pass.indexOf(chek5)!=-1||pass.indexOf(chek6)!=-1||pass.indexOf(chek7)!=-1||pass.indexOf(chek8)!=-1||pass.indexOf(chek9)!=-1||pass.indexOf(chek0)!=-1){
			
		}
		else{
			throw new IllegalArgumentException("Password must contain atleast one number !!!");
		}
		
		this.pass=pass;
	}
	
	
	public String getPass(){
		return this.pass;
	}
	
	

}
