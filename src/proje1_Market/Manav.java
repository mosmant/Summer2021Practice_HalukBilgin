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

		// menu için ayrý bir method yazmadým
		while (!cikis) {

			System.out.println("1-Ürün Ekle");
			System.out.println("2-Toplam Tutar");
			System.out.println("3-Çýkýþ");
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
				System.out.println("Yanlýþ bir iþlem yaptýnýz");
				break;
			}
		}
	}

	// ================= Methodlar bunun altýnda===============
	// ---- sepete eklenenleri al yazdýr topla
	public void sepetiYazdir() {
		System.out.println("====Sepetteki Ürünleriniz====");

		for (int i = 0; i < sepet.size(); i++) {
			System.out.println(0 + "" + i + "  " + sepet.get(i).urun + "  " + sepet.get(i).kilo + " kg " + " tutarý : "
					+ sepet.get(i).tutar);
			Toplamtutar += sepet.get(i).tutar;
		}
		System.out.println("-------------------- TOPLAM : " + Toplamtutar);

	}

	// ----Urunu seç sepete koy ----
	public void sepeteEkle() {
		System.out.print("Lütfen Ürünün no'sunu giriniz: ");
		int secim = scan.nextInt();
		System.out.print("Lütfen Ürünün kilosunu giriniz: ");
		double kilo = scan.nextDouble();
		double tutar = kilo * urunListesi.get(secim).fiyat;
		urun = urunListesi.get(secim).urun;
		if (secim > urunListesi.size()) {
			System.out.println("Listeki ürün numarasý harici giriþ yaptýnýz.");
		} else {
			Manav sepeteKoy = new Manav(urun, kilo, tutar);
			sepet.add(sepeteKoy);
		}
	}

	// ----- Listele methodunu oluþturdum.
	public void listele() {

		Manav ekle1 = new Manav("Domates", 2.10);
		urunListesi.add(ekle1);
		Manav ekle2 = new Manav("Patates", 3.20);
		urunListesi.add(ekle2);
		Manav ekle3 = new Manav("Biber  ", 1.50);
		urunListesi.add(ekle3);
		Manav ekle4 = new Manav("Soðan  ", 2.30);
		urunListesi.add(ekle4);
		Manav ekle5 = new Manav("Havuç  ", 3.10);
		urunListesi.add(ekle5);
		Manav ekle6 = new Manav("Elma   ", 1.20);
		urunListesi.add(ekle6);
		Manav ekle7 = new Manav("Muz    ", 1.90);
		urunListesi.add(ekle7);
		Manav ekle8 = new Manav("Çilek  ", 6.10);
		urunListesi.add(ekle8);
		Manav ekle9 = new Manav("Kavun  ", 4.30);
		urunListesi.add(ekle9);
		Manav ekle10 = new Manav("Üzüm  ", 2.70);
		urunListesi.add(ekle10);
		Manav ekle11 = new Manav("Limon  ", 0.50);
		urunListesi.add(ekle11);

		System.out.println(" No     Ürün         Fiyat");
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

	// ----- COnstructor oluþturdum ------(listeleme ile ilgili)
	public Manav(String urun, double fiyat) {
		this.urun = urun;
		this.fiyat = fiyat;
	}

	// ----- COnstructor oluþturdum ------(sepet ile ilgili)
	public Manav(String urun, double kilo, double tutar) {
		this.urun = urun;
		this.tutar = tutar;
		this.kilo = kilo;

	}

}
