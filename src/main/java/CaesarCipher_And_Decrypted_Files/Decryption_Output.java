package CaesarCipher_And_Decrypted_Files;

import Constants.Symbols_And_Letters;

import java.util.ArrayList;

import static Constants.Symbols_And_Letters.IGNORED_CHARS;
import static Constants.Symbols_And_Letters.*;
import static Constants.Symbols_And_Letters.ALPHABET_UA_SMALLER;

public class Decryption_Output  {
    ArrayList<Character> transformedText  = new ArrayList<>();

    void Decryption_Output_ENGLISH(String text, int key){
        try {
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                if (IGNORED_CHARS.contains(currentChar)) {
                    transformedText.add(currentChar);
                } else if (Symbols_And_Letters.ALPHABET_EN_UPPER.contains(currentChar)) {
                    int index = Symbols_And_Letters.ALPHABET_EN_UPPER.indexOf(currentChar);
                    int newIndex = (index - key + Symbols_And_Letters.ALPHABET_EN_UPPER.size()) % Symbols_And_Letters.ALPHABET_EN_UPPER.size();
                    transformedText.add(Symbols_And_Letters.ALPHABET_EN_UPPER.get(newIndex));
                } else if (ALPHABET_EN_SMALLER.contains(currentChar)) {
                    int index = ALPHABET_EN_SMALLER.indexOf(currentChar);
                    int newIndex = (index - key + ALPHABET_EN_SMALLER.size()) % ALPHABET_EN_SMALLER.size();
                    transformedText.add(ALPHABET_EN_SMALLER.get(newIndex));
                } else {
                    transformedText.add(currentChar);
                }
            }
        } catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    void Decryption_Output_UKRAIN(String text, int key){
        try {
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                if (IGNORED_CHARS.contains(currentChar)) {
                    transformedText.add(currentChar);
                } else if (ALPHABET_UA_UPPER.contains(currentChar)) {
                    int index = ALPHABET_UA_UPPER.indexOf(currentChar);
                    int newIndex = (index - key + Symbols_And_Letters.ALPHABET_UA_UPPER.size()) % ALPHABET_UA_UPPER.size();
                    transformedText.add(ALPHABET_UA_UPPER.get(newIndex));
                } else if (ALPHABET_UA_SMALLER.contains(currentChar)) {
                    int index = ALPHABET_UA_SMALLER.indexOf(currentChar);
                    int newIndex = (index - key + ALPHABET_UA_SMALLER.size()) % ALPHABET_UA_SMALLER.size();
                    transformedText.add(ALPHABET_UA_SMALLER.get(newIndex));
                } else {
                    transformedText.add(currentChar);
                }
            }
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    public String getTransformedText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : transformedText) {
            stringBuilder.append(c);
        }
        String result = stringBuilder.toString();
        return result;
    }
}
