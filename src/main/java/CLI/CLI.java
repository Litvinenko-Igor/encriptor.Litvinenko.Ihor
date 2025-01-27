package CLI;

import CaesarCipher_And_Decrypted_Files.Decryption_Output;
import CaesarCipher_And_Decrypted_Files.English_Ukrain;
import IO.File_True;
import IO.Reader_Writer;

import java.nio.file.Path;
import java.util.Scanner;

public class CLI {

    public void CLI(){
        File_True fileTrue = new File_True();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Що ви хочете зробити з текстом?\n" +
                "Напишіть одну з команд і натисніть enter.\n" +
                "[e]ncrypt | [d]ecrypt | [b]rute force :");
        String command = scanner.nextLine();
        System.out.println("Записати шлях до файлу:");
        Path filePath = Path.of(scanner.nextLine());
        int key = 0;

        if(fileTrue.file_exist(filePath)) {
            if(command.equals("b") || command.equals("BRUTE_FORCE")){
                new Reader_Writer(filePath).readFile_Encrypt_Decrypt(command, key);
            } else {
                System.out.println("Напишіть ключ: ");
                key = scanner.nextInt();
                new Reader_Writer(filePath).readFile_Encrypt_Decrypt(command, key);
            }
        }
    }
}
