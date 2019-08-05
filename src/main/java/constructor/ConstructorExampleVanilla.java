package constructor;

import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/9 19:17
 */
public class ConstructorExampleVanilla<T>{
    private int x,y;
    @NonNull private T description;

    private ConstructorExampleVanilla(T description){
        if(description == null) throw new NullPointerException("description");
        this.description = description;
    }

    public static <T> ConstructorExampleVanilla<T> of(T description){
        return new ConstructorExampleVanilla(description);
    }

    @java.beans.ConstructorProperties({"x", "y", "description"})
    protected ConstructorExampleVanilla(int x, int y, T description){
        if(description == null) throw new NullPointerException("description");
        this.x = x;
        this.y = y;
        this.description = description;
    }
    @Override
    public String toString() {
        return "ConstructorExampleVanilla{" +
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
        ConstructorExampleVanilla<String> constructorExample = ConstructorExampleVanilla.of("description") ;
        System.out.println(constructorExample);

        ConstructorExampleVanilla<String> constructorExample1 = new ConstructorExampleVanilla<String>(2, 3, "description");
        System.out.println(constructorExample1);
    }

}
