package singleton;

public class ProgramLogger {
    private static ProgramLogger instance;
    private static String logFile = "This is log file";
    public static synchronized ProgramLogger getProgramLogger() {
        if (instance == null) {
            instance = new ProgramLogger();
        }
        return instance;
    }
    private ProgramLogger() {

    }
    public void log(String message) {
        logFile = message + logFile;
        System.out.println(message);
    }
    public String getLogFile() {
        return logFile;
    }
}
