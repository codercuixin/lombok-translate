package constructor.test;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:26
 */
public class NoArgsConstructorTest {
    /**
     * 去掉force=true会报编译错误，因为final未初始化
     */
    @NoArgsConstructor(force = true)
    @ToString
    public static class Car{
        private final int width;
        private final int length;
        private final  int height;
        private final boolean isExpensive;
        /**
         * 无参构造器，会初始化为null，并且去掉非空检查。
         */
        @NonNull
        private Integer seats;
    }

    public static void main(String args[]){
        Car car = new Car();
        System.out.println(car);
    }


}
