package constructor;

import lombok.*;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:05
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class WithLombok<T>{
    private int x,y;
    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull private String field;
    }

    @Override
    public String toString() {
        return "WithLombok{" +
                "x=" + x +
                ", y=" + y +
                ", description=" + description +
                '}';
    }

    public static void main(String args[]){
        WithLombok<String> withLombok = WithLombok.of("description") ;
        System.out.println(withLombok);

        WithLombok<String> withLombok1 = new WithLombok<String>(2, 3, "description");
        System.out.println(withLombok1);
    }
}
