public class CharacteristicDriver {
	public static void main(String[] args) { // Driver method
		Characteristic char1 = new Characteristic("Likes Movies");
		Characteristic char2 = new Characteristic("Likes Video Games");
		char1.setRating();
		char2.setRating();
		if (char1.isMatch(char2))
			System.out.println("Both characteristics match!");
		else
			System.out.println("The characteristics don't match :(");
	}
}