package day03_IfStatement;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Kullanýcýdan üç adet sayý alarak bu sayýlarýn
        bir dik üçgenin kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
        (Yardým: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor
        baðlantýsýndan yararlanabilirsiniz)
        Örnek Ekran Çýktýsý
        birinci kenarý giriniz: 2
        ikinci kenarý giriniz 15
        üçüncü kenarý giriniz: 7
        Bu bir dik üçgen deðildir.
        Bu bir dik üçgendir
     */

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Birinci sayýyý giriniz: ");
        a = scanner.nextInt();

        System.out.print("Ýkinci sayýyý giriniz: ");
        b = scanner.nextInt();

        System.out.print("Üçüncü sayýyý giriniz: ");
        c = scanner.nextInt();

        if ((a * a) + (b * b) == c * c) {
            System.out.println("Bu bir dik üçgendir.");
        } else if ((a * a) + (c * c) == b * b) {
            System.out.println("Bu bir dik üçgendir.");
        } else if ((b * b) + (c * c) == a * a) {
            System.out.println("Bu bir dik üçgendir.");
        } else {
            System.out.println("Bu üçgen bir dik üçgen deðildir.");
        }
        scanner.close();

	}

}
