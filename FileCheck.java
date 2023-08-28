package ClassesObjects;

import java.io.File;
public class FileCheck {
    public static void main(String[] args) {
        String filePath = "path/to/file/or/directory";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The path points to a file.");
            } else if (file.isDirectory()) {
                System.out.println("The path points to a directory.");
            }
        } else {
            System.out.println("The file or directory does not exist. ");  } } }

