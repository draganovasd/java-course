package Person;

public class Test {
	

	public static void main(String[] args) {
		
		
		System.out.println();
		System.out.println("Teacher:");
		
		Teacher teacher = new Teacher("Georgi", "Popov", 3, "Chemestry");
		teacher.HelloMethod();
		System.out.println();
		teacher.checkHomework();
		teacher.GoodbyeMethod();
		
		System.out.println();
		System.out.println();
		System.out.println("School teacher: ");
		
		String[] array = {"1A", "5E", "2A", "6B", "4M"};	
		SchoolTeacher schoolTeacher = new SchoolTeacher("Rado", "Hristov", 4, "Sports", array);
		schoolTeacher.printClasses();
		schoolTeacher.entertain();
		schoolTeacher.checkHomework();
		
		System.out.println();
		System.out.println("College teacher: ");
		
    	CollegeTeacher collegeTeacher = new CollegeTeacher("Kristiqn", "Bonew", 5, "Math", "Stamford college");
		collegeTeacher.checkHomework();
		collegeTeacher.writeArticles();
		
		System.out.println();
		System.out.println("Lecturer: ");

		Lecturer lecturer = new Lecturer("Petur", "Georgiev", 10, "Sofia University");
		lecturer.HelloMethod();
		lecturer.checkHomework();
		lecturer.printMaxLections();
		lecturer.exercises("Chemestry");
		System.out.println();
		lecturer.exercises("Science", 3);
		System.out.println();
		lecturer.exercises("Math", 5, 43);
		
		System.out.println();
		System.out.println();
		System.out.println("Professor: ");
		
		Professor professor = new Professor("Ilian", "Pashov", 10, "Technical University", "Docent");
		professor.sayTitleAndExperience();
		professor.conductExam();
		professor.checkHomework();
		
		System.out.println();
		System.out.println("Assistant1: ");
	
	    Assistant assistant = new Assistant("Dean", "Blagoev", 11, "Technical University", true);
		assistant.sayName();
	    assistant.checkHomework();
		assistant.checkExam();
		assistant.writeArticles();
		
		System.out.println();
		System.out.println("Assistant2: ");
		
		Assistant assistant1 = new Assistant("Martin", "Ivanov", 5, "UNSS", false);
	    assistant1.sayName();
	    assistant1.checkHomework();
		assistant1.checkExam();
		assistant1.writeArticles();
		
		System.out.println();
		System.out.println("There are " +Person.personCount  + " instances made !");
		
	}

}
















