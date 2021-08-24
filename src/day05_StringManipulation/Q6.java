package day05_StringManipulation;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre ekrana A, B, C veya D
		// yazdýrýn.
		// 1. 0()dahil ile 50 arasi - D
		// 2. 50(dahil) ile 60 arasý - C
		// 3. 60(dahil) ile 80 arasý - B
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.

		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean
		// kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.

		Scanner scanner = new Scanner(System.in);
		System.out.print("litfen notunuzu giriniz : ");
		int not = scanner.nextInt();
		String note = scanner.nextLine();

		if (not >= 0 && not < 50) {
			// not=50;
			note = "kaldýnýz";
		} else if (not >= 50 && not < 60) {
			// not=60;
			note = "ucuz yýrttýnýz";
		} else if (not >= 60 && not < 80) {
			// not=80;
			note = "baþarýlý";
		} else if (not >= 80 && not <= 100) {
			// not=100;
			note = "gayet baþarýlý";
		}

		switch (note) {
		case "kaldýnýz": {
			System.out.println("notunuz : D");
			break;
		}
		case "ucuz yýrttýnýz": {
			System.out.println("notunuz : C");
			break;
		}
		case "baþarýlý": {
			System.out.println("notunuz : B");
			break;
		}
		case "gayet baþarýlý": {
			System.out.println("notunuz : A");
			break;
		}
		default:
			System.out.println("geçerli not giriniz");
			break;

		}scanner.close();
	}
}
