package BruteForce;

import Constants.Symbols_And_Letters;

import java.util.ArrayList;

import static Constants.Symbols_And_Letters.*;

public class BruteForceRunner {
    private String text;

    public void bruteForceDecrypt_ENGLISH(String encryptedText) {
        for (int key = 0; key <= 26; key++) {
            String decryptedText = decrypt(ALPHABET_EN_UPPER,ALPHABET_EN_SMALLER,encryptedText, key);
            if (isDecryptedTextValid_ENGLISH(decryptedText)) {
                System.out.println("Знайдено дійсне розшифрування за допомогою ключа: " + key);
                text = decryptedText;
                break;
            }
        }
    }
    public void bruteForceDecrypt_UKRAIN(String encryptedText) {
        for (int key = 0; key <= 33; key++) {
            String decryptedText = decrypt(ALPHABET_UA_UPPER,ALPHABET_UA_SMALLER ,encryptedText, key);
            if (isDecryptedTextValid_UKRAIN(decryptedText)) {
                System.out.println("Знайдено дійсне розшифрування за допомогою ключа: " + key);
                text = decryptedText;
                break;
            }
        }
    }

    private String decrypt(ArrayList<Character> alphabet_EN_UA_Upper,ArrayList<Character> alphabet_EN_UA_Smaller, String text, int key) {
        StringBuilder decryptedText = new StringBuilder();
        int alphabetSize = alphabet_EN_UA_Upper.size();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (alphabet_EN_UA_Upper.contains(ch)) {
                int originalIndex = alphabet_EN_UA_Upper.indexOf(ch);
                int newIndex = (originalIndex - key + alphabetSize) % alphabetSize;
                decryptedText.append(alphabet_EN_UA_Upper.get(newIndex));
            } else if (alphabet_EN_UA_Smaller.contains(ch)) {
                int originalIndex = alphabet_EN_UA_Smaller.indexOf(ch);
                int newIndex = (originalIndex - key + alphabetSize) % alphabetSize;
                decryptedText.append(alphabet_EN_UA_Smaller.get(newIndex));
            } else {
                decryptedText.append(ch);
            }
        }

        return decryptedText.toString();
    }

    private boolean isDecryptedTextValid_UKRAIN(String decryptedText){
        try {
            Symbols_And_Letters symbolsAndLetters = new Symbols_And_Letters();
            boolean isValid = false;
            for (String word : symbolsAndLetters.COMMON_WORDS_UKRAIN) {
                if (decryptedText.contains(word)) {
                    isValid = true;
                }
            }
            return isValid;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean isDecryptedTextValid_ENGLISH(String decryptedText){
        try {
            Symbols_And_Letters symbolsAndLetters = new Symbols_And_Letters();
            boolean isValid = false;
            for (String word : symbolsAndLetters.COMMON_WORDS_ENGLISH) {
                if (decryptedText.contains(word)) {
                    isValid = true;
                }
            }
            return isValid;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }


    public String getText() {
        return text;
    }
}
