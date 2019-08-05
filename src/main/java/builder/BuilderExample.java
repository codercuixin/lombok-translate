package builder;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/17 19:57
 */
@Builder
public class BuilderExample {
    @Builder.Default private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;

//    public static void main(String args[]){
//        BuilderExample example = Builder
//    }
}
