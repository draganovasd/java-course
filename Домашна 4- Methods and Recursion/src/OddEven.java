
public class OddEven {

	public static void main(String[] args) {
		int number;
		
		number=5;
		print(number);
		
		number=10;
		print(number);
		
		number=3;
		print(number);
		
		number=896;
		print(number);

	}
	public static void print(int number){
		if(number%2==0){
			System.out.println("The number " +number +" is even!");
			return;
		}
		
		System.out.println("The number " +number  + " is odd!");
		return;
	}

}
