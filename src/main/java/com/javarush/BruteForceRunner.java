package com.javarush;

import java.util.*;


public class BruteForceRunner {
    private String text;

    public void bruteForceDecrypt(String encryptedText, ArrayList<Character> alphabetUpper, ArrayList<Character> alphabetLower, String language) {
        int maxKey = alphabetUpper.size();
        for (int key = 0; key < maxKey; key++) {
            String decryptedText = decrypt(alphabetUpper, alphabetLower, encryptedText, key);
            if (isDecryptedTextValid(decryptedText, language)) {
                System.out.println("Знайдено дійсне розшифрування для мови [" + language + "] за допомогою ключа: " + key);
                text = decryptedText;
                break;
            }
        }
    }
    private String decrypt(ArrayList<Character> alphabetUpper, ArrayList<Character> alphabetLower, String text, int key) {
        StringBuilder decryptedText = new StringBuilder();
        int alphabetSize = alphabetUpper.size();

        for (char ch : text.toCharArray()) {
            if (alphabetUpper.contains(ch)) {
                extracted(alphabetUpper, key, ch, alphabetSize, decryptedText);
            } else if (alphabetLower.contains(ch)) {
                extracted(alphabetLower, key, ch, alphabetSize, decryptedText);
            } else {
                decryptedText.append(ch);
            }
        }
        return decryptedText.toString();
    }

    private static void extracted(ArrayList<Character> alphabetUpper, int key, char ch, int alphabetSize, StringBuilder decryptedText) {
        int originalIndex = alphabetUpper.indexOf(ch);
        int newIndex = (originalIndex - key + alphabetSize) % alphabetSize;
        decryptedText.append(alphabetUpper.get(newIndex));
    }

    private boolean isDecryptedTextValid(String decryptedText, String language) {
        try {
            AlphabetData symbolsAndLetters = new AlphabetData();
            String[] commonWords = language.equals("EN") ? symbolsAndLetters.englishCommonWords : symbolsAndLetters.ukrainianCommonWords;

            for (String word : commonWords) {
                if (decryptedText.contains(word)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            throw new RuntimeException("Помилка при перевірці тексту: ", e);
        }
    }


    public String getText() {
        return text;
    }
}