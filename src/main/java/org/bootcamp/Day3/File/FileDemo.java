package org.bootcamp.Day3.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

//        Reading from a file
        var stream = new FileInputStream("test.txt");
        int i = stream.read();
        while (i != -1) {
            System.out.print((char) i);
            i = stream.read();
        }
        stream.close();

//        Writing to a file :)
//        This file will be created even if it is not present
        var outputStream = new FileOutputStream("createThisAndWrite.txt");
        var data = "This is the text to be written to the file :)";
        outputStream.write(data.getBytes());
        outputStream.close();
    }
}
