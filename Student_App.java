package Week14;

import java.util.Scanner;

public class Student_App {
	static Scanner userinput = new Scanner(System.in);
	
	public static void displayInfo(Student person) {
		//display student information
		System.out.println("\nFirst Name: " + person.first_name);
		System.out.println("Last Name: " + person.last_name);
		System.out.println("Gender: " + person.gender);
		System.out.println("Age: " + person.age);
		System.out.println("Weight: " + person.weight);
		System.out.println("Height: " + person.height);
		System.out.println("Ethnic Group: " + person.ethnic_group);
		System.out.println("Religion: " + person.religion);
		System.out.println("Major: " + person.major);
		System.out.println("Class Rank: " + person.class_rank);
		System.out.println("Student Email: " + person.student_email);
	}
	
	public static void displayActions() {
		//display a menu of actions
		System.out.println("\n1. Set Student Information");
		System.out.println("2. Get Student Information");
		System.out.println("3. Choose Student Activity");
		System.out.println("4. Quit");
	}
	
	public static void activity(Student person) {
		String activityAnswer = "0";
		//display a menu of options
		System.out.println("\n1. Say a greeting");
		System.out.println("2. Say a prayer");
		System.out.println("3. Take a nap");
		System.out.println("4. Eat something");
		System.out.println("5. Display name");
		System.out.println("6. Change religion");
		System.out.println("7. Go to class");
		//get a choice from the user
		System.out.print("Enter a number from the list: ");
		activityAnswer = userinput.nextLine();
		//call the correct method
		if (activityAnswer.equals("1")) {person.greeting();}
		if (activityAnswer.equals("2")) {person.prayer();}
		if (activityAnswer.equals("3")) {person.nap();}
		if (activityAnswer.equals("4")) {person.eat();}
		if (activityAnswer.equals("5")) {System.out.println(person.get_name());}
		if (activityAnswer.equals("6")) {person.set_religion();}
		if (activityAnswer.equals("7")) {person.go_to_class();}
	}
	
	public static void main(String[] args) {
		//create a new person
		System.out.println("Enter the requested information for a student.");
		Student person = new Student();
		String answer = "0";
		while (!answer.equals("4")) {
			//display a menu of actions
			displayActions();
			System.out.print("Enter a number from the list of actions: ");
			answer = userinput.nextLine();
			//call the correct method based on user's choice
			if (answer.equals("1")) {person = new Student();}
			if (answer.equals("2")) {displayInfo(person);}
			if (answer.equals("3")) {activity(person);}
		}
	}
}
