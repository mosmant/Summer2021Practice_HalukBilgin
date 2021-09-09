package proje6_depo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Met01 extends V01{
	Scanner scan = new Scanner (System.in);
	
	List<V01> urun = new ArrayList<>();
	//HashMap< Integer,String> urunmap= new HashMap<>();
	
	String secim;
	int count=100;
	
	
	//====================================================================================
	public List<V01> urunTanimlama(){
		System.out.println("====URUN TANIMLAMA====");
		do {
			scan.nextLine();
			System.out.print("ÜRÜN ÝSMÝ : ");
			String name = scan.nextLine();
			super.setUrunAdi(name);			
						
			System.out.print("ÜRETÝCÝ ÝSMÝ : ");
			String producer=scan.nextLine();
			super.setUretici(producer);
			
			System.out.print("BÝRÝM : ");
			String unit = scan.next();
			super.setBirim(unit);
			super.setId(count++);
			V01 objv =new V01(super.getId(), super.getUrunAdi(), super.getUretici(), super.getMiktar(), super.getBirim(), super.getRaf());
			urun.add(objv);
			
			
			System.out.println("------------------------------------");
			System.out.println(objv.getId()+"\t"+objv.getUrunAdi()+"\t"+objv.getUretici()
								+"\t"+objv.getMiktar()+"\t"+objv.getBirim()+"\t"+objv.getRaf());
			System.out.println("------------------------------------");
			System.out.println("ÜRÜNÜNÜZ BAÞARILI BÝR ÞEKÝLDE EKLENMÝÞTÝR. BAÞKA BÝR ÜRÜN EKLEMEK ÝSTER MÝSÝNÝZ? (E/H)");
			secim=scan.next();	
			
			
			
		} while (secim.equalsIgnoreCase("E"));
		System.out.println("ANA MENUYE YÖNLENDÝRÝLÝYORSUNUZ.");
		return urun;
		
	}
	//====================================================================================
	public void urunListele() {
		System.out.println("====URUN LÝSTESÝ====");
		for (V01 each : urun) {
			System.out.println(each.getId()+"\t"+each.getUrunAdi()+"\t"+each.getUretici()
		+"\t"+each.getMiktar()+"\t"+each.getBirim()+"\t"+each.getRaf());
			
			
		}
	}
	//====================================================================================
	public List<V01> urunGirisi() {
		urunListele();
		System.out.println("====URUN GÝRÝÞ EKRANI====");
		
		System.out.println("URUN ID : ");
		int urunNo= scan.nextInt();
		System.out.println("URUN MÝKTARI : ");
		int urunmiktarý= scan.nextInt();
		
		for (V01 each : urun) {
			if (each.getId()==urunNo) {
				each.setMiktar(each.getMiktar()+urunmiktarý);
			}
		}
		
		return urun;
		
		
		
	}
	//====================================================================================
	public void urunuRafaKoy() {
		urunListele();
		System.out.println("====URUN RAF GÝRÝÞ EKRANI====");
		System.out.println("URUN ID : ");
		int urunNo= scan.nextInt();
		System.out.println("URUN RAFI : ");
		String urunrafi= scan.next();
		
		for (V01 each : urun) {
			if (each.getId()==urunNo) {
				each.setRaf(urunrafi);
				
			}
		}
		
	}
	//====================================================================================
	public void urunCikisi() {urunListele();
	System.out.println("====URUN ÇIKIÞ EKRANI====");
	
	System.out.println("URUN ID : ");
	int urunNo= scan.nextInt();
	System.out.println("URUN MÝKTARI : ");
	int urunmiktarý= scan.nextInt();
	
	for (V01 each : urun) {
		if (each.getId()==urunNo) {			
			if (each.getMiktar()>0 && urunmiktarý<=each.getMiktar()) {
				each.setMiktar(each.getMiktar()-urunmiktarý);
			}
		}
	}
		
		
	}
	//====================================================================================
}
