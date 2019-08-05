package tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 16:45
 */
@Setter
@Getter
public class ToStringWithoutLombok {
    private static final int STATIC_WAR = 10;
    private String name;
    private Shape shape = new Square(5, 10);
    private  String[] tags;
    private int id;

    public static class Square extends Shape {
        private final int width, height;
        public Square(int width, int height){
            this.width = width;
            this.height = height;
        }
        @Override public String toString() {
            return "Square(super=" + super.toString() + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }
    public static class Shape{
        @Override
        public String toString() {
            return "this is a shape";
        }
    }
    @Override public String toString() {
        return "ToStringWithoutLombok(" + this.getName() + ", " + this.shape + ", " + Arrays.deepToString(this.tags) + ")";
    }

    public static void main(String args[]){
        ToStringWithLombok example= new ToStringWithLombok();
        example.setId(100);
        example.setName("Hello");
        example.setTags(new String[]{"tag1", "tag2"});
        System.out.println(example.toString());
    }
}
