package day02_Scanner;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
        Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
        Örnek Ekran Çýktýsý
        Mesafeyi giriniz: 400
        Hýzý giriniz: 100
        Süre 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gideceðiniz yol mesafesi(km): ");
        double yol = scanner.nextDouble();

        System.out.print("Ortalama Hýzýnýz(km/sa): ");
        double ort_hiz = scanner.nextDouble();

        double varis_suresi = yol / ort_hiz;
        System.out.print("Varýþ süreniz: " + varis_suresi + " saat");

        scanner.close();
	}

}
