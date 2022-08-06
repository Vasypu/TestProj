public class Test4 {
    int i;
    String string;

    public int getI() {
        return i;
    }

    public String getString() {
        return string;
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        Test4 test3 = new Test4();
        System.out.println(test4.getI() + test4.getString());
    }
}
