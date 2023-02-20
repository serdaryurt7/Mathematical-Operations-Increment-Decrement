package ders04_matematikselislemler_incrementDecrement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        //bu sayıyı 3 arttıralım ve yazdıralım.

        int sayi = 10;

        sayi = sayi + 3;

        sayi += 3;

        System.out.println(sayi);

        int  s = 10;
        // bu sayıyı bir arttıralım.

        s+=1;
        System.out.println(s);
        s = s +1;
        System.out.println(s);
        s++;   //post increment
        System.out.println(s);
        ++s;   //pre increment
        System.out.println(s);

        int t = 10;

        t = t-1;
        t--;
        t-=1;
        --t;
        System.out.println(t);


    }
}
