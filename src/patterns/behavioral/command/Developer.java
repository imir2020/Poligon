package patterns.behavioral.command;

public class Developer {
    Commander insert;
    Commander update;
    Commander select;
    Commander delete;

    public Developer(Commander insert, Commander update, Commander select, Commander delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
