package io.nio.buffer;

import java.nio.IntBuffer;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/23 23:26
 */
public class BasicBuffer {
    public static void main(String[] args) {
        IntBuffer intBuffer= IntBuffer.allocate(5);

        for(int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put( i * 2);
        }
        //TODO
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }

    }
}
