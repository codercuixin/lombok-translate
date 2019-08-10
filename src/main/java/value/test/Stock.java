package value.test;

import lombok.Value;

/**
 * @author cuixin on 2019-08-10
 **/
@Value
public class Stock {
    private String name;
    private String code;

    public static void main(String[] args) {
        //生成的这个是个不可变对象
        Stock stock = new Stock("Apple", "AAPL");

    }
}
