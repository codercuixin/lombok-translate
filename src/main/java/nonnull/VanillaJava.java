package nonnull;

import lombok.NonNull;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 15:13
 */
public class VanillaJava extends Something {
    private String name;

    public VanillaJava(@NonNull Person person) {
        super("Hello");
        if (person == null) {
            throw new NullPointerException("person is marked @NonNull but is null");
        }
        this.name = person.getName();
    }

    public static void main(String args[]){
        //由于上面的语句，已经存在空值检查，所以直接抛出空指针异常
        VanillaJava example = new VanillaJava(null);
    }
}
