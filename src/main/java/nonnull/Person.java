package nonnull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 15:10
 */

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
