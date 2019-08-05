package constructor;

import lombok.*;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:05
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ConstructorExample<T>{
    private int x,y;
    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull private String field;
    }

    @Override
    public String toString() {
        return "ConstructorExample{" +
                "x=" + x +
                ", y=" + y +
                ", description=" + description +
                '}';
    }

    public static void main(String args[]){
        ConstructorExample<String> constructorExample = ConstructorExample.of("description") ;
        System.out.println(constructorExample);

        ConstructorExample<String> constructorExample1 = new ConstructorExample<String>(2, 3, "description");
        System.out.println(constructorExample1);
    }
}
