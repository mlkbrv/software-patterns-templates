package structural.adapter;

public class Adapter extends Database implements DatabaseClient {
    @Override
    public void selectObject() {
        select();
    }

    @Override
    public void insertObject() {
        insert();
    }

    @Override
    public void updateObject() {
        update();
    }

    @Override
    public void removeObject() {
        remove();
    }
}
