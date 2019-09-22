public class lesson44 {
    public static void main(String[] args) {

        //4. Given an array of 10 integers. To display the sum of all its elements except the first and last.

        int[] myIntArray = new int[]{1, 23, 345, 4567, 5678, 6789, 7891, 801, 99, 101};
        int total = 0;
        for (int i = 1; i <= myIntArray.length - 2; i++) {
            total += myIntArray[i];
        }
        System.out.println(total);
    }
}