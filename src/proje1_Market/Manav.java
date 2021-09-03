package proje1_Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {

	Manav() {}  // default cons.

	public static List<Manav> urunListesi = new ArrayList<>();
	public static List<Manav> sepet = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public String urun;
	public double fiyat;
	public double tutar;
	public double kilo;

	public static double Toplamtutar = 0;

	public static void main(String[] args) {
		Manav methoduAl = new Manav();
		boolean cikis = false;
		String islem = null;
		System.out.println("=== JAVA MANAV ===");
		methoduAl.listele();

		// menu i?in ayr? bir method yazmad?m
		while (!cikis) {

			System.out.println("1-?r?n Ekle");
			System.out.println("2-Toplam Tutar");
			System.out.println("3-??k??");
			islem = scan.next();
			switch (islem) {
			case "1":
				methoduAl.sepeteEkle();
				break;
			case "2":
				methoduAl.sepetiYazdir();
				break;
			case "3":
				cikis = true;
				break;

			default:
				System.out.println("Yanl?? bir i?lem yapt?n?z");
				break;
			}
		}
	}

	// ================= Methodlar bunun alt?nda===============
	// ---- sepete eklenenleri al yazd?r topla
	public void sepetiYazdir() {
		System.out.println("====Sepetteki ?r?nleriniz====");

		for (int i = 0; i < sepet.size(); i++) {
			System.out.println(0 + "" + i + "  " + sepet.get(i).urun + "  " + sepet.get(i).kilo + " kg " + " tutar? : "
					+ sepet.get(i).tutar);
			Toplamtutar += sepet.get(i).tutar;
		}
		System.out.println("-------------------- TOPLAM : " + Toplamtutar);

	}

	// ----Urunu se? sepete koy ----
	public void sepeteEkle() {
		System.out.print("L?tfen ?r?n?n no'sunu giriniz: ");
		int secim = scan.nextInt();
		System.out.print("L?tfen ?r?n?n kilosunu giriniz: ");
		double kilo = scan.nextDouble();
		double tutar = kilo * urunListesi.get(secim).fiyat;
		urun = urunListesi.get(secim).urun;
		if (secim > urunListesi.size()) {
			System.out.println("Listeki ?r?n numaras? harici giri? yapt?n?z.");
		} else {
			Manav sepeteKoy = new Manav(urun, kilo, tutar);
			sepet.add(sepeteKoy);
		}
	}

	// ----- Listele methodunu olu?turdum.
	public void listele() {

		Manav ekle1 = new Manav("Domates", 2.10);
		urunListesi.add(ekle1);
		Manav ekle2 = new Manav("Patates", 3.20);
		urunListesi.add(ekle2);
		Manav ekle3 = new Manav("Biber  ", 1.50);
		urunListesi.add(ekle3);
		Manav ekle4 = new Manav("So?an  ", 2.30);
		urunListesi.add(ekle4);
		Manav ekle5 = new Manav("Havu?  ", 3.10);
		urunListesi.add(ekle5);
		Manav ekle6 = new Manav("Elma   ", 1.20);
		urunListesi.add(ekle6);
		Manav ekle7 = new Manav("Muz    ", 1.90);
		urunListesi.add(ekle7);
		Manav ekle8 = new Manav("?ilek  ", 6.10);
		urunListesi.add(ekle8);
		Manav ekle9 = new Manav("Kavun  ", 4.30);
		urunListesi.add(ekle9);
		Manav ekle10 = new Manav("?z?m  ", 2.70);
		urunListesi.add(ekle10);
		Manav ekle11 = new Manav("Limon  ", 0.50);
		urunListesi.add(ekle11);

		System.out.println(" No     ?r?n         Fiyat");
		System.out.println("====  =======        =========");

		for (int i = 0; i < urunListesi.size(); i++) {
			if (i < 10) {
				System.out.println(
						0 + "" + i + "     " + urunListesi.get(i).urun + "        " + urunListesi.get(i).fiyat + " TL");
			} else {
				System.out
						.println(i + "     " + urunListesi.get(i).urun + "        " + urunListesi.get(i).fiyat + " TL");
			}

		}

	}

	// ----- COnstructor olu?turdum ------(listeleme ile ilgili)
	public Manav(String urun, double fiyat) {
		this.urun = urun;
		this.fiyat = fiyat;
	}

	// ----- COnstructor olu?turdum ------(sepet ile ilgili)
	public Manav(String urun, double kilo, double tutar) {
		this.urun = urun;
		this.tutar = tutar;
		this.kilo = kilo;

	}

}
