package gettersetter;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 16:33
 */
public class VanillaJava {
    /**
     * Age of the person. Water is wet.
     */
    private int age = 10;

    /**
     * Name of the person.
     */
    private String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }

    /**
     * Age of the person. Water is wet.
     *
     * @return The current value of this person's age. Circles are round.
     */
    public int getAge() {
        return age;
    }

    /**
     * Age of the person. Water is wet.
     *
     * @param age New value for this person's age. Sky is blue.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Changes the name of this person.
     *
     * @param name The new value.
     */
    protected void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]){
        VanillaJava example = new VanillaJava();
        example.setName("Hello World");
        example.setAge(20);
        System.out.println(example.toString());
    }
}
