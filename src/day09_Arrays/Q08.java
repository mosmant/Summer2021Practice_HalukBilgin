package day09_Arrays;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {

		/*
		 * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun, 
		 * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 * 
		 */

		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		
		String arr[] = str.split(" ");// stringi boþluklara göre ayýrdým.
		System.out.println(Arrays.toString(arr));
		
		int usdToplam=0;
		int eurToplam=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].contains("$")) {
				usdToplam= usdToplam + Integer.parseInt(arr[i].replace("$", ""));
				
			}else {
				eurToplam= eurToplam + Integer.parseInt(arr[i].replace("£", ""));
			}
			
		}
		System.out.println("USD TOPLAM : "+usdToplam);  // 191
		System.out.println("EUR TOPLAM : "+eurToplam);  // 143
	}

}
