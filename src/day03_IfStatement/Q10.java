package day03_IfStatement;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
        Kulan�c�dan arac�n�n h�z�n� al�n�z
        Trafik cezas�n�n de�erini hesaplay�n.
            45 h�z s�n�r�d�r.
            E�er h�z�n�z 55-74 aras�nda ise:
            Ceza 100 $'d�r.
            E�er h�z�n�z 75 - 84 aras�nda ise:
            Ceza 150 $'d�r.
            E�er h�z�n�z 85 -94 aras�nda ise:
            Ceza 320 $'d�r.
            E�er h�z�n�z 94'den daha fazla ise:
            Ceza 500 $'d�r.
            ve ayr�ca,
            E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.
            �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            �rn;
            currentSpeed(H�z�n�z) 87
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = true;
            sonu� 320 olmal�d�r.
            currentSpeed(H�z�n�z) 65
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = false;
            sonu� 300 olmal�d�r.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 , yoksa 0 yaz�n�z : ");

        int ehliyet = scan.nextInt();

        System.out.print("H�z�n�z� giriniz : ");

        int hiz = scan.nextInt();

        if (ehliyet == 1) {
            if (hiz < 0) {
                System.out.println("hatal� veri girdiniz");
            } else if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 100 $'d�r.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 150 $'d�r.");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("Ceza 320 $'d�r.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 500 $'d�r.");
            } else {
                System.out.println("H�z S�n�r�nda seyahat ediyorsunuz hay�rl� yolculuklar.. ");
            }
        } else if (ehliyet == 0) {
            if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 300 $'d�r.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 350 $'d�r.");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("Ceza 520 $'d�r.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 700 $'d�r.");
            } else {
                System.out.println("Sadece Ehliyetsiz kullan�mdan dolay� cezan�z  200 $'d�r. ");
            }
        } else {
            System.out.println("L�tfen Ge�erli Bir de�er Giriniz!");
        }
        scan.close();

	}

}
