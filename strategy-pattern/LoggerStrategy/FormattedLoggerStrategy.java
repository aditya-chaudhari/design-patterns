package LoggerStrategy;

public class FormattedLoggerStrategy implements ILoggerStrategy{
    
    String format = "--------------------------------------------\n";

    public FormattedLoggerStrategy() {}

    public FormattedLoggerStrategy(String format) {
        this.format = format;
    }

    @Override
    public String apply(String message) {
        return format + message;
    }
    
}
