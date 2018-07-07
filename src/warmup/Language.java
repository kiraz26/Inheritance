package warmup;

public class Language {
	private String name;
	private String region;
	private int numberOfLetters;
	protected String pronounciation;
	public char firstAlphabet; 
	long numberOfUser;

	// Constructors (no argument and 3 arguments)
	public Language() {
		System.out.println("No arg constructor");
	}

	public Language(String name, String region, int numberOfLetters) {
		this.name = name;
		this.region = region;
		this.numberOfLetters = numberOfLetters;
		System.out.println("3 args constructor");
	}

	// Getters and Setters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setNumberOfLetters(int numberOfLetters) {
		this.numberOfLetters = numberOfLetters;
	}

	public int getNumberOfLetters() {
		return numberOfLetters;
	}

}
