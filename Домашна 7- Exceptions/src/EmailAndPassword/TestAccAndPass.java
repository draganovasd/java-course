package EmailAndPassword;

public class TestAccAndPass extends Account {

	public static void main(String[] args) {
		Account Gosho= new Account("goshko@gmail.com ","gogasadsao1");
		Account Pesho=new Account("p@ab.bg","abv2312");
		Account Ivailo=new Account("Ivchoto@gmail.com","ivch1oto");
		
		try{
			Gosho.setAcc("goshkom@ail.com");
			Gosho.setPass("abvgdejz1");			
			System.out.println("Account name: "+Gosho.getAcc());
			System.out.println("Password : "+Gosho.getPass());
		}
		catch(IllegalArgumentException exception){
			System.out.println("An error: " + exception.getMessage());
		}
		
		
		System.out.println();
		
		
		try{
			Pesho.setAcc("pepi.com");
			Pesho.setPass("pepipeshev1");			
			System.out.println("Account name: "+Pesho.getAcc());
			System.out.println("Password : "+Pesho.getPass());
		}
		catch(IllegalArgumentException exception){
			System.out.println("An error: " + exception.getMessage());
		}
		
		
		System.out.println();
		
		
		try{
			Ivailo.setAcc("Ivchol@com");
			Ivailo.setPass("abvaddasdsa1");			
			System.out.println("Account name: "+Ivailo.getAcc());
			System.out.println("Password : "+Ivailo.getPass());
		}
		catch(IllegalArgumentException exception){
			System.out.println("An error: " + exception.getMessage());
		}
		
		System.out.println();

		
		try{
			Ivailo.setAcc("Ivchomail@.com");
			Ivailo.setPass("abvaddasdsa");			
			System.out.println("Account name: "+Ivailo.getAcc());
			System.out.println("Password : "+Ivailo.getPass());
		}
		catch(IllegalArgumentException exception){
			System.out.println("An error: " + exception.getMessage());
		}
		
		System.out.println();
		
		try{
			Ivailo.setAcc("g@s.b");
			Ivailo.setPass("ivcho1");			
			System.out.println("Account name: "+Ivailo.getAcc());
			System.out.println("Password : "+Ivailo.getPass());
		}
		catch(IllegalArgumentException exception){
			System.out.println("An error: " + exception.getMessage());
		}
		
	System.out.println();

		
		try{
			Ivailo.setAcc("Ivailo@.com");
			Ivailo.setPass("abbv1");			
			System.out.println("Account name: "+Ivailo.getAcc());
			System.out.println("Password : "+Ivailo.getPass());
		}
		catch(IllegalArgumentException exception){
			System.out.println("An error: " + exception.getMessage());
		}
		

		
	}

}
