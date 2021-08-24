package day06_StringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		 /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         * 
         * input : ali 
         * output: girdiðiniz kelime 3 harfli ve unique karaktere sahip
         * 
         * input : ece
         * output: girdiðiniz kelime 3 harfli ve unique karaktere sahip deðil
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("adýnýzý giriniz : ");
        String name=scan.nextLine();//eda
        
        char c1=name.charAt(0);//e
        char c2=name.charAt(1);//d
        char c3=name.charAt(2);//a
        
        // ternary ile soru çözdü. ÖNCE KELÝME UZUNLUÐU 3 MÜ DÝYE SORDU. ARDINDAN TRUE KISMINA HARFLER AYNI MI DÝYE CHAR OLARAK SORDU.
        // TRUE'YA  NESTED TERNARY UYGULADI SORDUÐU SORU ÝSE ÞU KELÝMEDE AYNI HARFTEN BAÞKA BÝR KARAKTER VAR MI.
        
        String result=name.length() == 3 ?((c1!=c2 && c1!=c3 && c2!=c3)? "girdiginiz isim unique karakterlerden olusuyor ":"girdiginiz isim unique karakterlerden olusmuyor " ):"3 karakterden farklý isim girdiniz";
        
       System.out.println(result);
       scan.close();
	}

}
