public class lesson46 {

    //6. Write a method named getEvenDigitSum with one parameter of the type "int".
    // The method should return the sum of even digits within the number.
    // If the number is negative, method should return -1;

    private static int getEvenDigitSum(int a) {
        int x = 0;
        if (a >= 0) {
            for (int i = 0; i <= a; i++) {
                if (i % 2 == 0) {
                    x += i;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345));
    }
}
