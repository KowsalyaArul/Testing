package Strings;
import java.util.*;
import java.util.ArrayList;

public class s3 {
    public static void main(String[] args) {
        String str = "Hi hello kowsi sharmi "; 
        ArrayList<String> s = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else { 
                if (word.length() > 0) { 
                    s.add(word.toString());
                    word.setLength(0); 
                }
            }
        }        
        System.out.println(s);
        
    }
}