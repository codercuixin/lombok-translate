package equalsandhashcode;

import java.util.Arrays;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/8 17:28
 */
public class EqualsAndHashCodeWithoutLombok {
    private transient int transientVar = 10;
    private String name;
    private double score;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    public String getName() {
        return this.name;
    }

    @Override public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EqualsAndHashCodeWithoutLombok)) return false;
        EqualsAndHashCodeWithoutLombok other = (EqualsAndHashCodeWithoutLombok) o;
        if (!other.canEqual((Object)this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (Double.compare(this.score, other.score) != 0) return false;
        if (!Arrays.deepEquals(this.tags, other.tags)) return false;
        return true;
    }

    @Override public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long temp1 = Double.doubleToLongBits(this.score);
        result = (result*PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result*PRIME) + (int)(temp1 ^ (temp1 >>> 32));
        result = (result*PRIME) + Arrays.deepHashCode(this.tags);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof EqualsAndHashCodeWithoutLombok;
    }

    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Square)) return false;
            Square other = (Square) o;
            if (!other.canEqual((Object)this)) return false;
            if (!super.equals(o)) return false;
            if (this.width != other.width) return false;
            if (this.height != other.height) return false;
            return true;
        }

        @Override public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = (result*PRIME) + super.hashCode();
            result = (result*PRIME) + this.width;
            result = (result*PRIME) + this.height;
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Square;
        }
    }
    public static class Shape{
        @Override
        public String toString() {
            return "this is a shape";
        }
    }

    public static void main(String args[]){
        EqualsAndHashCodeWithoutLombok example = new EqualsAndHashCodeWithoutLombok();
        example.name = "YellowStar5";
        example.score = 50;
        example.id = 111;
        example.shape = new EqualsAndHashCodeWithoutLombok.Square(3, 4);


        EqualsAndHashCodeWithoutLombok example1 = new EqualsAndHashCodeWithoutLombok();
        example1.name = "YellowStar5";
        example1.score = 50;
        example1.id = 112;
        example1.shape = new EqualsAndHashCodeWithoutLombok.Square(4, 5);

        System.out.println(example.equals(example1));

    }
}
