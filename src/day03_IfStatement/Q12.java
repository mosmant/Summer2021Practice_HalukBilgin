package day03_IfStatement;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*
        Kullanýcýdan vize ve final notlarýný alýnýz.
        Kullanýcýn istediði oranlarda vize ve final yüzdeleri not ile not ortalamasýný hesaplayýp
        not ortalamasýný yazdýrýp 50 ve büyük ise "Tebrikler dersi baþarý ile geçtiniz..." küçük ise
        "Malesef dersten kaldýnýz..." yazdýrýnýz
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize Notunuz: ");
        int vize = scanner.nextInt();

        System.out.print("Final Notunuz: ");
        int fin = scanner.nextInt();

        System.out.print("Vize yüzdesi kaçtýr? ");
        double vize_yuzde = scanner.nextDouble();

        System.out.print("Final yüzdesi kaçtýr? ");
        double fin_yuzde = scanner.nextDouble();

        double not_ort = (double) (vize * vize_yuzde / 100) + (double) (fin * fin_yuzde / 100);

        System.out.println("Ortalamanýz hesaplanýyor..................");
        System.out.println("Not ortalamanýz: " + not_ort);

        if (not_ort >= 50) {
            System.out.println("Tebrikler dersi baþarý ile geçtiniz...");
        } else {
            System.out.println("Malesef dersten kaldýnýz...");
        }
        scanner.close();

	}

}
