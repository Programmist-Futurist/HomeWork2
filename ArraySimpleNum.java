import java.util.Arrays;

public class ArraySimpleNum {
    public static void main(String[] args) {

        int[] array = new int[100];
        int point=2;

        for (int i=0; i<100; i++) {

            for (int num = point; num < 550; num++) {
                int det = 0;

                for (int j = 2; j < num; j++) {
                    if (num%j == 0) {
                        det+=1;
                    }
                }
                if (det == 0){
                    array[i]=num;
                    point=++num;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}