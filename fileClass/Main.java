package fileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        //File file2 = new File("javaFile_message(fileClass).txt");
        //must have file extension (.txt)
        //ONLY when file is within project folder

        File file = new File("javaFile_message(fileClass).txt");
        //when file is not within project folder

        if (file.exists()) { //checking if file exists
            System.out.println("That file exists!");
            System.out.println(file.getPath()); //file name
            System.out.println(file.getAbsolutePath()); //file location path
            System.out.println(file.isFile()); //true or false whether it is a file
            // file.delete(); //deletes file
        } else {
            System.out.println("That file doesn't exist!");
        }
    }
}
