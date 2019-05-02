public class CommonDivider {

    static int a = 30;
    static int b = 25;

    public static void main(String[] args) {
        if (a > b) {
            int c=0;
            while (b!=0) {
                c = b;
                b = a % b;
                a = c;
            }
            System.out.println(c);
        }
    }
}

