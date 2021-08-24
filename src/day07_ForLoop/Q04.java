package day07_ForLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// kullanýcýdan 5 adet sayý isteyiniz.
		// bu sayýlardan 5 ile 10 arasýndakiler hariç diðerlerinin toplamýný bulunuz.
		// bu soruyu continue kullanarak çözünüz.

		Scanner scan = new Scanner (System.in);
		int sum= 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("lütfen bir sayý giriniz: ");
			int sayi = scan.nextInt();
			if (sayi>=5 && sayi<10) {
				System.err.println("Girdiðiniz sayý 5 ile 10 arasýnda olduðundan toplama yapýlmamaktadýr.");
				continue;
			}else {
				sum+=sayi;				
			}
					}
		System.out.println("Sayýlarýn toplamý : "+sum);
		scan.close();
	}

}
