package day10_Lists;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {
    public static void main(String[] args) {
        List<Integer> asalSayilar = new ArrayList<>();
        int sayi = 2;
        int sayac = 0;
        while(sayi<100){

            for (int i = 2; i <=sayi; i++) {

                if(sayi%i==0){
                    sayac++;
                }
            }

            if (sayac==1) {
                asalSayilar.add(sayi);
                System.out.println(sayi);
            }

            sayi++;
            sayac=0;
        }
        System.out.println(asalSayilar);
        System.out.println("100'e kadar olan asal sayilar ");
    }
}
