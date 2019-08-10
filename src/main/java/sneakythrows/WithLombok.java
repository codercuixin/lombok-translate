package sneakythrows;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * @author cuixin on 2019-07-18
 **/
public class WithLombok implements Runnable {
    @SneakyThrows
    public void run() {
        throw new Throwable();
    }

    @SneakyThrows(value = {UnsupportedEncodingException.class})
    public String utf8ToString(byte[] bytes){
        return new String(bytes, "UTF-8");
    }

    public static void main(String args[]){
        WithLombok example = new WithLombok();
        example.run();
        String str = example.utf8ToString("HelloWorld".getBytes());
    }
}
