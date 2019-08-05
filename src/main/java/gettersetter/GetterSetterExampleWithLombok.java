package gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 16:22
 */
public class GetterSetterExampleWithLombok {
    @Getter @Setter
    private int age = 10;
    @Setter(AccessLevel.PROTECTED)
    private String name;
    @Getter @Setter
    private boolean enabled;

    @Override
    public String toString() {
        return "GetterSetterExampleWithLombok{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", enabled=" + enabled +
                '}';
    }

    public static void main(String args[]){
        GetterSetterExampleWithLombok example = new GetterSetterExampleWithLombok();
        example.setName("Hello World");
        example.setEnabled(true);
        System.out.println(example.isEnabled());
        System.out.println(example.toString());
    }
}
