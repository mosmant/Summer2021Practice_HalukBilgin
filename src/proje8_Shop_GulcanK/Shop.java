package proje8_Shop_GulcanK;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {


    ArrayList<Urunler> secilenUrunler = new ArrayList<>();
    double toplamAlisVerisTutari;
    int taksit;
    LinkedHashMap<LocalDate, Double> taksitler = new LinkedHashMap<>();


    void menu() {
        int i = 0;
        for (Urunler urun : Urunler.values())
            System.out.println(++i + "\t" + urun.toString());
    }

    ArrayList<Urunler> urunSec(Shop gs) {
        boolean secimTamamMi = false;
        String secim = "";
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Almak istediginiz urunlerin numarasini giriniz, Birden fazla urun secebilirsiniz. \nNot: Secmek istedigininz urun numarasini 11 yada 23  gibi yanyana yazabilirisiniz. ");
            System.out.print("Secimleriniz : ");
            secim = sc.nextLine();
            secim = secim.replaceAll("[^12345]", "");
            if (urunSecimKontrolu(secim)) {
                secimTamamMi= true;
            }
        } while (!secimTamamMi);
        return urunlerArrayList(secim);
    }

    ArrayList<Urunler> urunlerArrayList(String str) {
        String[] strArr = str.split("");
        ArrayList<Urunler> urunler = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++)
            urunler.add(Urunler.values()[Integer.parseInt(strArr[i]) - 1]);

        return urunler;
    }


    int taksitBelirle() {
        boolean secimTamam = false;
        String secim = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("odemeniz Gereken Toplam Tutar : "+ toplamAlisVerisTutari);
            System.out.print("Kac Taksit Yapilsin : ");
            secim = sc.nextLine();
            if (urunSecimKontrolu(secim)) {
                secimTamam = true;
            }
        } while (!secimTamam);
        return Integer.parseInt(secim);
    }

    void taksitlendir() {
        LocalDate bugun = LocalDate.now();
        LocalDate ilkOdemeTarihi = LocalDate.of(bugun.getYear(), bugun.getMonth(), 1);

        int tamTaksitTutari = (int) (toplamAlisVerisTutari / taksit);
        int i = 1;
        for (; i < taksit; i++) {
            taksitler.put(ilkOdemeTarihi.plusMonths(i), (double) tamTaksitTutari);
        }
        taksitler.put(ilkOdemeTarihi.plusMonths(i), toplamAlisVerisTutari - ((i - 1) * tamTaksitTutari));
    }

    void hesaplaToplamAlisVerisTutari() {
        double fiyat = 0;
        for (Urunler urunler : secilenUrunler) {
            fiyat += urunler.getUcret();
        }
        toplamAlisVerisTutari = fiyat;
    }

    void taksitleriYazdir() {
        System.out.println("Aldiginiz Ürünler : ");
        System.out.println("-------------------");
        for (Urunler urunler : secilenUrunler) {
            System.out.println(urunler.toString());
        }
        System.out.println("Toplam odenecek Miktar : " + toplamAlisVerisTutari);
        System.out.println("Tercih Edilen Taksit Miktari : " + taksit);
        System.out.println("odeme Tablosu : ");
        System.out.println("---------------");
        int i = 0;
        System.out.println( "Taksitler --- odeme Tarihi --- Fiyat");
        for (Map.Entry<LocalDate, Double> entry : taksitler.entrySet())
            System.out.println( ++i + ". taksit : " + entry.getKey() +" " + entry.getValue());

    }


    boolean urunSecimKontrolu(String s) {
        boolean ret = false;
        try {
            long i = Long.parseLong(s);
            ret = true;
        } catch (Exception e) {
            ret = false;
        }
        return ret;
    }

}



