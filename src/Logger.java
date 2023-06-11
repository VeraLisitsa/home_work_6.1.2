import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        String dateTime = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm:ss")
                .format(LocalDateTime.now());
        System.out.println("[" + dateTime + " " + num + "] " + msg);
        num++;
    }
}
