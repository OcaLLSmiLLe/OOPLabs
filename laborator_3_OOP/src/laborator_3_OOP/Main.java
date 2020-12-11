package laborator_3_OOP;
import laborator_3_OOP.TextManipulator;
public class Main {

	public static void main(String[] args) {
	
String text = "Advantage old had otherwise sincerity dependent additions. It in adapted natural hastily is justice. Six draw you him full not mean evil. Prepare garrets it expense windows shewing do an. She projection advantages resolution son indulgence. Part sure on no long life am at ever. In songs above he as drawn to. Gay was outlived peculiar rendered led six. ";
TextManipulator textManipulator = new TextManipulator();
textManipulator.display_num_consonants_vowels_letters(text);
System.out.println("-----------------------------------------------------------------------------\n");
textManipulator.display_num_of_words_sentences(text);
System.out.println("-----------------------------------------------------------------------------\n");
textManipulator.DisplayTopFiveWordsAndTheLongestOne(text);
System.out.println("-----------------------------------------------------------------------------\n");
	}

}
