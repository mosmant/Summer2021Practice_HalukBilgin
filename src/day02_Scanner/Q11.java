package day02_Scanner;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*
        TechProEd spor salonu için kullanýcýdan isim soyisim, yaþ, kilo, boy, salona devam edeceði ay süresini
        bilgilerini alýp aylýk $20 olarak toplam ücretini yazdýrýnýz.
         */
       
		Scanner scanner = new Scanner(System.in);

        System.out.println("TechProEd Salonu'na hoþgeldiniz!");

        System.out.print("Ýsim Soyisim: ");
        String isim = scanner.nextLine();

        System.out.print("Yaþýnýz: ");
        int yas = scanner.nextInt();

        System.out.print("Kilo: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boy: ");
        double boy = scanner.nextDouble();

        System.out.print("Kaç aylýk kaydolacaksýnýz: ");
        int aylik = scanner.nextInt();

        int aylik_ucret = 20;

        int toplam_tutar = aylik_ucret * aylik;

        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");

        scanner.close();
	}
	

}
