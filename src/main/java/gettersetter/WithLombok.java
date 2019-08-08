package gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 16:22
 */
public class WithLombok {
    /**
     * Age of the person. Water is wet.
     *
     * @param age New value for this person's age. Sky is blue.
     * @return The current value of this person's age. Circles are round.
     */
    @Getter @Setter private int age = 10;

    /**
     * Name of the person.
     * -- SETTER --
     * Changes the name of this person.
     *
     * @param name The new value.
     */
    @Setter(AccessLevel.PROTECTED) private String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }

    public static void main(String args[]){
        WithLombok example = new WithLombok();
        example.setName("Hello World");
        example.setAge(20);
        System.out.println(example.toString());
    }
}
