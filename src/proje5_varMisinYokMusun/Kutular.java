package proje5_varMisinYokMusun;

import java.util.ArrayList;
import java.util.List;

public class Kutular {
	
	/*
	 		--public void kutuEkle(Kutu kutu)
	 		--public void kutuActir(int kutuNumarasi)
	 		--public int kalanKutuSayisi()
	 		--public int kutulardakiToplamParaMiktari()
	 		--public void secilenKutuyuKutularListesindenKald�r(int kutuNumarasi)
	 		--public void yapimcininTeklifiniAl()
	 		--public String acilmamisKutular�Goster()	
	 		--public void kaybedilenTutarlar()	
	 */
	
	
	List<Kutu> kutuListesi=new ArrayList<>();  // data type classtan al�yor
	
	// datatype Kutu dedik ��nk� Kutu class�ndan olu�turdu�umuz nesneye 2 bilgi atad�k
	
	public void kutuEkle(Kutu kutu) {
		
		kutuListesi.add(kutu);
	}
	
	public void kutuActir(int kutuNumarasi) {
		
		for (Kutu k : kutuListesi) {
			
			if (kutuNumarasi==k.getKutuNumarasi()) {
				System.out.println("kutudaki miktar = "+k.getParaMiktari());
				kutuListesi.remove(k);
				break;
			}
			
		}
	}
	
	public int kalanKutuSayisi() {
		
		return kutuListesi.size();	
		
	}
	
	public int kutulardakiToplamParaMiktari() {
		int toplamPara=0;
		for (Kutu k : kutuListesi) {
			
			toplamPara+=k.getParaMiktari();		//toplamPara=toplamPara+k.getParaMiktari();	
			
		}
		return toplamPara;		
		
	}
	
	public void secilenKutuyuKutularListesindenKaldir(int kutuNumarasi) {
		
		for (Kutu k : kutuListesi) {
			
			if (kutuNumarasi==k.getKutuNumarasi()) {
				
				kutuListesi.remove(k);
				break;
				
			}
			
		}	
		
		
	}
	
	public int yapimcininTeklifiniAl(int oyuncununKendiKutusundakiMiktar) {
		
		int teklif=(kutulardakiToplamParaMiktari()+oyuncununKendiKutusundakiMiktar)/2;
		return teklif;
	}
	
	public String acilmamisKutulariGoster()	
	{
		String acilmamisKutular="";
		for (Kutu k : kutuListesi) {
			
			acilmamisKutular=acilmamisKutular+" "+k.getKutuNumarasi();
			
		}
		return acilmamisKutular;
	}
	
	
	

}