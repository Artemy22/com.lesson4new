public class lesson45 {
    public static void main(String[] args) {
        //"5. Write a function which calculates and returns the minimum of 4 arguments.
        System.out.println(min(-11, -22, 0, 444));
    }

    private static int min(int a, int b, int c, int d) {
        int secondPair = Math.min(c, d);
        return Math.min(min(a, b), secondPair);
    }

    private static int min(int a, int b) {
        return Math.min(a, b);
    }
}