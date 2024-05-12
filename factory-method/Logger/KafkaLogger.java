package Logger;

public class KafkaLogger implements ILogger {
    
    @Override
    public void log(String message) {
        System.out.println("KafkaLogger: " + message);
    }
}
