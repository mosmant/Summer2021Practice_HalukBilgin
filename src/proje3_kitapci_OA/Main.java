package proje3_kitapci_OA;

import java.util.Scanner;

public class Main {

	/*
	 * 
	 * Bir kitapci icin program yapalim Kitap no 1000'den baslayarak sirali no olsun
	 * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
	 * 
	 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
	 * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
	 * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- çýkýþ
	 */

	public static void main(String[] args) {

		KitapBilgileri kb = new KitapBilgileri();
		Scanner scan = new Scanner(System.in);

		System.out.println("JAVA KUTUPHANESI'NE HOS GELDINIZ.");

		byte secim = 0;

		do {

			System.out.println(
					"\n-------------------------------------------------------\n1- \tKitap Ekle \n2- \tNumara Ile Kitap Goruntule \n3- \tBilgi ile kitap goruntule"
							+ "\n4 \tNumara Ile Kitap Sil \n5- \tTum Kitaplari Listele \n6- \tCikis");
			System.out.println("Yapmak istediginiz islem numarasini giriniz: ");

			secim = scan.nextByte();

			switch (secim) {

			case 1:
				byte islem =0;
				do {
				kb.kitapEkle();
				System.out.println("Eklemek istediginiz baska bir kitap var mi? \nEvet icin 1'i Hayir icin 0'i tuslayiniz.");
				islem = scan.nextByte();
				scan.nextLine();
				}while(islem!=0);
				
				break;
			case 2:
				kb.numaraIleKitapListele();
				break;
			case 3:
				kb.bilgiIleKitapListele();
				break;
			case 4:
				do {
				kb.numaraIleKitapSil();
				System.out.println("Silmek istediginiz istediginiz baska bir kitap var mi? \\nEvet icin 1'i Hayir icin 0'i tuslayiniz.");
				islem =scan.nextByte();
				}while(islem!=0);
				break;
			case 5:
				kb.listele();
				break;
			case 6:
				System.out.println("Gorusmek uzere!");
				break;

			default:

				System.out.println("Lutfen size sunulan islemlerden birini seciniz!");
				break;
			}

		} while (secim != 6);

	}

}
