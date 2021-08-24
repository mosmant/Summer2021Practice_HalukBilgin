package day02_Scanner;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		 /*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner oku = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("a: ");
        a = oku.nextDouble();

        System.out.print("b: ");
        b = oku.nextDouble();

        System.out.print("c: ");
        c = oku.nextDouble();

        double toplam = ((a * a) - (b * b)) / (3 * c);
        System.out.println("Sonuç: " + toplam);
        
        oku.close();

	}

}
