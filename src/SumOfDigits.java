public class SumOfDigits {

    public static void main(String[] args) {
        int num = 1234;
        int sum=0;
        String varChar = String.valueOf(num);
        for (int i = 0; i < varChar.length(); i++){

            int temp = Character.getNumericValue(varChar.charAt(i));
            sum += temp;
        }
        System.out.println(sum);
    }
}
