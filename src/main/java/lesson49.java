public class lesson49 {
    public static void main(String[] args) {

        //"9. Write a program which prints the next figure to the console:
        //*
        //**
        //***
        //****
        //*****
        //******
        //*******"

        String star = "*";
        for (int i = 1; i < 8; i++) {
            String repeated = new String(new char[i]).replace("\0", star);
            System.out.println(repeated);
        }
    }
}