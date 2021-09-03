package day12_maps;

import java.util.HashMap;

public class Q2 {
	public static void main(String[] args) {
		// Ad ve soyad bulunduruan iki ayrý array'i ad=soyad seklinde yazdýrýnýz.
		// input : {"ahmet", "ahmet can", "haluk"}; {"þeref", "erdem", "bilgin"};
		// output : {ahmet=þeref, ahmet can=erdem, haluk=bilgin};

		String ad[] = { "ahmet", "ahmet can", "haluk" };
		String soyad[] = { "þeref", "erdem", "bilgin" };
		
		HashMap<String, String> adSoyad = new HashMap<>();
		
		for (int i = 0; i < ad.length; i++) {
			adSoyad.put(ad[i], soyad[i]);
		}
		
		System.out.println("adSoyad = " + adSoyad);// adSoyad = {ahmet=þeref, ahmet can=erdem, haluk=bilgin}
	
	}
}