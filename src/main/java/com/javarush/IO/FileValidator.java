package com.javarush.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileValidator {

    public boolean isFileValid(Path path) {
        try {
            if (!Files.exists(path)) {
                System.out.println("Файл не існує. Перевірте правильність шляху.");
                return false;
            }

            if (!Files.isRegularFile(path)) {
                System.out.println("Вказаний шлях не є файлом.");
                return false;
            }

            if (!path.toString().endsWith(".txt")) {
                System.out.println("Неправильний формат файлу. Підтримуються тільки .txt файли.");
                return false;
            }

            if (!Files.isReadable(path)) {
                System.out.println("Файл не доступний для читання.");
                return false;
            }

            if (Files.size(path) == 0) {
                System.out.println("Файл порожній.");
                return false;
            }
            return true;

        } catch (IOException e) {
            System.out.println("Виникла помилка при перевірці файлу: " + e.getMessage());
            return false;
        }
    }
}
