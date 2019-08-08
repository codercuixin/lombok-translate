package equalsandhashcode;

import lombok.EqualsAndHashCode;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 17:22
 */
@EqualsAndHashCode
public class EqualsAndHashCodeWithLombok {
    private transient int transientVar = 10;
    private String name;
    private double score;
    @EqualsAndHashCode.Exclude
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude
    private int id;

    @EqualsAndHashCode(callSuper = true)
    public static class Square extends Shape {
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
        EqualsAndHashCodeWithLombok example = new EqualsAndHashCodeWithLombok();
        example.name = "YellowStar5";
        example.score = 50;
        example.id = 111;
        example.shape = new Square(3, 4);


        EqualsAndHashCodeWithLombok example1 = new EqualsAndHashCodeWithLombok();
        example1.name = "YellowStar5";
        example1.score = 50;
        example1.id = 112;
        example1.shape = new Square(4, 5);

        System.out.println(example.equals(example1));

    }
}
