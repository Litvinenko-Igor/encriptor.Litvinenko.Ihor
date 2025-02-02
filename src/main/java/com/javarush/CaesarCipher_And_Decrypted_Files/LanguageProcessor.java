package com.javarush.CaesarCipher_And_Decrypted_Files;

import com.javarush.BruteForceRunner;

import static com.javarush.AlphabetData.*;

public class LanguageProcessor {

    private final CaesarCipher caesarCipher = new CaesarCipher();
    private final DecryptionProcessor decryptionOutput = new DecryptionProcessor();
    private final BruteForceRunner bruteForceRunner = new BruteForceRunner();
    private boolean hasUkrainian = false;
    private boolean hasEnglish = false;



    public String processLanguage(String text, String textCipherMenu, int key) {
        if ("e".equals(textCipherMenu) || "ENCRYPT".equals(textCipherMenu)) {
            caesarCipher.encryptText(text, key);
            return caesarCipher.getTransformedText();
        }
        if ("d".equals(textCipherMenu) || "DECRYPT".equals(textCipherMenu)) {
            decryptionOutput.decryptText(text, key);
            return decryptionOutput.getTransformedText();
        }
        if ("b".equals(textCipherMenu) || "BRUTE_FORCE".equals(textCipherMenu)) {
            analyzeText(text);
            return bruteForceRunner.getText();
        }
        return null;
    }
    private void analyzeText(String text) {
        for (char c : text.toCharArray()) {
            if (ALPHABET_EN_UPPER.contains(c) || ALPHABET_EN_SMALLER.contains(c)) {
                hasEnglish = true;
            }
            if (ALPHABET_UA_UPPER.contains(c) || ALPHABET_UA_SMALLER.contains(c)) {
                hasUkrainian = true;
            }
        }
        if (hasEnglish) {
            bruteForceRunner.bruteForceDecrypt(text, ALPHABET_EN_UPPER, ALPHABET_EN_SMALLER, "EN");
        } else if (hasUkrainian) {
            bruteForceRunner.bruteForceDecrypt(text, ALPHABET_UA_UPPER, ALPHABET_UA_SMALLER, "UA");
        }
    }
}

