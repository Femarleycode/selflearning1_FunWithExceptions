package main;

import java.util.Scanner;

public class Call {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, selection;
		System.out.println("please enter any two digits:");
		a = scan.nextInt();
		b = scan.nextInt();

		System.out.println("make your selection");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.division");
		System.out.println("4.multiplication");

		// picking user selection
		selection = scan.nextInt();

		// in case of errors, so that users get results
		while (selection > 4) {
			System.out.println("please enter the correct selection:");
			selection = scan.nextInt();

		}
		Methods mani = new Methods();

		if (selection == 1) {
			c = mani.add(a, b);
			System.out.println("your answer is " + c);
		} else if (selection == 2) {
			c = mani.sub(a, b);
			System.out.println("your answer is " + c);
		} else if (selection == 3) {
			c = mani.div(a, b);
			System.out.println("your answer is " + c);
		} else if (selection == 4) {
			c = mani.multi(a, b);
			System.out.println("your answer is " + c);
		}
		scan.close();
	}
}