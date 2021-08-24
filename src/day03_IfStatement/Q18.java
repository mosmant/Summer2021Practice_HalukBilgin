package day03_IfStatement;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lutfen bir karakter giriniz");
		
		char ch = sc.next().charAt(0);
		
		if (ch >= 'a' && ch<='z') {
			
		System.out.println("Kucuk harf");
			
		}else if (ch>='A' && ch<='Z') {
			System.out.println("Buyuk harf");
		}else {
			System.out.println("Hatali giris yaptiniz.");
		}
		
		
		sc.close();

	}

}
