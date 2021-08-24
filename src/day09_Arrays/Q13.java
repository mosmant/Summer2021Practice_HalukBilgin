package day09_Arrays;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		
		int [] arr = new int [8];
		Scanner scan = new Scanner (System.in);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Lütfen "+ i + " indexinin deðerini giriniz : " );
			arr[i]= scan.nextInt();
			
			if (arr[i]%3 ==0) {
				count++;
			}
			
		}
		System.out.println("Bu dizide 3'e tam bölünebilen "+ count +" sayý vardýr." );
		
			
		}
		
		
	}


