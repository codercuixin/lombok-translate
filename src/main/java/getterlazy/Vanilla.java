package getterlazy;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author cuixin on 2019-07-20
 **/
public class Vanilla {
    private final AtomicReference<Object> cached = new AtomicReference<Object>();

    public double[] getCached() {
        Object value = cached.get();
        if(value == null){
            synchronized (this.cached){
                value = cached.get();
                if(value == null){
                    value = expensive();
                    this.cached.set(value);

                }
            }
        }
        return (double[]) (value == this.cached ? null:value);
    }
    private  double[] expensive(){
        double[] result = new double[1000000];
        for(int i=0; i<result.length; i++){
            result[i] = Math.sin(i);
        }
        return result;
    }

    public static void main(String args[]){
        Vanilla example = new Vanilla();
        example.getCached();
        System.out.println(example);
    }

}
