package getterlazy;

import lombok.Getter;

/**
 * @author cuixin on 2019-07-20
 **/
public class WithLombok {
    @Getter(lazy = true)
    private final double[] cached = expensive();
    private  double[] expensive(){
        double[] result = new double[1000000];
        for(int i=0; i<result.length; i++){
            result[i] = Math.sin(i);
        }
        return result;
    }

    public static void main(String args[]){
        WithLombok example = new WithLombok();
        example.getCached();
        System.out.println(example);
    }
}
