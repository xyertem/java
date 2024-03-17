public class MethodOverloading {
    public static void main(String[] args) {

    }

    public static int process(int a, int b) { return 0; }
    public static void process(String a, int b, int c) { }
    public static int process(boolean a, int b) { return 0; }
    public static void process(int a, int b) { }
    public static int process(int a) { return 0; }
    public static int process(int b, int a) { return 0; }


}
