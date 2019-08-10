package log;

import lombok.val;
import org.apache.log4j.BasicConfigurator;

import java.util.HashMap;

/**
 * @author cuixin on 2019-07-20
 **/
public class LogExampleCategory2 {
    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog("CounterLog");

    public static void main(String... args) {
        BasicConfigurator.configure();
        log.error("Calling the 'CounterLog' with a message");
    }
}