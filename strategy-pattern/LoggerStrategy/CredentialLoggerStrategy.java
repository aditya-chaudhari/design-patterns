package LoggerStrategy;

public class CredentialLoggerStrategy implements ILoggerStrategy {
    
    String regex = "password=\\S+";
    String replacement = "password=*****";

    public CredentialLoggerStrategy() {}

    public CredentialLoggerStrategy(String regex, String replacement) {
        this.regex = regex;
        this.replacement = replacement;
    }

    @Override
    public String apply(String message) {
        return message.replaceAll(regex, replacement);
    }
}
