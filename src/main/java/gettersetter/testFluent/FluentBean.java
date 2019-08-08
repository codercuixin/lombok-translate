package gettersetter.testFluent;

import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/8/8 19:10
 */
@Getter
@Setter
public class FluentBean {
    private int age;
    private String name;
    public static void main(String[] args){
        FluentBean fluentBean = new FluentBean();
        fluentBean.age(20);
        fluentBean.name("Yellow");
    }
}
