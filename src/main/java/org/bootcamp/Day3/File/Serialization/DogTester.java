package org.bootcamp.Day3.File.Serialization;

import java.io.*;

public class DogTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Save the state of the object - Serialize it
        Dog dog = new Dog("John", "Wolfie");
        var output = new FileOutputStream("output.txt");
        var objectOutput = new ObjectOutputStream(output);
        objectOutput.writeObject(dog);

//        Read the Object - Deserialize it
        var input = new FileInputStream("output.txt");
        var objectInput = new ObjectInputStream(input);
        Dog newDog = (Dog) objectInput.readObject();
        System.out.println(newDog);
    }
}
