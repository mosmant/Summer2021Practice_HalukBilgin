package day10_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Double> urunFiyatlari =new ArrayList<>();
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

		urunListesi.add("Domates - Urun Kodu :1");
		urunListesi.add("Biber - Urun Kodu :2");
		urunListesi.add("Erik - Urun Kodu :3");
		urunListesi.add("Karpuz - Urun Kodu :4");
		urunListesi.add("Seftali - Urun Kodu :5");

		urunFiyatlari.add(5.0);
		urunFiyatlari.add(4.0);
		urunFiyatlari.add(12.0);
		urunFiyatlari.add(1.5);
		urunFiyatlari.add(13.0);
		System.out.println(urunListesi.toString());//String e çevirip yaz
		musteriSecim();


	}
	public static void musteriSecim() {
		Scanner scan = new Scanner(System.in);//
		System.out.print("Hangi urunu secmek istersiniz? : ");
		int secim =scan.nextInt();//

		System.out.print("Kac kilo almak istersiniz? : ");
		double kilo =scan.nextFloat();
		double urunFiyati = urunFiyatlari.get(secim);
		double toplamUrunFiyati=kilo*urunFiyati;
		toplanOdenecekTutar+=toplamUrunFiyati;

		System.out.println("Sectiginiz urun: " + urunListesi.get(secim+1));
		System.out.println("Urun Fiyati: " +toplamUrunFiyati);

		System.out.print("Alisverise devam etmek isterseniz 1, kasaya gitmek icin 2 yaziniz : ");
		int karar = scan.nextInt();
		if(karar==1) {
			musteriSecim();
		}else {
			kasa();
		}
	}
	public static void kasa() {
		System.out.println("Toplam odenecek tutar: " + toplanOdenecekTutar);

	}
}
