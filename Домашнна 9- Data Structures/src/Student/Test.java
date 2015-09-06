package Student;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		Student student=new Student("Dimitar","Draganov",121214148);
		System.out.print("Student 1 : " +student);
		System.out.println();
		for (int i = 0; i < 5; i++) {
			student.addSubjectMark(input);
		}
			
		Student student1=new Student("Nikolai","Bonev", 121214156);
		System.out.print("Student 2 : " +student1);
		System.out.println();
		for (int i = 0; i < 5; i++) {
			student1.addSubjectMark(input);			
		}
			
		Student student2=new Student("Georgi","Bratoev", 121214183);
		System.out.print("Student 3 : " +student2);
		System.out.println();
		for (int i = 0; i < 5; i++) {
			student2.addSubjectMark(input);

		}
		
	}
	
	

}
