package tostring;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 16:36
 */
@ToString
@Setter
@Getter
public class ToStringWithLombok {
    private static final int STATIC_WAR = 10;
    private String name;
    private Shape shape = new Square(5, 10);
    private  String[] tags;
    @ToString.Exclude
    private int id;

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape{
        private final int width, height;
        public Square(int width, int height){
            this.width = width;
            this.height = height;
        }
    }
    public static class Shape{
        @Override
        public String toString() {
            return "this is a shape";
        }
    }

    public static void main(String args[]){
        ToStringWithLombok example= new ToStringWithLombok();
        example.setId(100);
        example.setName("Hello");
        example.setTags(new String[]{"tag1", "tag2"});
        System.out.println(example.toString());
    }

}
