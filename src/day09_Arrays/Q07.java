package day09_Arrays;

import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * write a method that accepts a 2 dimensional array and finds the max value
		 * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
		 * Input : {{1,24,3},{45,5},{62,7,76}} 
		 * Output : 76 
		 */
	
		int arr [][]= {{1,24,3},{45,5},{62,7,76}};
		int uzunluk=0;
		
		for (int i = 0; i < arr.length; i++) {
			uzunluk+=arr[i].length;
			
		}
		int arr1[]= new int [uzunluk]; // burada yeni array oluþturdum.
		// bu arrayi oluþturma sebebim yukarýdaki MD arraydaki tüm elemanlarý bu arrayin içine tanýmlayacaðým.
		// peki oluþturacaðým arrayin uzunluðunu nasýl bulacaðým onu da aþaðýdaki for döngüsü ile elde edeceðim.
		
		int count=0; // döngü her eleman için döndüðünde arr1[] indexi bir artacak
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[count]=arr[i][j];  // burada tüm indexleri arr arrayindeki gibi sýrasýyla aldýk.
				count++;
			}
		}
		Arrays.sort(arr1);	// burada arr1 dizisini küçükten büyüðe doðru sýraladýk
		System.out.println(Arrays.toString(arr1));
		System.out.println("\"arr\"nin en büyük elemaný : "+ arr1[arr1.length-1]); // burada son ve enbüyük elemaný yazdýrdýk
		
	
	}

}
