package day09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
	// kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki
	// farki gosteren
	// java programi yazin
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Kac elemanli bir array olusturmak istiyorsunuz? ");
		int size = scan.nextInt();
		int arr[]= new int[size]; 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Dizinin "+i+ ". indexinin deðerini giriniz : ");
			arr[i]= scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Dizinin en büyük ve en küçük eleman arasýndaki fark : "+ (arr[arr.length-1]-arr[0]));
		
	}

}
