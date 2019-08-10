package synchronized_;

import lombok.Synchronized;

import java.io.Serializable;

/**
 * @author cuixin on 2019-07-18
 **/
public class WithLombok implements Serializable {
    private final Object readLock = new Object();

    @Synchronized
    public static void hello(){
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife(){
        return 42;
    }

    @Synchronized("readLock")
    public void foo(){
        System.out.println("bar");
    }

    public static void main(String args[]){
        WithLombok example = new WithLombok();
        WithLombok.hello();
        example.answerToLife();
        example.foo();

    }
}
