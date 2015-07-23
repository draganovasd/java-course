public class FromOneToHundredDoWhile {
	public static void main(String[] args) {
		int number=0;
		do{
				number++;
				if(number % 7 == 0  || number % 11 ==0){
					System.out.println(number);
					
				}else {
					continue;
				}
			
		}
		while(number<=100);

	}

}
