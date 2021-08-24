package day03_IfStatement;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
        Kulanýcýdan aracýnýn hýzýný alýnýz
        Trafik cezasýnýn deðerini hesaplayýn.
            45 hýz sýnýrýdýr.
            Eðer hýzýnýz 55-74 arasýnda ise:
            Ceza 100 $'dýr.
            Eðer hýzýnýz 75 - 84 arasýnda ise:
            Ceza 150 $'dýr.
            Eðer hýzýnýz 85 -94 arasýnda ise:
            Ceza 320 $'dýr.
            Eðer hýzýnýz 94'den daha fazla ise:
            Ceza 500 $'dýr.
            ve ayrýca,
            Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hýzýnýz 77 iken cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hýzýnýz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = true;
            sonuç 320 olmalýdýr.
            currentSpeed(Hýzýnýz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = false;
            sonuç 300 olmalýdýr.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 , yoksa 0 yazýnýz : ");

        int ehliyet = scan.nextInt();

        System.out.print("Hýzýnýzý giriniz : ");

        int hýz = scan.nextInt();

        if (ehliyet == 1) {
            if (hýz < 0) {
                System.out.println("hatalý veri girdiniz");
            } else if (hýz > 54 && hýz < 75) {
                System.out.println("Ceza 100 $'dýr.");
            } else if (hýz >= 75 && hýz < 85) {
                System.out.println("Ceza 150 $'dýr.");
            } else if (hýz >= 85 && hýz < 95) {
                System.out.println("Ceza 320 $'dýr.");
            } else if (hýz >= 95) {
                System.out.println("Ceza 500 $'dýr.");
            } else {
                System.out.println("Hýz Sýnýrýnda seyahat ediyorsunuz hayýrlý yolculuklar.. ");
            }
        } else if (ehliyet == 0) {
            if (hýz > 54 && hýz < 75) {
                System.out.println("Ceza 300 $'dýr.");
            } else if (hýz >= 75 && hýz < 85) {
                System.out.println("Ceza 350 $'dýr.");
            } else if (hýz >= 85 && hýz < 95) {
                System.out.println("Ceza 520 $'dýr.");
            } else if (hýz >= 95) {
                System.out.println("Ceza 700 $'dýr.");
            } else {
                System.out.println("Sadece Ehliyetsiz kullanýmdan dolayý cezanýz  200 $'dýr. ");
            }
        } else {
            System.out.println("Lütfen Geçerli Bir deðer Giriniz!");
        }
        scan.close();

	}

}
