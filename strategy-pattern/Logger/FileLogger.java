package Logger;

import LoggerStrategy.ILoggerStrategy;

public class FileLogger implements ILogger {
    
    ILoggerStrategy iLoggerStrategy;

    public FileLogger(ILoggerStrategy iLoggerStrategy) {
        this.iLoggerStrategy = iLoggerStrategy;
    }

    @Override
    public void log(String message) { 
        System.out.println("FileLogger: " + iLoggerStrategy.apply(message));
    }
}
