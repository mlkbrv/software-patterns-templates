package behavioral.iterator;

public class JavaDevRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Maven","SQL"};
        JavaDev dev = new JavaDev("Emil",skills);

        Iterator i = dev.getIterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
        }

    }
}
