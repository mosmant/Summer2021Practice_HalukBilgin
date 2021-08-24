package day10_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Bir integer list oluþturunuz ve bu listedeki tum sayýlarýn karesinin
		 * toplamýný bulunuz. Sonucu ekrana yazdýrýnýz.
		 */

		List<String> liste = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Listeye atamak üzere elemanlarinizi giriniz: ");
		System.out.println("Yeterli elemana ulasinca 'q' giriniz!");

		String islem = "";
		int sum = 0;

		while (!(islem.equalsIgnoreCase("q"))) {

			System.out.print("sayi giriniz: ");
			islem = scanner.nextLine();

			liste.add(islem);

		}
		liste.remove(liste.size() - 1); // Trick : girilen q silindi.

		for (String w : liste) {  // mehmet hoca each kullanýyor. Haluk hoca String ise wordun kýsaltmasý olarak w kullanýyor.
			int y = Integer.parseInt(w);
			sum += y * y;
		}
		System.out.println(liste + " nin elemanlarinin kareleri toplami = " + sum);

	}
}
