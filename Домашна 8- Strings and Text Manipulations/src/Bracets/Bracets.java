package Bracets;
import java.util.Scanner;
import java.util.Stack;

public class Bracets {
	public static void check(String string) {
		Stack<Character> stack = new Stack<Character>();
		char[] expression = string.toCharArray();
		boolean wrong = false;
		for (int i = 0; i < expression.length; i++) {
			if (expression[i] == '(') {
				stack.push(expression[i]);
			} else if (expression[i] == ')') {
				if (!stack.isEmpty()) {
					expression[i] = stack.pop();
				}
				if (expression[i] != '(') {
					wrong = true;
					break;
				}
			}
		}
		if ((wrong) || (!stack.isEmpty())) {
			System.out.println("Wrong expression!");
		} else {
			System.out.println("Correct expression  !");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter an expression: ");
		String expresion = input.nextLine();
		check(expresion);
		input.close();
	}

}
