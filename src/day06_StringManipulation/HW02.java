package day06_StringManipulation;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		/* Problem Tanýmý :
        Basit 4 iþlem yapan bir hesap makinesi methodu kodlayýnýz....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinýz.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirýnýz.
        */
		System.out.println("**** HESAP MAKÝNESÝ ****");
		Scanner scan = new Scanner (System.in);
		System.out.print("1.sayýyý giriniz: ");
		double sayi1=scan.nextDouble();
		System.out.print("2.sayýyý giriniz: ");
		double sayi2 = scan.nextDouble();
		System.out.println("LÜTFEN YAPMAK ÝSTEDÝÐÝNÝZ ÝÞLEMÝ SEMBOLUNU GÝRÝNÝZ:\n+ TOPLAMA \n- ÇIKARMA \n* ÇARPMA \n/ BÖLME ");
		char sembol = scan.next().charAt(0);
		double sonuc;
		if (sembol =='+') {
			sonuc= sayi1+sayi2;
			System.out.print(sonuc);
		}else if(sembol =='-') {
			sonuc= sayi1-sayi2;
			System.out.print(sonuc);
		}else if(sembol =='*') {
			sonuc= sayi1*sayi2;
			System.out.print(sonuc);
		}else if(sembol =='/') {
			
			if (sayi2 == 0) {
				System.out.println("SIFIRA BÖLME ÝÞLEMÝ GEÇERSÝZDÝR.");
			}else {
				sonuc= sayi1/sayi2;
				System.out.print(sonuc);
			}
		}else {
			System.out.println("LÜTFEN GEÇERLÝ BÝR ÝÞLEM GÝRÝNÝZ.");
		}
		
		
		
		
		
	}

}
