import Logger.ILogger;
import LoggerFactory.FileLoggerFactory;
import LoggerFactory.ILoggerFactory;
import LoggerFactory.KafkaLoggerFactory;

public class Main {
    public static void main(String[] args) {
        ILoggerFactory loggerFactory = new FileLoggerFactory();
        ILogger iLogger = loggerFactory.getLogger();
        iLogger.log("Hello World");
        
        loggerFactory = new KafkaLoggerFactory();
        iLogger = loggerFactory.getLogger();
        iLogger.log("Hello World");
    }
}
