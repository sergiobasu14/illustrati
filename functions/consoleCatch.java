import java.util.Scanner;

public class consoleCatch {
	
	public static void main(String[] args) {
		//Save int
		Scanner inputAge = new Scanner(System.in);
		int age;

		System.out.print("Type your age: ");
		age = inputAge.nextInt();
		System.out.println("You are "+age+" years old.");

		//Save string
		Scanner inputName = new Scanner(System.in);
		String userName;

		//Save string until space
		String userFirstName;

		//Save char
		char userChar;

		System.out.print("Type your full name:");
		userName = inputName.nextLine();
		System.out.print("Type your first name:");
		userFirstName = inputName.next();
		System.out.print("Type your first letter name:");
		userChar = inputName.next().charAt(0);
		System.out.println("Your name is: "+userName);
		System.out.println("Your first name is: "+userFirstName);
		System.out.println("Your first letter name is:"+userChar);

		//Save float
		Scanner inputHeigth = new Scanner(System.in);
		float userHeight;

		System.out.print("Tyoe your height: ");
		userHeight = inputHeigth.nextFloat();
		System.out.println("Your height is: "+userHeight);

		//Save double
		Scanner inputWeigth = new Scanner(System.in);
		double userWeigth;

		System.out.print("Type your weight: ");
		userWeigth = inputWeigth.nextDouble();
		System.out.println("Your height is: "+userWeigth);


	}
}