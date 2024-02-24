package org.bootcamp.Day4.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIOClient {
    public static void main(String[] args) {
        try {
            var clientChannel = SocketChannel.open();
            clientChannel.connect(new InetSocketAddress("localhost", 1804));
            var buffer = ByteBuffer.allocate(256);
            var msg = "Ping to NIO SERVER...";
            buffer.clear();
            buffer.put(msg.getBytes());

            buffer.flip();
            while (buffer.hasRemaining()) {
                clientChannel.write(buffer);
            }
            buffer.clear();

            clientChannel.read(buffer);
            buffer.flip();

            var str = new String(buffer.array());
            System.out.println("Server Resp: " + str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
