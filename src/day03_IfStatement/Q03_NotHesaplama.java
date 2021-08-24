package day03_IfStatement;

import java.util.Scanner;

public class Q03_NotHesaplama {

	public static void main(String[] args) {
		/*
        1.Kullanýcýya    "Vize sýnav sonucunuzu giriniz :"
        2.vize notu double deðerinde girilecek.
        3. Kullanýcýya  "Vize sýnavý yüzdesini giriniz". ->> double olmalý ->> 0,40 etkiliyor   !!Yüzde kaç etkilediðini Sisteme siz giriyorsunuz.!!
        4.Kullanýcýya    "Final sýnav sonucunuzu giriniz.
        5. final notu double deðerinde olmalý. (örn: 65,5)
        6.Kullanýcýya    "Final sýnavý yüzdesini giriniz"-->> double olmalý ->> 0,60 etkiliyor.
        7. Vize final ortalamasýný bulmak için, vize nin yüzde40 ý, finalin yüzde60 ý alýnmalý ve çýkan sonuçlar toplanmalýdýr.
        8. Çýkan sonucu (dersin not ortalamasýný)   double toplam  ' a eþitleyebilirsiniz.
                                        todo    Koþul kýsmý
                                        eðer ortalamasý 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasýnda ise  BA,
                                                                        70(70 dahil)   ile 80 arasýnda ise BB,
                                                                        60(60dahil) ile 70 arasýnda ise CB,
                                                                        50(50 dahil) ile 60 arasýnda ise CC,
                                                                     40(40 dahil) ile 50 arasýnda ise DC,
                                                                     30(30 dahil) ile 40 arasýnda ise DD,
                                                                     30 'dan düþük ise FF            gelmeli.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("********NOT HESAPLAMA SÝSTEMÝ********\n");

        System.out.print("Vize sýnav sonucunuzu giriniz : ");
        double vize = sc.nextDouble();

        System.out.print("Vize sýnavý yüzdesini giriniz: ");
        double vize_yuzde = sc.nextDouble();

        System.out.print("Final sýnav sonucunuzu giriniz : ");
        double fin = sc.nextDouble();

        System.out.print("Final sýnavý yüzdesini giriniz: ");
        double fin_yuzde = sc.nextDouble();

        System.out.println("*************************************");

        double ort = vize * (vize_yuzde / 100) + fin * (fin_yuzde / 100);

        System.out.println("Ortalamanýz Sayý ile : " + ort);
        System.out.print("Ortalamanýz Harf ile : ");

        if (ort >= 90) {
            System.out.println("AA aldýnýz...");
        } else if (ort >= 80) {
            System.out.println("BA aldýnýz...");
        } else if (ort >= 70) {
            System.out.println("BB aldýnýz...");
        } else if (ort >= 60) {
            System.out.println("CB aldýnýz...");
        } else if (ort >= 50) {
            System.out.println("CC aldýnýz...");

        } else if (ort >= 40) {
            System.out.println("DC aldýnýz...");
        } else if (ort >= 30) {
            System.out.println("DD aldýnýz...");

        } else {
            System.out.println("FD aldýnýz ve Kaldýnýz...");
        }
        sc.close();

	}

}
