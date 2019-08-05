package nonnull;

import lombok.NonNull;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 15:09
 */
public class NonnullExample extends Something {
    private String name;
    public NonnullExample(@NonNull Person person){
        super("hello");
        this.name = person.getName();
    }

    public static void main(String args[]){
        NonnullExample example = new NonnullExample(null);
    }
}
