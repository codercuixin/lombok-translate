package nonnull;

import lombok.NonNull;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 15:13
 */
public class OriginalJava extends Something {
    private String name;

    public OriginalJava(@NonNull Person person) {
        super("Hello");
        if (person == null) {
            throw new NullPointerException("person is marked @NonNull but is null");
        }
        this.name = person.getName();
    }

    public static void main(String args[]){
        OriginalJava example = new OriginalJava(null);
    }
}
