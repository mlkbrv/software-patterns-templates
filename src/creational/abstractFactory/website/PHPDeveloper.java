package creational.abstractFactory.website;

import creational.abstractFactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer");
    }
}
