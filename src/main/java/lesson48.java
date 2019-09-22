public class lesson48 {
    public static void main(String[] args) {

        //"8. Write a program which prints the next figure to the console:
        //**********
        //**********
        //**********
        //**********"

        String star = "*";
        for (int i = 1; i < 5; i++) {
            String repeated = new String(new char[10]).replace("\0", star);
            System.out.println(repeated);
        }
    }
}