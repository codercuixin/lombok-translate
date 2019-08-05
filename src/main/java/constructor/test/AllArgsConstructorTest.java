package constructor.test;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:51
 */
public class AllArgsConstructorTest {
    public static void main(String[] args) {
        Car ferrari911 = new Car(1, 2, 3, true, 2);
        System.out.println(ferrari911.toString());
        //空指针异常，没有座（因为太贵了，微笑）
//        Car lamborghini = new Car(1, 2, 3, true, null);
        //推断类型为String。
        Car2<String> porsche = Car2.of(1, 2, 3, true, 2, "porsche");
        System.out.println(porsche);
    }

    /**
     * 生成一个带有所有参数的构造函数，且执行对@Nonnull修饰字段的非空检查
     */
    @AllArgsConstructor
    @ToString
    public static class Car {
        private final int width;
        private final int length;
        private final int height;
        private final boolean isExpensive;
        @NonNull
        private Integer seats;
    }

    /**
     * 生成的构造函数将是private的，会包了一层该private构造函数的工厂方法.
     * 主要是用来类型推断
     *
     * @param <T>
     */
    @AllArgsConstructor(staticName = "of")
    @ToString
    public static class Car2<T> {
        private final int width;
        private final int length;
        private final int height;
        private final boolean isExpensive;
        @NonNull
        private Integer seats;

        private T descripton;
    }
}
