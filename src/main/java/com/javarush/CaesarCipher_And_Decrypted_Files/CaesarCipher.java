package com.javarush.CaesarCipher_And_Decrypted_Files;
import java.util.ArrayList;

import static com.javarush.AlphabetData.*;

public class CaesarCipher {
    ArrayList<Character> transformedText  = new ArrayList<>();

    void encryptText(String text, int key){
        try {
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                if (IGNORED_CHARS.contains(currentChar)) {
                    transformedText.add(currentChar);
                } else if (ALPHABET_EN_UPPER.contains(currentChar)) {
                    extracted(ALPHABET_EN_UPPER, currentChar, key);
                } else if (ALPHABET_EN_SMALLER.contains(currentChar)) {
                    extracted(ALPHABET_EN_SMALLER, currentChar, key);
                } else if (ALPHABET_UA_UPPER.contains(currentChar)) {
                    extracted(ALPHABET_UA_UPPER, currentChar, key);
                } else if (ALPHABET_UA_SMALLER.contains(currentChar)) {
                    extracted(ALPHABET_UA_SMALLER, currentChar, key);
                } else {
                    transformedText.add(currentChar);
                }
            }
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }
    private void extracted(ArrayList<Character> alphabetEnUpper, char currentChar, int key) {
        int index = alphabetEnUpper.indexOf(currentChar);
        int newIndex = (index + key) % alphabetEnUpper.size();
        transformedText.add(alphabetEnUpper.get(newIndex));
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




