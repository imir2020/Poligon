package patterns.shablonyi.singleton;

public class ProgrammLoger {

    private static ProgrammLoger programmLoger;

    private static String logFile = "This is log file. \n\n";

    public synchronized static ProgrammLoger getProgrammLoger() {
        if (programmLoger == null) {
            programmLoger = new ProgrammLoger();
        }
        return programmLoger;
    }

    private ProgrammLoger() {

    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
