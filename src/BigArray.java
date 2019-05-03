import java.util.Arrays;

public class BigArray {
    public static void main(String[] args) {
        int[][][][][][] array = new int[2][2][2][2][2][2];
        int var = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int q = 0; q < array.length; q++) {
                    for (int k = 0; k < array.length; k++) {
                        for (int h = 0; h < array.length; h++) {
                            for (int g = 0; g < array.length; g++) {
                                array[i][j][q][k][h][g] = var++ ;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}