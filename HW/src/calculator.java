import java.util.*;

public class calculator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String postFix = formatter(scnr.nextLine());
		System.out.println(evaluator(postFix));
		scnr.close();
	}

	static int precedence(char c) { // because order of operations is a thing
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	static String formatter(String input) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// check if char is operator
			if (precedence(c) > 0) {
				// to make sure order of operations is right
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
					result += stack.pop() + " ";
				}
				stack.push(c);
			} else if (c == ')') {
				char x = stack.pop();
				while (x != '(') {
					result += x + " ";
					x = stack.pop();
				}
			} else if (c == '(') {
				stack.push(c);
			} else if (c != ' ') {
				// character is neither operator nor ( but not a space
				result += c + " ";
			}
		}
		for (int i = 0; i <= stack.size(); i++) { // add the remaining operators
			result += stack.pop() + " ";
		}
		return result.trim();
	}

	static int evaluator(String input) {
		Scanner str = new Scanner(input);
		int result = 0;
		Stack<Integer> s1 = new Stack<>();
		while (str.hasNext()) {
			if (str.hasNextInt()) {
				int val = str.nextInt();
				s1.push(val);
			} else {
				String op = str.next();
				int val1, val2 = 0;
				if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
					throw new PostFixException("Illegal Symbol: " + op);
				}
				val2 = s1.pop();
				val1 = s1.pop();

				if (op.equals("+"))
					result = val1 + val2;
				else if (op.equals("-"))
					result = val1 - val2;
				else if (op.equals("*"))
					result = val1 * val2;
				else if (op.equals("/"))
					result = val1 / val2;
				s1.push(result);
			}
		}
		str.close();
		result = s1.peek();
		s1.pop();
		if (!s1.isEmpty()) {
			throw new PostFixException("Too many operands");
		}
		return result;
	}
}
