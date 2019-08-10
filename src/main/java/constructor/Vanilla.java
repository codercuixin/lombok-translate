package constructor;

import lombok.NonNull;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:17
 */
public class Vanilla<T>{
    private int x,y;
    @NonNull private T description;

    private Vanilla(T description){
        if(description == null) throw new NullPointerException("description");
        this.description = description;
    }

    public static <T> Vanilla<T> of(T description){
        return new Vanilla(description);
    }

    @java.beans.ConstructorProperties({"x", "y", "description"})
    protected Vanilla(int x, int y, T description){
        if(description == null) throw new NullPointerException("description");
        this.x = x;
        this.y = y;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Vanilla{" +
                "x=" + x +
                ", y=" + y +
                ", description=" + description +
                '}';
    }


    public static class NoArgsExample{
        @NonNull
        private String field;
        public NoArgsExample(){

        }
    }
    public static void main(String args[]){
        Vanilla<String> constructorExample = Vanilla.of("description") ;
        System.out.println(constructorExample);

        Vanilla<String> constructorExample1 = new Vanilla<String>(2, 3, "description");
        System.out.println(constructorExample1);
    }

}
