public class SimpleNum {

    public static void main(String[] args) {
        int num = 17;
        int det=0;
        for (int i = 2; i < num; i++) {
            if(num % i==0) {
                det+=1;
            }
        }
        if (det == 0) {
            System.out.println("Simple!");
        }
        else {
            System.out.println("Not Simple!");
        }
    }
}
