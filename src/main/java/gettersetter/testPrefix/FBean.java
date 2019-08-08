package gettersetter.testPrefix;

import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/8/8 19:03
 *
 */
@Getter
@Setter
public class FBean {
    private String fName;
    private int fAge;
    public static void main(String[] args){
        FBean fBean = new FBean();
        //由于配置了lombok.accessors.prefix += f，
        //所以生成的getter和setter没有f前缀
        fBean.setAge(20);
        fBean.setName("Yellow");
    }
}
