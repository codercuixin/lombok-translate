package gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 16:33
 */
public class GetterSetterExampleWithoutLombok {
    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }

    private String name;
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    @Override
    public String toString() {
        return "GetterSetterExampleWithoutLombok{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", enabled=" + enabled +
                '}';
    }

    public static void main(String args[]){
        GetterSetterExampleWithoutLombok example = new GetterSetterExampleWithoutLombok();
        example.setName("Hello World");
        example.setEnabled(true);
        System.out.println(example.isEnabled());
        System.out.println(example.toString());
    }
}
