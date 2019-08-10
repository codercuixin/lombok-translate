package log;

import lombok.extern.apachecommons.CommonsLog;
import org.apache.log4j.BasicConfigurator;

/**
 * 需要添加对应的jar包
 */

@CommonsLog(topic="CounterLog")
public class LogExampleCategory {

  public static void main(String... args) {
    BasicConfigurator.configure();

    log.error("Calling the 'CounterLog' with a message");
  }
}