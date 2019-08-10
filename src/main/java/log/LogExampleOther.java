package log;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;

/**
 * @author cuixin on 2019-07-20
 * 需要依赖对应的jar包
 **/
@Slf4j
public class LogExampleOther {
    public static void main(String args[]){
        BasicConfigurator.configure();
        log.error("Something other is wrong here");
    }
}
