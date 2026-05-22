package creational.factorymethod;

//public class JavaDeveloper {
//    public void writeJavaCode() {
//        System.out.println("Write Java Code");
//    }
//}

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java Code");
    }
}