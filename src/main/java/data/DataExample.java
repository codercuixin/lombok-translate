package data;

import lombok.*;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/12 16:37
 */
@Data
public class DataExample {
    private final String name;
    @Setter(AccessLevel.PACKAGE)
    private int age;
    private double score;
    private String[] tags;
    /**
     * 这个字段是我加的
     */
    @NonNull
    private int nonNullField;

    @ToString(includeFieldNames = true)
    @Data(staticConstructor = "of")
    public static class Exercise<T>{
        private final String name;
        private final T value;
    }

    public static void main(String args[]){
        //非final或者，或者带有non-null注解的lombok不会处理; 那些字段会被jvm初始化。
        DataExample example = new DataExample("hello", 1);
        System.out.println(example);
        DataExample.Exercise exercise = Exercise.of("hello", "word");
        System.out.println(exercise);
    }
}
