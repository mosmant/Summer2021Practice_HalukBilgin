package proje6_depo;

import java.util.Scanner;

public class Runner {
	/*
	 * basit bir depo projesi
	 * 
	 * çalýþan bir fabrikada uygulanan bir sistem olan depo uygulamasýdýr.
	 * 
	 * 1-) burada öncelikle ürünün tanýmlamasý  yapýlýr. id urunIsmi uretici miktar birim ve raf (6 adet fields mevcut)
	 * 
	 * 2-) methodlar oluþturacaðýz.
	 * 		urunTanimlama 	==> burda ürünün ismi üreticisi ve birimi girilecek. id count yapýlarak alýnacak.
	 * 		
	 * 		urunListele 	==> tanýmlanan ürünler listelenecek. foreack kullanarak ürünleri listeleyebiliriz.
	 * 		*** burada ürünün adeti ve raf numarasý tanýmlama yapýlmadýysa default deðer görünsün.
	 * 		
	 * 		urunGirisi 		==> burada listelenen urunlere bakacaðýz. giriþ yapmak istediðimiz ürünün id numarasýný gireceðiz. 
	 * 		giriþ yapmak istediðimiz ürünün id numarasýný girdikten sonra ne kadar giriþ yapmak istediðimizi yazacaðýz. 
	 * 		id numarasýndaki tüm deðiþikliði yazýdracaðýz. 
	 * 		
	 * 		urunuRafaKoy 	==> listeden ürünü seçeceðiz ve id numarasýna göre ürünü rafa koyacaðýz.
	 * 
	 *		urunCikisi 		==> listeden ürünü seçeceðiz ve ürünün çýkýþý yapcaðýz. burada ürün listesinden sadece miktarda deðiþiklik yapýlacak.
	 *							ürün adedi 0dan az olamaz. 0 olunca ürün tanýmlamasý silinmesin. sadece miktarý 0 olsun. 
	 * 		===> yaptýðýmýz tüm deðiþiklikler listede de görünsün. 
	 * 
	 * 
	 * 			id		ismi 	üreticisi	miktarý		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		ör: 1000	 un 	hekimoglu	0 			çuval 		null
	 * 
	 * 		urunGirisi		==> id:1000  ürün giriþi :5
	 * 		urunListele 	==>
	 * 		
	 * 			id		ismi 	üreticisi	miktarý		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		ör: 1000	 un 	hekimoglu	5 			çuval 		null
	 * 
	 * 		urunuRafaKoy 	==> id:1000 raf : raf1
	 * 		urunListele 	==>
	 * 			id		ismi 	üreticisi	miktarý		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		ör: 1000	 un 	hekimoglu	5 			çuval 		raf1
	 * 
	 * 		urunCikisi 		==> id 1000: ürün çýkýþý : 3 (kalan 2 çuval un)
	 * 		urunListele 	==>
	 * 			id		ismi 	üreticisi	miktarý		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		ör: 1000	 un 	hekimoglu	2 			çuval 		raf1
	 * 
	 * 
	 */
	
	public static int secenek;
	public static void main(String[] args) {
		
		Met01 objm = new Met01();
		
		
		do {
			menu();
			switch (secenek) {
			case 1:
				objm.urunTanimlama();
				break;
			case 2:
				objm.urunListele();
				break;
			case 3:
				objm.urunGirisi();	
				break;
			case 4:
				objm.urunuRafaKoy();	
				break;
			case 5:
				objm.urunCikisi();	
				break;			
			}
			
		} while (secenek!=6);
		System.out.println("ÝYÝ GÜNLER DÝLERÝZ.");
		

	}

	private static void menu() {		
		System.out.println(
				  "+===== MAIN MENU====+\r\n"
				+ "|1: ÜRÜN EKLE       |\r\n"
				+ "|2: ÜRÜNLERÝ LÝSTELE|\r\n"
				+ "|3: ÜRÜN GÝRÝÞÝ     |\r\n"
				+ "|4: RAF GÝRÝÞÝ      |\r\n"
				+ "|5: ÜRÜN ÇIKIÞ      |\r\n"
				+ "|6: ÇIKIÞ           |\r\n"
				+ "+-------------------+");
		System.out.println("LÜTFEN YAPMAK ÝSTEDÝÐÝNÝZ ÝÞLEMÝ SEÇÝNÝZ?");
		Scanner scan = new Scanner (System.in);
		secenek=scan.nextInt();
	}

}
