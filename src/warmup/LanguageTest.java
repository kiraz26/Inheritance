package warmup;

public class LanguageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language lang = new Language();
		Language lang2 =new Language("English", "US", 26);
		
		lang.setName("French");
		lang.setRegion("France");
		lang.setNumberOfLetters(28);
		lang.getName();
		lang.getRegion();
		lang.getNumberOfLetters();
		
		lang2.setName("Turkish");
		lang2.setRegion("Turkey");
		lang2.setNumberOfLetters(29);
		lang2.getName();
		lang2.getRegion();
		lang2.getNumberOfLetters();
		
		// Make field numberOfLetter Immutable --------
		
		// public ---> everywhere
		// protected ---> same package + in sub  classes in other packages
		// default ----->only in the same package ---> package private
		// private ---->same class
		
		
	}

}
