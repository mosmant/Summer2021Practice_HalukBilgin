package proje3_kitapci_OA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapBilgileri {

	static Scanner scan = new Scanner(System.in);
	int kitapNo = 999;
	String kitapAdi;
	String yazarAdi;
	double kitapFiyati;

	List<KitapBilgileri> kitapListesi = new ArrayList<>();

	public KitapBilgileri(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati) {

		this.kitapNo = kitapNo;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.kitapFiyati = kitapFiyati;
	}

	public KitapBilgileri() {

	}

	public void kitapEkle() {

		this.kitapNo++;
		System.out.println("Lutfen kitabin adini giriniz: ");
		this.kitapAdi = scan.nextLine();
		System.out.println("Lutfen yazar adini giriniz: ");
		this.yazarAdi = scan.nextLine();
		System.out.println("Lutfen kitabin fiyatini giriniz: ");
		this.kitapFiyati = scan.nextInt();
		scan.nextLine();

		KitapBilgileri kitapEkle = new KitapBilgileri(kitapNo, kitapAdi, yazarAdi, kitapFiyati);

		kitapListesi.add(kitapEkle);

		System.out.println("Kitap basariyla listenize eklendi!");

	}

	public void numaraIleKitapListele() {

		System.out.println("Lutfen listelenmesini istediginiz kitap numarasini giriniz: ");
		int no = scan.nextInt();
		scan.nextLine();

		for (KitapBilgileri w : kitapListesi) {

			if (w.kitapNo == no) {

				System.out.print(w);

				break;
			}
		}
	}

	public void bilgiIleKitapListele() {

		System.out.println("Lutfen listelenmesini istediginiz kitabin adini ya da yazarini giriniz: ");
		String kitap = scan.nextLine();

		for (KitapBilgileri w : kitapListesi) {

			if (w.kitapAdi.equals(kitap) || w.yazarAdi.equals(kitap)) {

				System.out.print(w);

				break;
			} else {

				System.out.println("Listemizde boyle bir kitap bulunamamistir.");
				break;
			}
		}

	}

	public void numaraIleKitapSil() {

		System.out.println("Lutfen silinmesini istediginiz kitap numarasini giriniz: ");
		int silNo = scan.nextInt();
		scan.nextLine();
		
		

		for (KitapBilgileri w : kitapListesi) {

			if (w.kitapNo == silNo) {

				System.out.println(w + "Bu kitap ve bilgileri listeden kaldirilmistir!");

				kitapListesi.remove(kitapListesi.indexOf(w));
				break;

			}


		}
		
		
		
		
	}

	public void listele() {

		System.out.println("\n-------------------------------------------------------------");
		
		if (kitapListesi.isEmpty()) {
			
			System.out.println("Listenizde kitap bulunmamaktadir.");
		} else {
			
		

		for (int i = 0; i < kitapListesi.size(); i++) {

			System.out.println(kitapListesi.get(i));
		}

	}
	}

	@Override
	public String toString() {

		return "\nKitap Adi \t" + kitapAdi + "\nYazar Adi \t" + yazarAdi + "\nFiyat \t\t" + kitapFiyati
				+ "\nKitap No \t" + kitapNo + "\n";
	}

}
