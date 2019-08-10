package value;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/12 18:18
 */
@Value
public class WithLombok {
    String name;
    @Wither(AccessLevel.PACKAGE)
    @NonFinal
    int age;
    double score;
    protected String[] tags;

    @ToString(includeFieldNames = true)
    @Value(staticConstructor = "of")
    public static class Exercise<T>{
        String name;
        T value;
    }

    public static void main(String args[]){
        WithLombok example = new WithLombok("Jack", 20, 100, new String[]{"Yellow"});
        System.out.println(example);
        Exercise exercise = Exercise.of("hello", "word");
        System.out.println(exercise);
    }

}
