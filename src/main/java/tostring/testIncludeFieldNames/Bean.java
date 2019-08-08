package tostring.testIncludeFieldNames;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Bean {
    private int age;
    private String name;
    public static void main(String[] args) {
        Bean demo = new Bean();
        demo.setAge(20);
        demo.setName("Yellow");
        System.out.println(demo);
    }
}