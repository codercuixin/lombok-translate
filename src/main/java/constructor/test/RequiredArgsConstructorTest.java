package constructor.test;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:34
 */
public class RequiredArgsConstructorTest {
    /**
     * RequiredArgsConstructor会对所有final类型未初始化的字段，@Nonnull注解标识的未初始化的字段进行初始化。
     * 另外，对于Nonnull注解修饰的字段，非空检查也会生成。
     * RequiredArgsConstructor生成的构造函数，与书写在代码里面的顺序一致。
     */
    @RequiredArgsConstructor
    @ToString
    public static class Car {
        private final int width;
        private final int length;
        private final int height;
        /**
         * 已经初始化了就不会再初始化
         */
        private final int weight = 100;

        private final boolean isExpensive;
        /**
         * 执行non-null检查
         */
        @NonNull
        private Integer seats;
    }

    public static void main(String[] args) {
        Car ferrari911 = new Car(1, 2, 3, true, 2);
        System.out.println(ferrari911.toString());
        //空指针异常，没有座（因为太贵了，微笑）
        Car lamborghini = new Car(1, 2, 3, true, null);
    }
}
