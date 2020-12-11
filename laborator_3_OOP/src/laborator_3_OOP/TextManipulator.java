package laborator_3_OOP;
import java.util.*;

public class TextManipulator {
public TextManipulator(){}
public void display_num_of_words_sentences(String text)
{
	if (text ==null)
	{
		return;
	}
	int word_cont = text.split("").length;
	//int sentence_cont = text.split("\\.").length;
	System.out.println("Numarul cuvinetelor: " + word_cont + "\n");
	int sentence_count = 0;
	for(char c: text.toCharArray())
	{
		if(text == null)
		{
			return;
		}
		else if(c == '.'|| c==','|| c=='!'|| c== '?')
		{
			sentence_count++;
		}
	}
	
	System.out.println("Numarul propozitiilor: " + sentence_count + "\n" );
	
}
public void display_num_consonants_vowels_letters(String text)
{
	if(text == null)
	{
		return;
	}
	int contor_litere = 0;
	for(char c: text.toCharArray())
	{
		if(Character.isLetter(c))
		{
			contor_litere++;
		}
	}
	int contor_vocale = 0;
	int contor_consoane = 0;
	for(char c: text.toCharArray())
	{
		if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			contor_vocale++;
		}
		else if(c!='.' && c!=' ' && c!= ',')
		{
			contor_consoane++;
		}
	}
	System.out.println("Numarul de litere: " + contor_litere + "\n");
    System.out.println("numarul de vocale: " + contor_vocale + "\n");
    System.out.println("Numarul consoanelor: " + contor_consoane + "\n");
}

public void DisplayTopFiveWordsAndTheLongestOne(String text)
{
	if(text == null )
	{
		return;
	}
	
	Hashtable<String, Integer> words = new Hashtable<String, Integer>();
    var loweredText = text.toLowerCase();
    String longestWord = "";

    for (String word:
         loweredText.split(" ")) {
        word = word.replaceAll("\\.", "");
        word = word.replaceAll(" ", "");
        word = word.replaceAll(",", "");

        var chk = words.containsKey(word);

        if (chk) {
            var num = words.get(word);
            words.put(word, num+1);
        }
        else {
            words.put(word, 1);

            if (longestWord.length() < word.length())
                longestWord = word;
        }
    }

    System.out.println("The longest word: "+longestWord);


    var numberOfWords = words.size();

    ArrayList<Map.Entry<String, Integer>> l = new ArrayList(words.entrySet());
    Collections.sort(l, new Comparator<Map.Entry<?, Integer>>(){

        public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }});
    //System.out.println(l);

    Map<String, Integer> mapSortedByValues = new LinkedHashMap<String, Integer>();

    if (numberOfWords <= 5) {
        for (Map.Entry<String, Integer> entry : l) {
            mapSortedByValues.put(entry.getKey(), entry.getValue());
        }
    }
    else {
        int i = 0;
        for (Map.Entry<String, Integer> entry : l) {
            if (i >= numberOfWords - 5) {
                mapSortedByValues.put(entry.getKey(), entry.getValue());
            }
            i += 1;
        }
    }
    System.out.println("Top 5 most used words: "+ mapSortedByValues);
}
}



