package Countries;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Countries {
	static Scanner input = new Scanner(System.in, "UTF-8");

	public static void main(String[] args) {
		readFile("D:/���� ���� ��������/java-course/������� 8- Strings and Text Manipulations/src/files/countries.txt");
		System.out.println();
		String filePath = "D:/���� ���� ��������/java-course/������� 8- Strings and Text Manipulations/src/files/cities.txt";	
		try {
			PrintWriter writer = new PrintWriter(filePath, "UTF-8");
			String capital=" ";	
			for (int i = 0; i < 5; i++) {
				capital=input.nextLine();
				writer.println(capital);
			}		
			writer.close();			
		} 
		    catch (Exception e) {
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}		
		System.out.println("The file is successfully written !");
	}

		public static void readFile(String path){
		System.out.println("Please enter the capitals of the following countries : ");
	
			try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					System.out.println(line);
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}


}
