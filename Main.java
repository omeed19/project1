public class Main {

	public static void main(String[] args) {

		Reverser<String> reversePoem = new Reverser<String>();
		reversePoem.fileToStack("reversePoem.txt");
		reversePoem.stackToFile("reversePoem1.txt");
		
		Reverser<Float> reverseMaji = new Reverser<Float>();
		reverseMaji.fileToStack("reverseSpells.txt");
		reverseMaji.stackToFile("reverseSpells1.txt");

	}

}