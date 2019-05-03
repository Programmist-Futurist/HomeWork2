public class SumOfRow {
    public static void main(String[] args) {
        int num = 4;
        int sum=0;
        for(int i = 0; i <= num; i++){
            int temp=1;
            for(int j=1; j<=i; j++){
                temp *= j;
            }
            sum+=temp;
        }
        System.out.println(sum-1);
    }
}
