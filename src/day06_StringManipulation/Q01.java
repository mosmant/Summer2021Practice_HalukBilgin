package day06_StringManipulation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye
		// ayiriniz
		// ad ayri soyad ayri sekilde ekrana yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("adýnýzý soyadýnýz giriniz : ");
		String adSoyad = scan.nextLine();// mustafa can
		String ad = adSoyad.substring(0, adSoyad.indexOf(" ")); // 0 ýncý indexten boþluða kadar olana ad tanýmladý
		String soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1); // burada da ad Stringini tanýmladýðý için ad stringinin uzunluðunu baz alýp +1 boþluk karakterini de alýp substring yapýyor ve args kullanmadan sonuna kadar yazdýrýyor.
		System.out.println("adýnýz : " + ad + " \nsoyadýnýz : " + soyad);
		scan.close();
	}

}
