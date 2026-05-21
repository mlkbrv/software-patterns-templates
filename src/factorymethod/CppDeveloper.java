package factorymethod;

//public class CppDeveloper {
//    void writeCppCode() {
//        System.out.println("Write C++ Code");
//    }
//}

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp Developer writes Cpp Code");
    }
}