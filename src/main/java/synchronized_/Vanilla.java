package synchronized_;

import java.io.Serializable;

/**
 * @author cuixin on 2019-07-18
 **/
public class Vanilla implements Serializable {
    private static final Object $LOCK = new Object[0];
    private final Object $lock = new Object[0];
    private final Object readLock = new Object();
    public static void hello(){
        synchronized ($LOCK){
            System.out.println("world");
        }
    }

    public int answerToLife(){
        synchronized ($lock){
            return 42;
        }
    }

    public void foo(){
        synchronized (readLock){
            System.out.println("bar");
        }
    }

    public static void main(String args[]){
        Vanilla example = new Vanilla();
        Vanilla.hello();
        example.answerToLife();
        example.foo();

    }
}
