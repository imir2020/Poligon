package patterns.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programms = {new BankSystem(new JavaFaper()),
                new StockExchange(new CppFaper())};

       for(Program p : programms){
           p.developProgram();
       }
    }

}
