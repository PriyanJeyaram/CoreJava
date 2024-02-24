package org.bootcamp.Day4.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferChannelDemo {

    public static void writeFile(Path filePath) {
        String input = " Trying Buffer Channels :) ";
        var bytes = input.getBytes();
//        ByteBuffer
        var writeBuffer = ByteBuffer.wrap(bytes);
        FileChannel writeChannel = null;

        try {
//            Open the channel using StandardOpenOption
            writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
//            Write the ByteBuffer to the Channel
            writeChannel.write(writeBuffer);
            System.out.println("Write Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
//                Close the FileChannel
                writeChannel.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void readFile(Path filePath) {
//        Create a FileChannel to read
        FileChannel readChannel = null;

        try {
//            Open the FileChannel to the filePath
            readChannel = FileChannel.open(filePath);
//            Create a ByteBuffer to read from
            var readBuffer = ByteBuffer.allocate((int) readChannel.size());
//            Read
            readChannel.read(readBuffer);
            System.out.println("Read Success");
            var output = new String(readBuffer.array());
            System.out.println(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                readChannel.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "testBufferChannel.txt";
        var filePath = Paths.get(fileName);

        writeFile(filePath);
        readFile(filePath);

    }
}
