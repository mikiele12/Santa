package santa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("entre your name.");
		String name= in.nextLine();
		System.out.println("what date is christmas?");
		int date = in.nextInt();
		System.out.println("what do you like 3 things for christmas?");
		String item1= in.nextLine();
		String item2= in.nextLine();
		String item3= in.nextLine();
		String item4= in.nextLine();
		System.out.println("Dear, Santa I have been good for everyone "
				+ "until now. So, Santa I am asking you today to give me " 
				+ item1  + ", " + item2 + ", " +  item3 + " and "  +  
				item4 + " for christams. THank you! from " + name + " ");
	}

}
