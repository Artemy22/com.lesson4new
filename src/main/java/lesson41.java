public class lesson41 {
    public static void main(String[] args) {
        //"1. Print numbers from 10 to 20 using all known cycles.

        int[] array = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("FOREACH\n======");
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("\nFOR\n===");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nDoWhile\n======");
        int a = 0;
        do {
            System.out.println(array[a]);
            a++;
        } while (a < array.length);

        System.out.println("\nWhile\n======");
        int b = 0;
        while (b < array.length) {
            System.out.println(array[b]);
            b++;
        }
    }
}
