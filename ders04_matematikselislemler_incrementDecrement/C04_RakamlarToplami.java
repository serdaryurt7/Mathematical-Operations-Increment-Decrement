package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        // kullanıcının girdiği 4 basamaklı bir sayının rakamlar toplamını veren bir kod yazınız.

        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lüften Rakamları Toplanacak Sayıyı Giriniz: ");
        input = scanner.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        if (input >= 1000 && input < 10000){

            birlerBasamagi = input % 10; //3
            rakamlarToplami = rakamlarToplami + birlerBasamagi; //3
            input = input / 10;   //1453

            birlerBasamagi = input % 10; //5
            rakamlarToplami = rakamlarToplami + birlerBasamagi; //8
            input = input / 10;   //145

            birlerBasamagi = input % 10; //4
            rakamlarToplami = rakamlarToplami + birlerBasamagi; //12
            input = input / 10;   //14

            birlerBasamagi = input % 10; //1
            rakamlarToplami = rakamlarToplami + birlerBasamagi; //13


            System.out.println("Girilen Sayının Rakamlar Toplamı: " + rakamlarToplami);
        }

        else System.out.println("Girilen Sayı 4 Basamaklı Değildir.");








    }

}
