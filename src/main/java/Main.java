import CLI.CLI;
import IO.Reader_Writer;

import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (args.length == 2 || args.length == 3) {
            String command = args[0];
            Path filePath = Path.of(args[1]);
            int key = Integer.parseInt(args[2]);
            new Reader_Writer(filePath).readFile_Encrypt_Decrypt(command, key);
        } else {
            new CLI().CLI();
        }
    }
}