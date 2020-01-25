import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class Reverser<E> {
	private Stack<E> stack;

	Reverser() {
		stack = new Stack<E>();
	}

	@SuppressWarnings("unchecked")
	public void fileToStack(String fileName) {
		// To read the file and push to the stack
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			for (; reader.ready();) {
				stack.push((E) reader.readLine());
			}

			reader.close();

		} catch (FileNotFoundException e) {
			System.out.println("\nProblem opening the file!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\nProblem with file I/O!");
		}
	}

	@SuppressWarnings("unchecked")
	public void stackToFile(String fileName) {
		// To pop from the stack and push to the file
		try {
			PrintWriter writer = new PrintWriter(fileName);
			while (!stack.isEmpty()) {
				String s = (String) stack.pop();
				writer.println((E) s);
			}
			writer.close();

		} catch (FileNotFoundException e) {
			System.out.println("\nProblem opening the file!");
			e.printStackTrace();
		}

	}

}