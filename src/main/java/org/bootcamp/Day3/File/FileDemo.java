package org.bootcamp.Day3.File;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        var arr = new byte[100];
        var stream = new FileInputStream("src/main/java/org/bootcamp/Day3/File/test.txt");
        int i = stream.read();
        while (i != -1) {
            System.out.print((char) i);
            i = stream.read();
        }
        stream.close();
    }
}
