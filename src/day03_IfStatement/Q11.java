package day03_IfStatement;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Kullanýcýdan bir tarihi gün, ay ve yýl þeklinde alýp bu tarihi
        ay, gün, yýl ve yýl, ay, gün sýralarýna çevirerek yazan bir kod yazýnýz.
        ipucu: her else komutundan sonra return; komutu kullanýnýz...
        Örnek Ekran Çýktýsý
        Lütfen günü giriniz: 10
        Lütfen ayý giriniz: 02
        Lütfen yýlý giriniz: 2009
        Gün ay yýl: 10.02.2009
        Ay gün yýl: 02.10.2009
        Yýl ay gün: 2009.02.10
        */

        Scanner scanner = new Scanner(System.in);

        int gun;
        int ay;
        int yil;

        System.out.println("Tarihi gün,ay,yýl olarak istenen þekliyle giriniz... ");

        System.out.print("Gün: ");
        gun = scanner.nextInt();

        if (gun > 0 && gun <= 31) {
            System.out.println(gun);

        } else {
            System.out.println("Yanlýþ giriþ yaptýnýz.Program sonlanýyor...");
           
          
        }


        System.out.print("Ay: ");
        ay = scanner.nextInt();

        if (ay > 0 && ay <= 12) {
            System.out.println(ay);

        } else {
            System.out.println("Yanlýþ giriþ yaptýnýz.Program sonlanýyor...");
           // return;
        }

        System.out.print("Yýl: ");
        yil = scanner.nextInt();

        if (yil > 0) {
            System.out.println(yil);

        } else {
            System.out.println("Yanlýþ giriþ yaptýnýz.Program sonlanýyor...");
           // return;
        }

        System.out.println("Ay/Gün/Yýl : " + ay + "/" + gun + "/" + yil);
        System.out.println("Yýl/Ay/Gün : " + yil + "/" + ay + "/" + gun);
        
        scanner.close();
	}
	

}
