import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args){
        int n0=1;
        int n1=1;
        int n2;
        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;
        for(int i=2; i<20; i++){
            n2=n0+n1;
            array[i] = n2;
            n0=n1;
            n1=n2;
        }
        System.out.println(Arrays.toString(array));
    }
}
