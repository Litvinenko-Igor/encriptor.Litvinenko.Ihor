package com.javarush;

import com.javarush.IO.TextProcessor;

import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (args.length == 2 || args.length == 3) {
            String command = args[0];
            Path filePath = Path.of(args[1]);
            int key = Integer.parseInt(args[2]);
            new TextProcessor(filePath).processFile(command, key);
        } else {
            new CLI().runCLI();
        }
    }
}