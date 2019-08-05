package val;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 13:31
 */
public class OriginalJava {
    public static void main(String[] args) {
        OriginalJava valExample = new OriginalJava();
        valExample.example();
        valExample.example2();
    }

    public String example() {
        final ArrayList<String> example = new ArrayList<String>();
        example.add("Hello World");
        final String foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2() {
        final HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (final Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
