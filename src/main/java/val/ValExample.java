package val;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 13:25
 */
public class ValExample {
    public static void main(String args[]){
        ValExample valExample = new ValExample();
        valExample.example();
        valExample.example2();
    }
    public String example(){
        val example =new ArrayList<String>();
        // 类型不兼容，由于val已经是final，也就是类型必须是一个ArrayList<String>，且对象引用也不能变
//        example = new LinkedList<String>()
        example.add("Hello World");
        val foo = example.get(0);
        return foo.toLowerCase();
    }
    public void example2(){
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for(val entry: map.entrySet()){
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
