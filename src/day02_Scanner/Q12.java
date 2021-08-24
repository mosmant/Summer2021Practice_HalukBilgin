package day02_Scanner;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný alarak, iþin bitme süresini
        hesaplayan kodu yazýnýz.
        Örneðin, Bir iþçi bir iþi 10 günde yapabilmektedir.
        Buna göre 2 iþçi ayný iþi kaç günde yapar?
        Örnek Ekran Çýktýsý
        Bir iþçi iþi kaç günde bitirmektedir? 10
        Toplam kaç iþçi çalýþacak? 2
        Ýþin bitme süresi 5 gündür.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir iþçi iþi kaç günde bitirmektedir: ");
        int bir_isci_bitirme_suresi = scanner.nextInt();

        System.out.print("Toplam kaç iþçi çalýþacak: ");
        int isci_sayisi = scanner.nextInt();

        int coklu_bitirme_suresi = bir_isci_bitirme_suresi / isci_sayisi;
        System.out.println("Ýþin bitme süresi: " + coklu_bitirme_suresi);
        
        scanner.close();

	}

}
