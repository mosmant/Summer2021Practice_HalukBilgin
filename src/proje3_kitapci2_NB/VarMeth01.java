package proje3_kitapci2_NB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VarMeth01 {
	
	static List<Integer>kitapNo=new ArrayList();
	static List<String>kitapAdi=new ArrayList();
	static List<String>yazarAdi=new ArrayList();
	static List<Integer>kitapFiyati=new ArrayList();
	int sayac=1004;
	String cevap;
	
	static {
		kitapNo.addAll(Arrays.asList(1001,1002,1003));
		kitapAdi.addAll(Arrays.asList("Çalýkuþu","Sinekli Bakkal","þeker portakalý"));
		yazarAdi.addAll(Arrays.asList("Reþat Nuri Güntekin","Halide Edip Adývar","Vasconcelos"));
		kitapFiyati.addAll(Arrays.asList(15,15,25));
	}
	
	public String kitapEkle() {
		String kitap;
		String yazar;
		int fiyat;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\n  KITAP EKLEME\n===================\n");
		do {
		System.out.println("kitap adý giriniz :");
		kitap=scan.nextLine();
		scan.nextLine();
		
		
		kitapAdi.add(kitap);
		System.out.println("kitap yazari giriniz :");
		yazar=scan.nextLine();
		yazarAdi.add(yazar);
		System.out.println("kitap fiyati giriniz :");
		fiyat=scan.nextInt();
		kitapFiyati.add(fiyat);
		kitapNo.add(sayac++);
		
		System.out.println("------------------------------------");
		System.out.println(sayac+"\t"+kitap+"\t"+yazar+"\t"+fiyat);
		System.out.println("------------------------------------");
		System.out.println("kitabýnýz baþarýlý bir þekilde eklenmiþtir. Baþka kitap eklemek ister misiniz: (E/H)");
		cevap=scan.next();
		}
		while (cevap.equalsIgnoreCase("e"));
		System.out.println("anamenu için bir tuþa basýn");
		
		return scan.next();
	}

	
	public String noIleKitapGoruntule() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("-------------------------------------------------");
		do {
		System.out.println("goruntulemek istediðiniz kitabýn numarasýný giriniz");
		int no=scan.nextInt();
		System.out.println("-----------------------------------------------------");
		for (int i=0; i<kitapNo.size(); i++)
		{
			if (no==kitapNo.get(i)){
				System.out.println(kitapNo.get(i) +"\t"+ kitapAdi.get(i) +"\t"+ yazarAdi.get(i)+"\t"+kitapFiyati.get(i));
			}
		}
		System.out.println("Baþka kitap goruntulemek ister misiniz(E/H)");
		cevap=scan.next();
	}
	while (cevap.equalsIgnoreCase("e"));
	System.out.println("anamenu için bir tuþa basýn");
		
		return scan.next();
	}
	
	public String bilgiIleGoruntule() {
		Scanner scan=new Scanner(System.in);
		do {
			
		System.out.println("Hangi bilgi ile aramak istiyorsunuz");
		String bilgi=scan.nextLine();
		int flag=0;
		for (int i=0; i<kitapNo.size(); i++)
		{
			if (kitapAdi.get(i).contains(bilgi)||yazarAdi.get(i).contains(bilgi)) {
				System.out.println(kitapNo.get(i) +"\t"+ kitapAdi.get(i) +"\t"+ yazarAdi.get(i)+"\t"+kitapFiyati.get(i));
				flag=1;
			}
		}
		if (flag==1) {
			System.out.println("aradýðýnýz bilgileri içeren kayýtlar listelendi");
		}else
		{
			System.out.println("arama kriterinize uygun kayýt bulunamadý");
		}
		
		System.out.println("baþka arama yapmak istiyor musunz(E/H)");
		cevap=scan.next();
	}
	while (cevap.equalsIgnoreCase("e"));
	System.out.println("anamenu için bir tuþa basýn");
		
		return scan.next();
	}
	
	
	public void kitapListele() {
		Scanner scan=new Scanner(System.in);
		System.out.println("KITAPNO\tKITAP ADI\t\tYAZAR ADI\t\tFIYAT");
		System.out.println("=========================================================");
		for (int i=0; i<kitapNo.size(); i++) {
			
			System.out.println(kitapNo.get(i) +"\t"+ kitapAdi.get(i) +"\t\t"+ yazarAdi.get(i)+"\t\t"+kitapFiyati.get(i));
		}
		
		
	}
	
	public String kitapSilme() {
		Scanner scan=new Scanner(System.in);
		do {
			
		int i=0;
		System.out.println("Silmek istediðiniz kitap no girin");
		int silinecekNo=scan.nextInt();
		for ( i=0;i<kitapNo.size();i++)
		{
			if (silinecekNo==kitapNo.get(i)) {
				break;
			}
		}
		
		kitapNo.remove(i);
		kitapAdi.remove(i);
		yazarAdi.remove(i);
		kitapFiyati.remove(i);
	
	
		System.out.println("silmek istediðiniz baþka kitap var mý?(E/H)");
		cevap=scan.next();
	}
	while (cevap.equalsIgnoreCase("e"));
	System.out.println("anamenu için bir tuþa basýn");
		
		return scan.next();
		
	}
	

}