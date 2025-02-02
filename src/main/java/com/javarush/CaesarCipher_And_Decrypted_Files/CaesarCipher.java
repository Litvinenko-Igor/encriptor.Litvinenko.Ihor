package com.javarush.CaesarCipher_And_Decrypted_Files;
import java.util.ArrayList;

import static com.javarush.AlphabetData.*;

public class CaesarCipher {
    ArrayList<Character> transformedText  = new ArrayList<>();

    void encryptText(String text, int key){
        try {
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                if (ignoredChars.contains(currentChar)) {
                    transformedText.add(currentChar);
                } else if (englishUppercaseAlphabet.contains(currentChar)) {
                    extracted(englishUppercaseAlphabet, currentChar, key);
                } else if (englishLowercaseAlphabet.contains(currentChar)) {
                    extracted(englishLowercaseAlphabet, currentChar, key);
                } else if (ukrainianUppercaseAlphabet.contains(currentChar)) {
                    extracted(ukrainianUppercaseAlphabet, currentChar, key);
                } else if (ukrainianLowercaseAlphabet.contains(currentChar)) {
                    extracted(ukrainianLowercaseAlphabet, currentChar, key);
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




