package task_7f.logger;

public class LoggerConsole implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}