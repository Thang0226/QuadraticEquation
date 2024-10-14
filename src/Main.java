import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a, b, c (separated by a space): ");
		String input = scanner.nextLine();

		String[] tokens = input.split(" ");
		double[] numbers = new double[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			numbers[i] = Double.parseDouble(tokens[i]);
		}

		QuadraticEquation equation = new QuadraticEquation(numbers[0], numbers[1], numbers[2]);
		if (equation.getDiscriminant() < 0) {
			System.out.println("The equation has no real roots");
		} else if (equation.getDiscriminant() == 0) {
			System.out.println("The equation has one root: " + equation.getRoot1());
		} else {
			System.out.println("The equation has two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
		}
	}
}