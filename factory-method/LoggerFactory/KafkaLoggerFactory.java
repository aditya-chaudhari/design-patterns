package LoggerFactory;

import Logger.ILogger;
import Logger.KafkaLogger;

public class KafkaLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger getLogger() {
        return new KafkaLogger(); // complex logic for initialising kafka logger
    }
    
}
