package org.bootcamp.Day4.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIOServer {
    public static void main(String[] args) {
        try {
            var selector = Selector.open();

//            Create a Server
            var serverChannel = ServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress("localhost", 1804));
            serverChannel.configureBlocking(false);
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);

            var buffer = ByteBuffer.allocate(256);

            System.out.println("Server started and running at port: 1804");

            while (true) {
                selector.select();
                var selectedKeys = selector.selectedKeys();
                var it = selectedKeys.iterator();
                while (it.hasNext()) {
                    var key = it.next();
                    if (key.isAcceptable()) {
                        System.out.println("Accepts Client Connection");
                        var server = (ServerSocketChannel) key.channel();
                        var client = server.accept();
                        client.configureBlocking(false);
                        client.register(selector, SelectionKey.OP_READ);
                    } if (key.isReadable()) {
                        System.out.println("Able to Read from the Buffer");
                        var client = (SocketChannel) key.channel();
                        var bytesRead = client.read(buffer);
                        if (bytesRead == -1) {
                            key.cancel();
                            client.close();
                            continue;
                        }
                        buffer.flip();
                        var received = new String(buffer.array());
                        System.out.println("Received Message: " + received);

                        client.write(buffer);
                    }
                    it.remove();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
