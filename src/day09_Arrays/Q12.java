package day09_Arrays;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		// Aþaðýdaki multi dimensional array’in iç array’lerindeki tum elemanlarýn 
		// toplamýný birer birer bulan ve herbir sonucu yeni bir array’in elemaný yapan
		// ve yeni array’i ekrana yazdýran bir program yazýnýz  
		// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
			
		int arr[][] = { {1,2,3}, {4,5,11}, {6,7}, {8, 9, 10}};
		
		int arr1 [] = new int [arr.length];
		
		int sum = 0;  // toplamlarý yazdýrmak için bir variable oluþturdum 
		for (int i = 0; i < arr.length; i++) {  // MD arrayin elemanlarýný bulmak için for döngüsü yaptým
			for (int j = 0; j < arr[i].length; j++) { // inner array elemanlarýný alacaðým.
				sum+=arr[i][j]; // inner arraylarýn toplamýný variable a atadým.
			}
			arr1[i]= sum; // arrayin indexlerine toplam deðiþkenimi atadým.
			// böylece indexlerime arrnin inner arraylarýn elementler toplamýný artamýþ oldum.
			sum=0; // burada toplamý sýfýrladým ki outer arrayda toplma variable im sýfýrlansýn arr 1 arrayinin yeni index toplamýný bulayým .
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}
