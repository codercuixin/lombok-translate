package gettersetter.testCopyableAnnotations;


import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/8/8 19:15
 */
@Getter
@Setter
public class Bean {
    private int age;
    @NotNull
    private String name;
    public static void main(String[] args){
        Bean bean = new Bean();
        bean.setAge(10);
        bean.setName(null);
        System.out.println(bean);
    }
}
