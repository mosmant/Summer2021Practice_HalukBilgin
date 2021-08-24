package day10_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		//		2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
		//		listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
		//		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
		//		Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]

		String isim[][] = { { "Ali", "Veli", "Ayse" }, { "Hasan", "Can" }, { "Suzan" } };
		
		/*
		 * "Ali", "Veli", "Ayse" -->0. kat "Hasan", "Can" -->1.kat "Suzan" -->.kat
		 * 
		 */
		
		yeniList(isim);
	}

	public static void yeniList(String str[][]) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {// katlara girii için kat kontrolu yapýldo
			for (int j = 0; j < str[i].length; j++) {// her kattaki daireye giriþ için daire kontrolu yapýldý.
																	
				list.add(str[i][j]);// girdiðimiz her katýn her dairesini list içine attýk

			}

		}
		System.out.println("sýralamada önceki list: " + list);
		Collections.sort(list);// list'i naturel order'egöre harf sýrasýný yaptýrdýk.
		System.out.println("listin sýralanmmýþ hali:" + list);
	}

}
