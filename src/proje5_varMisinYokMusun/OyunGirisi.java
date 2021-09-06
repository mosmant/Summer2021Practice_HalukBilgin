package proje5_varMisinYokMusun;

import proje5_varMisinYokMusun.Kutu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunGirisi {
	
	/*
	 1. Ad?m -->  10 farkl? kutu olsun ve bu kutular farkl? miktarlarda para i?ersin. 
	 				paraListesi isminde bir listte bunlar? tutal?m...
	 				
	 2. Ad?m --> 10 tane kutu olu?turaca??m. bu kutular?n i?erisine listte olu?turdu?um para miktarlar?n? 
	 			rastgele bir ?ekilde atayaca??m. Kutu isminde bir class olu?tural?m. Olu?turdu?umuz bu classta
	 			kutuNumarasi ve paraMiktari ad?nda iki int tipinde de?i?ken olmal?
	 			
	 3. Ad?m  --> yeni bir class olu?tural?m. Kutular ismini verelim. kullanaca??m?z methodlar? burada olu?tural?m.
	 
	 
	 4. Ad?m --> oyunu ba?latal?m, kullan?c?dan se?mek istedi?i kutu numaras?n? alal?m, se?ilen kutuyu var olan
	 kutular?n i?erisnden kald?rmam?z gerek...
	 
	 		public void kutuEkle(Kutu kutu)
	 		public void kutuActir(int kutuNumarasi)
	 		public int kalanKutuSayisi()
	 		public int kutulardakiToplamParaMiktari()
	 		public void secilenKutuyuKutularListesindenKald?r()
	 		public void yapimcininTeklifiniAl()
	 		public String acilmamisKutular?Goster()	
	 		public void kaybedilenTutarlar()	
	 			 		 
	 
	 */
	
	static List<Integer>paraListesi=new ArrayList<>();
	static Kutular kutular=new Kutular();
	static Scanner scan=new Scanner(System.in);
	
	static int kutuNumaram;
	static int paraMiktarim;

	public static void main(String[] args) {
		
		paraListesi.addAll(Arrays.asList(1,10,500,1000,5000,10000,50000,100000,250000,500000));
		Collections.shuffle(paraListesi);   // belirtilen listteki elemanlar?n yerini rastgele de?i?tirir.
		
		for (int i=0; i<10; i++) {    // 0 1 2 3 4 5 6 7 8 9 
			
			int kutuNo=i+1;			//   1 2 3 4 5 6 7 8 9 10
			Kutu kutu=new Kutu(kutuNo,paraListesi.get(i));
			kutular.kutuEkle(kutu);	
			
		}
				
		System.out.println("oyunumuza ho?geldiniz\nL?tfen bir kutu se?in");
		kutuNumaram=scan.nextInt();
		paraMiktarim=paraListesi.get(kutuNumaram-1);
		
		kutular.secilenKutuyuKutularListesindenKaldir(kutuNumaram);
		kutuSecmeActirma();
		
		}
	
	 	static  public void kutuSecmeActirma() {
		  
		  System.out.println("kalan kutular : "+ kutular.acilmamisKutulariGoster());
		  System.out.println("hangi kutuyu a?mak istersiniz.");
		  int secim=scan.nextInt();
		  kutular.kutuActir(secim);
		  
		  if(kutular.kalanKutuSayisi()==7||kutular.kalanKutuSayisi()==4||kutular.kalanKutuSayisi()==1) {
			  System.out.println("Teklifimiz : " + kutular.yapimcininTeklifiniAl(paraMiktarim));
			  System.out.println("teklifi kabul ediyor musun(1-Evet 2-Hay?r");
			  int yanit=scan.nextInt();
			  if (yanit==1) {
			  System.out.println("oyun bitti");
			  System.out.println("kazan?lan miktar= "+kutular.yapimcininTeklifiniAl(paraMiktarim));
			  System.out.println("kendi kutunuzdaki miktar: " +paraMiktarim);
			  }else {
				  kutuSecmeActirma();
			  }
			  
		  }else {
			  
			  if (kutular.kalanKutuSayisi()>0) {
			  kutuSecmeActirma();
			  }
			  else {
				  System.out.println("oyun bitti");
				  System.out.println("kutunuzdak? miktar : "+paraMiktarim);
			  }
		  }
		  
			
			
		
		}

}