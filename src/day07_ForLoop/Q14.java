package day07_ForLoop;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Girilen bir sayý kadar satýr ve sütünu olan ve
        sað kenara dayalý üçgeni basan kodu yazýnýz.
        Ekran Çýktýsý
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
		
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayý giriniz : ");
        int sayi = scan.nextInt();

        for (int satir = 1; satir <= sayi; satir++) {//satýr kontrolu
            for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {//bosluk kontrolu
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir; yildiz++) {//yýldýz kontrolu
                System.out.print("*");

            }
            System.out.println();
        }
         
        
        /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    þeklini yazdýrýnýz
             */

        for (int satir = 1; satir <= sayi; satir++) {//satýr kontrolu

            for (int yildiz = 1; yildiz <= satir; yildiz++) {//yýldýz kontrolu
                System.out.print("*");

            }
            System.out.println();
        }

	}

}
