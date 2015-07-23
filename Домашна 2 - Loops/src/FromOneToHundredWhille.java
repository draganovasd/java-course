public class FromOneToHundredWhille {

	public static void main(String[] args) {
		int number=0;
		while(number<=100){
			number++;
			if(number % 7 == 0  || number % 11 ==0){
				System.out.println(number);
				
			}else {
				continue;
			}
		}

	}

}
