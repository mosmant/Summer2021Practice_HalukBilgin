package day03_IfStatement;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		//// Kullanýcýdan aldýðýnýz koordinat noktasýnýn hangi bölgede olduðunu yazdýran bir kod yazýnýz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  X ve Y   deðerlerini giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Girdiðiniz nokta 1. bölgede");
        } else if (x < 0 && y > 0) {
            System.out.println("Girdiðiniz nokta 2. bölgede");
        } else if (x < 0 && y < 0) {
            System.out.println("Girdiðiniz nokta 3. bölgede");
        } else if (x > 0 && y < 0) {
            System.out.println("Girdiðiniz nokta 4. bölgede");
        } else if (x == 0 && y!=0) {
            System.out.println("Girdiðiniz nokta Y ekseni üzerindedir");
        } else if (y == 0 && x!=0) {
            System.out.println("Girdiðiniz nokta X ekseni üzerindedir");
        }else {
            System.out.println("Orijin noktasýný girdiniz");
        }scan.close();
	}

}
