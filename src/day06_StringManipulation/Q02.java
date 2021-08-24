package day06_StringManipulation;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðýnýz, 3 kelimedne oluþan ismi
		// Örn. Ahmet Emin Yýlmaz -> A.E.Y. formatýyla yazdýrýnýz.
		Scanner scan = new Scanner(System.in);
		System.out.println("adýnýzý soyadýnýz giriniz : ");
		String adSoyad = scan.nextLine();// hakan tetik javacý 

		String name1 = adSoyad.substring(0, adSoyad.indexOf(" "));
		String name2 = adSoyad.substring(adSoyad.indexOf(" ") + 1, adSoyad.lastIndexOf(" "));
		String soyadString = adSoyad.substring(adSoyad.lastIndexOf(" ") + 1);

		char n1 = name1.toUpperCase().charAt(0);
		char n2 = name2.toUpperCase().charAt(0);
		char n3 = soyadString.toUpperCase().charAt(0);

		System.out.println("adýnýz : " + name1 + " ikinci adýnz : " + name2 + " soyadýnýz : " + soyadString);
		System.out.println(n1 + ". " + n2 + ". " + n3 + ".");
		scan.close();
	}

}
