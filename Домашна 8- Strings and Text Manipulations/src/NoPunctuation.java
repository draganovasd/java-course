import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NoPunctuation {
	public static void main(String[] args) {
		readFile("D:/���� ���� ��������/java-course/������� 8- Strings and Text Manipulations/src/files/punctuation.txt");
	}
	public static void readFile(String path){
		try{
			FileReader fRead=new FileReader(path);
			BufferedReader bR=new BufferedReader(fRead);
			while(bR.ready()){
				String line=bR.readLine().replaceAll("[,.;!?{}()%\"-]" , " ");
				writeIntoFile(line);
			}
			bR.close();
		}catch(Exception e){
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public static void writeIntoFile(String line){
		String path="D:/���� ���� ��������/java-course/������� 8- Strings and Text Manipulations/src/files/newPunctuation.txt";
		try{
			FileWriter writer=new FileWriter(path);
			BufferedWriter bWriter=new BufferedWriter(writer);
			bWriter.write(line);
			bWriter.newLine();
			bWriter.close();
			System.out.println("Writing into file successfull");
			
		}catch(Exception e){
			System.out.println("Error while writing a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}


}
