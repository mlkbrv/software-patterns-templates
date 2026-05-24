package behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database db  = new Database();
        Developer dev = new Developer(
                new InsertCommand(db),
                new DeleteCommand(db),
                new SelectCommand(db),
                new UpdateCommand(db)
        );
        dev.insertRecord();
        dev.updateRecord();
        dev.selectRecord();
        dev.deleteRecord();
    }
}
