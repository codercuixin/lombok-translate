package log;

import org.apache.log4j.BasicConfigurator;

/**
 * @author cuixin on 2019-07-20
 **/
public class LogExampleOther2 {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExampleOther.class);

    public static void main(String... args) {
        BasicConfigurator.configure();
        log.error("Something else is wrong here");
    }
}