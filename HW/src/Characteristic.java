import java.util.*;

public class Characteristic {
	// Attributes
	private String description;
	private int rating;
	Scanner scnr = new Scanner(System.in); // Scanner to pull from keyboard

	public Characteristic(String description) { // Constructor
		setDescription(description);
		rating = 0;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private void setRating(int rating) { // Validates rating or recurses
		if (isValid(rating)) {
			this.rating = rating;
			System.out.println("\"" + this.description + "\" rating set to: " + rating);
		} else
			setRating();
	}

	public void setRating() { // Asks for rating from keyboard
		System.out.println("Please enter a rating between 1-10");
		int input = scnr.nextInt();
		setRating(input);
	}

	// Get methods
	public String getDescription() {
		return description;
	}

	public int getRating() {
		return rating;
	}

	private boolean isValid(int rating) { // Rating has to be within 1-10
		if (rating <= 10 && rating >= 1)
			return true;
		else
			return false;
	}

	public boolean isMatch(Characteristic otherChar) {
		if (this.description.matches(otherChar.description))
			return true;
		else
			return false;
	}
}