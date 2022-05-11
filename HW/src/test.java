import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class test {
	public static void main(String[] args) {
		System.out.println(palin(" "));
	}

	public static boolean palin(String candidate) {
		char ch;
		int length;
		char fromStack;
		char fromQueue;
		boolean stillPalin;

		length = candidate.length();
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new ArrayBlockingQueue<>(length);

		for (int i = 0; i < length; i++) {
			ch = candidate.charAt(i);
			if (Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch);
				queue.add(ch);
				stack.push(ch);

			}
		}

		stillPalin = true;
		while (stillPalin && !stack.isEmpty()) {
			fromStack = stack.peek();
			stack.pop();
			fromQueue = queue.remove();
			if (fromStack != fromQueue) {
				stillPalin = false;
			}
		}
		return stillPalin;
	}
}