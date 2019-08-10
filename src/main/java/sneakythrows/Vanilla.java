package sneakythrows;

/**
 * @author cuixin on 2019-07-18
 **/

import lombok.Lombok;

import java.io.UnsupportedEncodingException;

public class Vanilla implements Runnable {
    public String utf8ToString(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw Lombok.sneakyThrow(e);
        }
    }

    public void run() {
        try {
            throw new Throwable();
        } catch (Throwable t) {
            throw Lombok.sneakyThrow(t);
        }
    }
    public static void main(String args[]){
        Vanilla example = new Vanilla();
        example.run();
        String str = example.utf8ToString("HelloWorld".getBytes());
    }
}