package day09_Arrays;

import java.util.Arrays;

public class Q02 {
	public static void main(String[] args) {

		// multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
		// birer bulan
		// ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
		// yazdıran programı yaziniz.
		// input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

		int arr[][] = { { 10, 20, 30 }, { 4 }, { 6, 7, 20 } };
		
		int sonuc[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sonuc[i]+=arr[i][j];
				
			}
			
		}System.out.println(Arrays.toString(sonuc));

	}
}
