public class EqualityOfHalfs {
    public static void main(String[] args){

        int quant=0;
        for(long i=1000001; i<=1999999; i++){
            int sum1=0;
            int sum2=0;
            String iChar = String.valueOf(i);
            for (int j=1; j<4; j++){
                int temp1 = Character.getNumericValue(iChar.charAt(j));
                sum1+=temp1;
            }
            for(int q=4; q<7; q++){
                int temp2 = Character.getNumericValue(iChar.charAt(q));
                sum2+=temp2;
            }
            if(sum1==sum2){
                quant++;
            }
        }
        System.out.println(quant);
    }
}
