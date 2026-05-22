package creational.factorymethod;

public class Program {
    public static void main(String[] args) {
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeJavaCode();
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();
//        Developer developer = new JavaDeveloper();
//        developer.writeCode();
//        Developer developer2 = new CppDeveloper();
//        developer2.writeCode();
        DeveloperFactory developerFactory = createDeveloperFactory("Java");
//        DeveloperFactory developerFactory = new CppDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactory(String developerType) {
        switch (developerType) {
            case "C++":
                return new CppDeveloperFactory();
            case "Java":
                return new JavaDeveloperFactory();
            case "Php":
                return new PhpDeveloperFactory();
            default:
                throw new IllegalArgumentException("Developer type " + developerType + " not supported");
        }
    }
}
