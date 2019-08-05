package var;

import lombok.val;
import lombok.var;
import val.ValExample;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 14:41
 */
public class VarExample {
    public static void main(String args[]){
        VarExample instance = new VarExample();
        instance.example();
        instance.example2();
    }
    public String example(){
        var example =new ArrayList<String>();
        example.add("Hello World");
        var foo = example.get(0);
        System.out.println(foo);
        return foo.toLowerCase();
    }
    public void example2(){
        var map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for(var entry: map.entrySet()){
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
