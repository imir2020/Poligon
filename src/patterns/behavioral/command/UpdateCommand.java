package patterns.behavioral.command;

public class UpdateCommand implements Commander{
    DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
