import java.util.Arrays;

public class TriangleArray {
    public static void main (String[] args){
        int[][] array = new int[10][10];
        array[0][0] = 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp1=1;
                int temp2=1;
                int temp3=1;
                for(int q=1; q<=i; q++){
                    temp1*=q;
                }
                for(int k=1; k<=j; k++){
                    temp2*=k;
                }
                for(int u=1; u<=(i-j); u++){
                    temp3*=u;
                }
                int c=temp1/(temp2*temp3);
                array[i][j] = c;
//                System.out.println(array.length);
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
// c=n!/k!(n-k)!