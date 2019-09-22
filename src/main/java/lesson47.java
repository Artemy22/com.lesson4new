public class lesson47 {
    //"7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    //If one of the parameters is < 10, method should return -1 to indicate an invalid value.
    //The method should return the greatest common divisor of two numbers."

    private static int getEvenDigitSum(int first, int second) {
        int common = 0;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int comp = Math.min(first, second);
            for (int i = 1; i <= comp; i++) {
                if (first % i == 0 && second % i == 0) {
                    common = i;
                }
            }
        }
        return common;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12, 1200));
    }
}
