package Week14;

public class Student extends Person {
	String major;
	String class_rank;
	String student_email;
	
	public Student() {
		System.out.print("Major: ");
		major = userinput.nextLine();
		System.out.print("Class Rank: ");
		class_rank = userinput.nextLine();
		System.out.print("Student Email: ");
		student_email = userinput.nextLine();
	}
	
	public void go_to_class() {
		System.out.println("Going to class...");
		System.out.println("Arrived at classroom");
	}
	
	@Override
	public void eat() {
		System.out.println("Eating sandwich...");
	}
}
