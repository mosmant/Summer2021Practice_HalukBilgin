package day07_ForLoop;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*Kullanýcýdan 1'den büyük bir tam sayý girmesini isteyin
        ve 1'den girilen tam sayýya kadar olan sayýlarýn karelerinin toplamýný
        hesaplayan kodu yazýnýz.
        Örnek Ekran Çýktýsý
        Girilen sayý=4
        Kareler toplamý=30
        */


       Scanner scanner = new Scanner(System.in);

       System.out.print("Bir tamsayý giriniz: ");
       int sayi = scanner.nextInt();
       int toplam = 0;

       for (int i = 1; i <= sayi; i++) {

           toplam = (i * i) + toplam;

       }
       System.out.println("Sayýlarýn kareleri toplamý: " + toplam);

	}

}
