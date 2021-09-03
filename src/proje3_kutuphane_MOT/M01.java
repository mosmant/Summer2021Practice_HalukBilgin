package proje3_kutuphane_MOT;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M01 {

	public List<C01> tumListe = new ArrayList<>();
	public List<C01> oduncListe = new ArrayList<>();

	public List<C01> ekleme() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen kitapadini giriniz");
		String kitapAdi = scan.nextLine();

		System.out.println("Lütfen kitapnumarasini giriniz");
		String kitapNo = scan.nextLine();

		System.out.println("Lütfen konumu giriniz");
		String konum = scan.nextLine();

		C01 ekle = new C01(kitapAdi, kitapNo, konum, LocalDateTime.now());
		tumListe.add(ekle);

		return tumListe;
	}

	public void listeleme(List<C01> tumListe) {
		for (C01 each : tumListe) {
			System.out.println("Kitap adý : " + each.kitapAdi + " Kitap no : " + each.kitapNo + " Konumu : " + each.konum
					+ " Kayýt zamaný : " + each.girisSaati);
		}

	}

	public List<C01> oduncVerme() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen kitap numarasini giriniz");
		String kitapNo = scan.nextLine();

		System.out.println("Lütfen Ödünç alan kiþi ismini giriniz");
		String isim = scan.nextLine();

		C01 OduncVer = new C01(kitapNo, isim, LocalDateTime.now());

		oduncListe.add(OduncVer);

		return oduncListe;
	}

	public void oduncListeleme(List<C01> oduncListe) {
		for (int i = 0; i < oduncListe.size(); i++) {
			System.out.println((i+1)+" "+oduncListe.get(i).kitapNo +" "+oduncListe.get(i).isim + " "+oduncListe.get(i).cikisSaati );
			
		}	
		
		
	}
				
	

	public List<C01> oduncTeslim() {
		Scanner scan = new Scanner(System.in);
		oduncListeleme(oduncListe);
		System.out.println("yukarýdaki listeden silmek istediðiniz elemanýn numarasýný giriniz");
		String siraNo1 = scan.nextLine();
		int yeniSira= Integer.parseInt(siraNo1);
		
		oduncListe.remove(yeniSira-1);

		return oduncListe;
	}

}
