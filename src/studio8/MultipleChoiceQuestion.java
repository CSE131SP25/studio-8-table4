package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String[] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		super(prompt,answer,points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for(int i = 0; i<choices.length; i++) {
			System.out.println((i+1) + "." + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return this.choices;
	}
	
	public static void main(String[] args) {
		String[] options = {"Green", "Purple", "Blue", "Red"};
		MultipleChoiceQuestion multcq = new MultipleChoiceQuestion("What color is the sky?", "Blue", 20, options);
		
		multcq.displayPrompt();
		
		System.out.println("Answer: " + multcq.getAnswer());
		System.out.println("Points: " + multcq.getPoints());
		String[] choices = multcq.getChoices();
		System.out.println("Choices: ");
		for(String c : choices) {
			System.out.print(c + " ");
		}
		System.out.println("Check Answer: 'Blue " + multcq.checkAnswer("Blue"));
	}

}
