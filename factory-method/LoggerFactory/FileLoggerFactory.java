package LoggerFactory;

import Logger.FileLogger;
import Logger.ILogger;

public class FileLoggerFactory implements ILoggerFactory{

    @Override
    public ILogger getLogger() {
        return new FileLogger(); // complex logic for creating file logger
    }
    
}
