import java.util.Scanner;
public class DeckOfCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter a symbol ! ");
		String symbol=input.nextLine();
		switch(symbol){
		case "2":
			System.out.println("this is valid card");
			break;
		case "3":
			System.out.println("this is valid card");
			break;
		case "4":
			System.out.println("this is valid card");
			break;
		case "5":
			System.out.println("this is valid card");
			break;
		case "6":
			System.out.println("this is valid card");
			break;
		case "7":
			System.out.println("this is valid card");
			break;
		case "8":
		System.out.println("this is valid card");
		break;
		case "9":
			System.out.println("this is valid card");
			break;
		case "10":
			System.out.println("this is valid card");
			break;
		case "A":
			System.out.println("this is valid card");
			break;
		case "J":
			System.out.println("this is valid card");
			break;
		case "Q":
			System.out.println("this is valid card");
			break;
		case "K":
			System.out.println("this is valid card");
			break;
			default:
				System.out.println("This is invalid card");
		}
		input.close();
	}

}
