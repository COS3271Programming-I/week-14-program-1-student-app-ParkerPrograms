package Week14;
import java.util.Scanner;

public class Person {
	static Scanner userinput = new Scanner(System.in);
	String first_name;
	String last_name;
	String gender;
	int age;
	double weight;
	double height;
	String ethnic_group;
	String religion;
	
	public Person() {
		System.out.print("First Name: ");
		first_name = userinput.nextLine();
		System.out.print("Last Name: ");
		last_name = userinput.nextLine();
		System.out.print("Gender: ");
		gender =  userinput.nextLine();
		System.out.print("Age: ");
		age =  userinput.nextInt();
		userinput.nextLine();
		System.out.print("Weight (lb): ");
		weight =  userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Height (in): ");
		height =  userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Ethnic Group: ");
		ethnic_group = userinput.nextLine();
		System.out.print("Religion: ");
		religion = userinput.nextLine();
	}	
	
	public void greeting() {
		System.out.println("Hello there!");
	}
	public void prayer() {
		System.out.println("Heavenly Father, if it be Your will, use me to lead others to You.");
	}
	public void nap() {
		System.out.println("zzzzz");
	}
	public void eat() {
		System.out.println("Chomp! Chomp! Chomp!");
	}
	public String get_name() {
		String first = first_name;
		String last = last_name;
		String full_name = first + " " + last;
		return full_name;
	}
	public void set_religion() {
		System.out.println("Current religion: " + religion);
		System.out.print("Enter the religion to replace " + religion + ": ");
		religion = userinput.nextLine();
		System.out.println("Religion updated to " + religion);
	}
	
}
