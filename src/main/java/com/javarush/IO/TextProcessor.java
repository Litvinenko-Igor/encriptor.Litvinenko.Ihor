package com.javarush.IO;
import com.javarush.CaesarCipher_And_Decrypted_Files.LanguageProcessor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;

public class TextProcessor extends LanguageProcessor {

    public List<String> text;
    private Path path;

    public TextProcessor(Path path) {
        this.path = path;
    }

    public void processFile(String textCipherMenu, int key) {
        String s = "";
        try {
            text = Files.readAllLines(path);
            for (String line : text) {
                s = processLanguage(line, textCipherMenu, key);
                String newfile = getEncryptedFileName(String.valueOf(path));
                saveTextToFile(newfile, s);

            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні файлу: " + e.getMessage());
        }
    }
    protected String getEncryptedFileName(String originalFileName) {
        int dotIndex = originalFileName.lastIndexOf(".");
        boolean endsWithEncrypt = originalFileName.endsWith("[ENCRYPT].txt");

        if (endsWithEncrypt) {
            if (dotIndex != -1) {
                String namePart = originalFileName.substring(0, dotIndex);
                String extensionPart = originalFileName.substring(dotIndex);
                return namePart + "[DECRYPT]" + extensionPart;
            } else {
                return originalFileName + "[DECRYPT]";
            }
        } else {
            if (dotIndex != -1) {
                String namePart = originalFileName.substring(0, dotIndex);
                String extensionPart = originalFileName.substring(dotIndex);
                return namePart + "[ENCRYPT]" + extensionPart;
            } else {
                return originalFileName + "[ENCRYPT]";
            }
        }
    }
    void saveTextToFile(String fileName, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        }
    }
}
