package example;

public class Test {
    static Integer i;

    public static void main(String[] args) {
        try {
            if (i == 42)
                System.out.println("믿을 수 없군!");
        } catch (NullPointerException e) {
            i = new Integer(42);
            if (i == 42)
                System.out.println("믿을 수 없군!");
        }
    }

}
