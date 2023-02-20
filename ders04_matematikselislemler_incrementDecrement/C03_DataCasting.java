package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        //kullanıcıdan iki adet int değer alıp,
        // bunları birbirine bölün ve sonucu double olarak yazın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz");

        int sayi1 = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz");

        int sayi2 = scanner.nextInt();

        System.out.println(sayi1/sayi2);

        double ondalikliSonuc = (double) (sayi1 / sayi2);

        System.out.println(ondalikliSonuc);

        double dogruSonuc = (double) sayi1 / sayi2;

        System.out.println(dogruSonuc);
    }
}
