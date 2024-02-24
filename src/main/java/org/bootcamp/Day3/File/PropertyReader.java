package org.bootcamp.Day3.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public static void main(String[] args) throws IOException {
        var reader = new FileReader("db.properties");

        var props = new Properties();
        props.load(reader);

        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
