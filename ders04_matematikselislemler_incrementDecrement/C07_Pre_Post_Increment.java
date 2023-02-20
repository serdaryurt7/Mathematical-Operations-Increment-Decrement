package ders04_matematikselislemler_incrementDecrement;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a = 10;   // a = 10

        int b = a++;  // b= 10     a = 10

        int c = ++b;   // c = 11    b = 11   a = 11

        System.out.println(" a: " + a + ", b: " + b + ", c: " + c );    // a=11   b= 11    c=11


        a = 20;
        b = ++a;  //b=21, a=21
        c= a++;   //c=21, a22

        System.out.println(" a: " + a + ", b: " + b + ", c: " + c ); // a = 22    b=21    c=21

        a=30;

        System.out.println(a++);   //30
        System.out.println(--a);   //30
        System.out.println(a--);   //30
        System.out.println(a);     //29
    }
}
