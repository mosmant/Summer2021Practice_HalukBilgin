package day10_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar=new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        String devamMi;

        do{
            System.out.print("Not = ");
            int ogrNot= scan.nextInt();
            notlar.add(ogrNot);

            System.out.print("Devam (E/H)");
            devamMi=scan.next();

        }while (devamMi.equalsIgnoreCase("E"));

        // ortalama bulunuyor
        int toplam=0;
        for(int i=0;i< notlar.size();i++)
        {
            toplam+=notlar.get(i);
        }

        int ort = toplam / notlar.size();

        //ortalamayı geçenlerin sayısını bulalım
        int ortGecenSayisi=0;
        for(int i=0;i< notlar.size();i++)
        {
            if ( notlar.get(i) > ort)
                  ortGecenSayisi++;
        }

        System.out.println("ort = " + ort);
        System.out.println("ortGecenSayisi = " + ortGecenSayisi);

    }
}
