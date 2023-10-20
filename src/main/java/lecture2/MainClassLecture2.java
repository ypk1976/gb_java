package lecture2;

import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.logging.*;

public class MainClassLecture2 {
    public static void main(String[] args) {
        // Example 5: Logging
        Logger logger = Logger.getLogger(MainClassLecture2.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

        // Example 3
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix
                // platforms, or a string containing
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }

        // Example 2: Working with files
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath());
//
//        System.out.println(pathFile);
//        File f1 = new File("file.txt");
//        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f2.getAbsolutePath());

        // Example 1: Working with strings
//        String[] name = { "C", "е", "р", "г", "е", "й" };
//        String sk = "СЕРГЕЙ КА.";
//        System.out.println(sk.toLowerCase()); // сергей ка.
//        System.out.println(String.join("-", name)); // Cергей
//        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//        // C,е,р,г,е,й
//        System.out.println(String.join("+", "C", "е", "р", "г", "е", "й"));
    }
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1000000; i++) {
//            sb.append("+");
//        }
//        System.out.println(sb);
//
//    }
}
