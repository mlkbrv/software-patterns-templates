package creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().log("Starting Program Runner");
        ProgramLogger.getProgramLogger().log("Starting Program Runner2");
        ProgramLogger.getProgramLogger().log("Starting Program Runner3");
        System.out.println(ProgramLogger.getProgramLogger().getLogFile());
    }
}
