package gettersetter.testPrefix;

import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/8/8 19:01
 */
@Getter
@Setter
public class MBean {
    private String mName;
    private int mAge;

    public static void main(String[] args){
        //由于配置了lombok.accessors.prefix += f，
        //所以生成的getter和setter没有f前缀
        MBean mBean = new MBean();
        mBean.setAge(20);
        mBean.setName("Yellow");
    }

}
