package behavioral.command;

public class Developer {
    Command insert;
    Command delete;
    Command select;
    Command update;

    public Developer(Command insert, Command delete, Command select, Command update) {
        this.insert = insert;
        this.delete = delete;
        this.select = select;
        this.update = update;
    }
    public void insertRecord()
    {
        insert.execute();
    }
    public void deleteRecord()
    {
        delete.execute();
    }
    public void selectRecord()
    {
        select.execute();
    }
    public void updateRecord()
    {
        update.execute();
    }
}
