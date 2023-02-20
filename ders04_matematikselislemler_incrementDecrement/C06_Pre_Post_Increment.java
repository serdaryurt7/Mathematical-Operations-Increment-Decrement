package ders04_matematikselislemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        // a variable'nin değerini yazdırıp, sonra a'nin değerini bir arttırın.
        int a = 10;
        System.out.println("a" + a); //10
        a++; // a artık 11


        // b variable'nın değerini bir arttırıp sonra yazdırın.
        int b = 10;
        b++;//11
        System.out.println("b" + b); //11



        // post increment ----> önce işlemi yapar sonra arttırmayı yapar.
        int c = 10;
        System.out.println("c" + c++); //10


        //pre increment ----> önce arttırmayı yapar sonra işlemi yapar
        int d = 10;
        System.out.println("d" + ++d); // 11
    }
}
