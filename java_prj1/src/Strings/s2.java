package Strings;
import java.util.*;

public class s2 {

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        StringBuffer sb = new StringBuffer(str);
        int wordCount = 0;
        boolean isWord = false;
        int end = sb.length() - 1;

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isLetter(sb.charAt(i)) && i != end) {
                isWord = true;
            } else if (!Character.isLetter(sb.charAt(i)) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(sb.charAt(i)) && i == end) {
                wordCount++;
            }
        }

        return wordCount;
    }
    
	    public static void main(String[] args) {
	        String input = "Hello, this is a sample string to count words.";
	        int wordCount = countWords(input);
	        System.out.println("Number of words: " + wordCount);
	    }

	}



