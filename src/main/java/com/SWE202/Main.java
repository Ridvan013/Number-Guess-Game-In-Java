package com.SWE202;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int hedefSayi = random.nextInt(100) + 1;

        int tahmin;
        int sayac = 0;

        System.out.println("Sayı tahmin etme oyununa hoş geldiniz!");
        System.out.println("1 ile 100 arasında bir sayı tahmin edin.");


        do {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();

            sayac++;

            if (tahmin < hedefSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > hedefSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                System.out.println("Tahmin sayınız: " + sayac);
            }
        } while (tahmin != hedefSayi);

        scanner.close();
    }
}