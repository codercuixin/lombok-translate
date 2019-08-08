package gettersetter.testChain;

import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/8/8 19:13
 */
@Setter
@Getter
public class Bean {
    private int age;
    private String name;

    public static void main(String[] args){
        Bean bean = new Bean();
        bean.setAge(20).setName("Yellow");
    }
}
