package nonnull;

import lombok.NonNull;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 15:09
 */
public class WithLombok extends Something {
    private String name;
    public WithLombok(@NonNull Person person){
        super("hello");
        this.name = person.getName();
    }

    public static void main(String args[]){
        //这里由于lombok空值检查的异常类型配置成了IllegalArgumentException
        //所以下面的语句会抛出IllegalArgumentException
        WithLombok example = new WithLombok(null);
    }
}
