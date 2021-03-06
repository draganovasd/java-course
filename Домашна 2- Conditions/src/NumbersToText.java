import java.util.Scanner;
public class NumbersToText {
	
		public static void main(String[] args) {
			Scanner inputs = new Scanner(System.in, "UTF-8");
			
			System.out.print("Enter a number: ");
			int inputNum = inputs.nextInt();
			int hundreds = inputNum/100;
			inputNum = inputNum%100;
			int tenths = inputNum/10;
			int units = inputNum%10;
			boolean hunF=true, tenF=true, uniF=false, ifhunF=false, ifuniF=false;
			if(hundreds==0){
				hunF=false;
				hundreds=units;
				uniF=true;
				if(tenths==0 && units==0){
					System.out.println("Zero");
					tenF=false;
					uniF=false;
				}
				
			}else if(hundreds>=1 && hundreds<=9){
				ifhunF=true;
			}else if(hundreds>9){
				System.out.println("Invalid input");
				hunF=false;
			}
			
			if(!(tenths>=1 && tenths<=9)){
				tenF=false;
				if(hunF==false){
					ifuniF=true;
				}
			}
			if(units!=0){
				uniF=true;
			}
			
			while(uniF || tenF || hunF){
//				System.out.print(uniF + " " +tenF + " " + hunF);
				if(hunF==true && hundreds>=1 && hundreds<=9 && ifhunF==false){
					hunF=false;
					System.out.print(" hundred");
					hundreds=units;
					if(tenths == 1){
						System.out.print(" and ");
						
					}else if(tenF==false && uniF==true){
						ifuniF=true;
						System.out.print(" and ");
					}
				}
				
				if((uniF ==true && ifuniF==true) || (hunF==true && ifhunF==true)){
					if(hunF==true){
						ifhunF=false;
					}
					if(ifuniF==true){
						uniF=false;
					}
					switch (hundreds) {
					case 1:
						System.out.print("One");
						continue;
					case 2:
						System.out.print("Two");
						continue;
					case 3:
						System.out.print("Three");
						continue;
					case 4:
						System.out.print("Four");
						continue;
					case 5:
						System.out.print("Five");
						continue;
					case 6:
						System.out.print("Six");
						continue;
					case 7:
						System.out.print("Seven");
						continue;
					case 8:
						System.out.print("Eight");
						continue;
					case 9:
						System.out.print("Nine");
						continue;
					}
				}
				
				if(tenF){
					if(uniF==true){
						ifuniF=true;
					}
					tenF=false;
					if(tenths==1){
						uniF=false;
						switch (units) {
						case 1:
							System.out.print("eleven");
							break;
						case 2:
							System.out.print("twelve");
							break;
						case 3:
							System.out.print("thirteen");
							break;
						case 4:
							System.out.print("fourteen");
							break;
						case 5:
							System.out.print("fifteen");
							break;
						case 6:
							System.out.print("sixteen");
							break;
						case 7:
							System.out.print("seventeen");
							break;
						case 8:
							System.out.print("eighteen");
							break;
						case 9:
							System.out.print("nineteen");
							break;
						default:
							System.out.print("ten");
							break;
						}
					}
					switch (tenths) {
					case 2:
						System.out.print(" twenty ");
						continue;
					case 3:
						System.out.print(" thirty ");
						continue;
					case 4:
						System.out.print(" forty ");
						continue;
					case 5:
						System.out.print(" fifty ");
						continue;
					case 6:
						System.out.print(" sixty ");
						continue;
					case 7:
						System.out.print(" seventy ");
						continue;
					case 8:
						System.out.print(" eighty ");
						continue;
					case 9:
						System.out.print(" ninety ");
						continue;
					}
				}
			}
			inputs.close();
		}

}
