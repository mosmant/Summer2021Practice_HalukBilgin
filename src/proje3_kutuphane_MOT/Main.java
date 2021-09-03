package proje3_kutuphane_MOT;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1- Kitap ekleme
		// 2- Tüm Kitap listesi (kütüphanede var olan tüm kitaplarý listeler)
		// 3- Kitap ödünç verme iþlemi (kütüphanede olan kitabý ödünç vermeye yarar.)
		// 4- Ödünç verilen Kitap listesi ()
		// 5- Ödünç verilen kitap teslimi (ödünç verilen kitabýn teslim alýnmasýyla
		// ödünç listesinden temizlenmesi.)

		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String islem = null;

		M01 methodlarial = new M01();
		List<C01> tumKitaplar = null;
		List<C01> oduncKitaplar = null;
		boolean cikilsinMi = false;

		while (!cikilsinMi) {
			System.out.println("1- Kitap ekleme");
			System.out.println("2- Tüm Kitap listesi");
			System.out.println("3- Kitap ödünç verme iþlemi");
			System.out.println("4- Ödünç verilen Kitap listesi");
			System.out.println("5- Ödünç verilen kitap teslimi");
			System.out.println("6- Çýkýþ");
			islem = scan.nextLine();
			switch (islem) {
			
			
			case "1":
				tumKitaplar= methodlarial.ekleme();
				break;
			case "2":
				methodlarial.listeleme(tumKitaplar);
				break;
			case "3":
				oduncKitaplar=methodlarial.oduncVerme();
				break;
			case "4":
				methodlarial.oduncListeleme(oduncKitaplar);
				break;
			case "5":
				oduncKitaplar=methodlarial.oduncTeslim();
				break;
			case "6":
				cikilsinMi=true;
				break;

			default:
				System.out.println("Yanlýþ 1 iþlem girdiniz !!!");
				break;
			}
		}

	}

}
