import Logger.FileLogger;
import Logger.ILogger;
import LoggerStrategy.CredentialLoggerStrategy;
import LoggerStrategy.FormattedLoggerStrategy;

public class Main {
    public static void main(String[] args) {
        
        ILogger iLogger = new FileLogger(new FormattedLoggerStrategy());
        iLogger.log("Hello World");
        
        iLogger = new FileLogger(new CredentialLoggerStrategy());
        iLogger.log("UserName: Aditya, password=aditya");
    }
}
