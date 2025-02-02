package com.javarush;

import com.javarush.IO.FileValidator;
import com.javarush.IO.TextProcessor;

import java.nio.file.Path;
import java.util.Scanner;

public class CLI {

    public void runCLI(){
        FileValidator fileTrue = new FileValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Що ви хочете зробити з текстом?\n" +
                "Напишіть одну з команд і натисніть enter.\n" +
                "[e]ncrypt | [d]ecrypt | [b]rute force :");
        String command = scanner.nextLine();
        System.out.println("Записати шлях до файлу:");
        Path filePath = Path.of(scanner.nextLine());
        int key = 0;

        if(fileTrue.isFileValid(filePath)) {
            if(command.equals("b") || command.equals("BRUTE_FORCE")){
                new TextProcessor(filePath).processFile(command, key);
            } else {
                System.out.println("Напишіть ключ: ");
                key = scanner.nextInt();
                new TextProcessor(filePath).processFile(command, key);
            }
        }
    }
}
