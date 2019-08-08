package tostring.testIncludeRank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * * @Author: cuixin
 * * @Date: 2019/8/8 19:39
 */
@ToString
@Setter
@Getter
public class IncludeRankDemo {
    private int age;
    @ToString.Include(rank = 1)
    private String name;

    private String hobby;

    public static void main(String[] args){
        IncludeRankDemo demo = new IncludeRankDemo();
        demo.setAge(20);
        demo.setName("Yellow");
        demo.setHobby("Running");
        //由于name的rank变为了1比默认值0大，先打印。
        //age和hobby的rank都是默认的0，又由于age在代码里先出现，因而先打印。
        System.out.println(demo);
    }
}
