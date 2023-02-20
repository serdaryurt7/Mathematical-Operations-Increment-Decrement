package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        // Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz");

        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci Sayıyı Giriniz");

        double sayi2 = scanner.nextDouble();

        int sonuc = (int)(sayi1 / sayi2);

        System.out.println(sonuc);

    }
}
