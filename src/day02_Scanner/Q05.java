package day02_Scanner;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin a kenar uzunluðunu giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Üçgenin b kenar uzunluðunu giriniz: ");
        int b = scanner.nextInt();

        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + h);

        scanner.close();
	}

}
