package org.bootcamp.Day4.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelToChannelHandsOn {

    public static void copyData(FileChannel src, FileChannel dest) throws IOException {

        var buffer = ByteBuffer.allocate(Math.toIntExact(src.size()));
        src.read(buffer);
        buffer.flip();
        dest.write(buffer);
        System.out.println("Copy Complete");

    }

    public static void main(String[] args) {
        String srcFile = "inputForC2C.txt";
        String destFile = "outputForC2C.txt";

        try {
            var src = new FileInputStream(srcFile);
            var dest = new FileOutputStream(destFile);
            copyData(src.getChannel(), dest.getChannel());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
