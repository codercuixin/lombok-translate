package builder.test;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

/**
 * @author cuixin on 2019-08-10
 **/
@Builder
@ToString
public class SingularUseGuavaDemo {
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
    public static void main(String args[]){
        SingularUseGuavaDemo example = SingularUseGuavaDemo.builder().age(20).name("Yellow").occupation("programmer").occupation("translator").build();
        System.out.println(example);
    }
}
