package patterns.creational.singleton;

public class ProgramRunner {

    public static void main(String[] args) {
        System.out.println(ProgrammLoger.getProgrammLoger().toString());
        System.out.println(ProgrammLoger.getProgrammLoger().toString());
        System.out.println(ProgrammLoger.getProgrammLoger().toString());
        System.out.println(ProgrammLoger.getProgrammLoger().toString());
        System.out.println(ProgrammLoger.getProgrammLoger().toString());
        System.out.println(ProgrammLoger.getProgrammLoger().toString());
        System.out.println("---------------------------------------");
        ProgrammLoger.getProgrammLoger().addLogInfo("First log");
        ProgrammLoger.getProgrammLoger().addLogInfo("Second log");
        ProgrammLoger.getProgrammLoger().addLogInfo("Third log");
        ProgrammLoger.getProgrammLoger().addLogInfo("Forth log");

        ProgrammLoger.getProgrammLoger().showLogFile();//статическая переменная инициализируется первой.


    }
}
