package log;

/**
 * @author cuixin on 2019-07-20
 **/

public class LogExample2 {
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());

    public static void main(String... args) {
        log.severe("Something's wrong here");
    }
}
