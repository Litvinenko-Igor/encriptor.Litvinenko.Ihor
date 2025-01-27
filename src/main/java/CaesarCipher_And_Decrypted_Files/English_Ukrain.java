package CaesarCipher_And_Decrypted_Files;

import BruteForce.BruteForceRunner;

import java.util.ArrayList;

import static Constants.Symbols_And_Letters.*;

public class English_Ukrain {

    ArrayList<Character> transformedText  = new ArrayList<>();

    public String recognizes_which_language_Encrypt_Decrypt(String text, String textCipherMenu, int key) {
        CaesarCipher caesarCipher = new CaesarCipher();
        Decryption_Output decryptionOutput = new Decryption_Output();
        BruteForceRunner bruteForceRunner = new BruteForceRunner();
        int englishCount = 0;
        int ukrainianCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (IGNORED_CHARS.contains(currentChar)) {
                transformedText.add(currentChar);
            } else if (ALPHABET_EN_UPPER.contains(currentChar) || ALPHABET_EN_SMALLER.contains(currentChar)) {
                englishCount++;
            } else if (ALPHABET_UA_UPPER.contains(currentChar) || ALPHABET_UA_SMALLER.contains(currentChar)) {
                ukrainianCount++;
            }
        }
        if ("e".equals(textCipherMenu) || "ENCRYPT".equals(textCipherMenu)) {
            if (englishCount > ukrainianCount) {
                caesarCipher.caesarCipher_ENGLISH(text,key);
            } else {
                caesarCipher.caesarCipher_UKRAIN(text,key);
            }
            return caesarCipher.getTransformedText();
        }
        if ("d".equals(textCipherMenu) || "DECRYPT".equals(textCipherMenu)) {
            if (englishCount > ukrainianCount) {
                decryptionOutput.Decryption_Output_ENGLISH(text,key);
            } else {
                decryptionOutput.Decryption_Output_UKRAIN(text,key);
            }
            return decryptionOutput.getTransformedText();
        }
        if ("b".equals(textCipherMenu) || "BRUTE_FORCE".equals(textCipherMenu)) {
            if (englishCount > ukrainianCount) {
                bruteForceRunner.bruteForceDecrypt_ENGLISH(text);
            } else {
                bruteForceRunner.bruteForceDecrypt_UKRAIN(text);
            }
            return bruteForceRunner.getText();
        }
        return "null";
    }
}
