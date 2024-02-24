package org.bootcamp.Day4.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

public class BufferDemo {
    public static void main(String[] args) {
        var buffer = CharBuffer.allocate(16);
        String text = "This is a String";
        System.out.println("Input: " + text);
//        Insert to a buffer
        for(var c : text.toCharArray()) {
            buffer.put(c);
        }

//        Get the Buffer Position:
        System.out.println("The BufferPosition after Writing to it: " + buffer.position());
//        Change the state of the buffer from input to reading
        buffer.flip();
        System.out.println("The Buffer Position after Flipping: " + buffer.position());

//        Read from the buffer
        System.out.print("Output: ");
        while(buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }

//        Scattered Read: Read data from single channel into multiple buffers
//        Gathering Writes: Writing from multiple buffer
        FileChannel channel = null;
        try {
            channel = new FileInputStream("test.txt").getChannel();
        var buffer1 = ByteBuffer.allocate(48);
            var buffer2 = ByteBuffer.allocate(48);
            var bufferArr = new ByteBuffer[]{buffer1, buffer2};
            try {
                channel.read(bufferArr); //Scattered Read
                channel.write(bufferArr); //Gathering Writes
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    channel.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//
    }
}
