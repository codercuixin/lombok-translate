package builder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.Arrays;
import java.util.List;

/**
 * * @Author: cuixin
 * * @Date: 2019/7/17 19:36
 */
@Value @Builder
@JsonDeserialize(builder = JacksonExample.JacksonExampleBuilder.class)
public class JacksonExample {
    private List<? extends Foo> foos;

    @JsonPOJOBuilder(withPrefix = "")
    public static class JacksonExampleBuilder implements JacksonExampleBuilderMeta {
        private List<? extends Foo> foos;
        @Override
        public JacksonExampleBuilder foos(List<? extends Foo> foos) {
            this.foos = foos;
            return this ;
        }
    }

    private interface JacksonExampleBuilderMeta {
        @JsonDeserialize(contentAs = FooImpl.class) JacksonExampleBuilder foos(List<? extends Foo> foos);
    }

    private static interface Foo{}
    private static class FooImpl implements Foo{

    }

    public static void main(String args[])
    {
        JacksonExampleBuilder builder = new JacksonExampleBuilder();
        builder.foos(Arrays.asList(new FooImpl(), new FooImpl()));
        System.out.println(builder.foos);
        JacksonExample jacksonExample =builder.build();
        System.out.println(jacksonExample.foos);
        //可以看到，通过JacksonBuilder实现了自定义Builder，两个打印的foos是同样的对象。

    }
}
