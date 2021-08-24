package day06_StringManipulation;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.
		// Bu methodu main methodun disinda olusturup main methodun
		// icinden cagiriniz.
		// 1 saat 3600 sn ===== 1 mil 1.6*km ===== 1kg 1000gr
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("saat \nmil \nkilogram \nÇevireceðiniz birimi giriniz:");
		String birim = scan.nextLine();
		System.out.print("Çevireceðiniz miktarý giriniz:");
		double miktar = scan.nextDouble();

		cevirici(birim,miktar);
		scan.close();
	}

	public static void cevirici(String birim, double miktar) {
		switch (birim) {
		case "saat":
			System.out.println(miktar*3600 + "sn");
			break;
		case "mil":
			System.out.println(miktar*1.6 + "km");
			break;
		case "kilogram":
			System.out.println(miktar*1000 + "gr");
			break;
		default:
			System.out.println("hatalý bir giriþ yaptýnýz.");

		}

	}

}
