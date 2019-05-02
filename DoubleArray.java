import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        char[][] array = new char[5][5];

        for (int i = 0; i < array.length; i+=2) {
            for (int j = 0; j < array.length; j += 2) {
                array[i][j] = 'Ч';
                System.out.println(array.length);
            }
            for (int j = 1; j < array.length; j += 2) {
                array[i][j] = 'Б';
            }
        }
        for (int i = 1; i < array.length; i+=2) {
            for (int j = 0; j < array.length; j += 2) {
                array[i][j] = 'Б';
                System.out.println(array.length);
            }
            for (int j = 1; j < array.length; j += 2) {
                array[i][j] = 'Ч';
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
