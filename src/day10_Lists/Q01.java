package day10_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /*
		 * Input olarak verilen listteki isimlerden icinde "a" harfi bulunanlari
		 * silen bir program yaziniz
		 *
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} OUTPUT : [Veli,Omer]
		 */


        List<String> list1 = new ArrayList<>();
        // ***  bu zamana kadar elemanlarý yalnýzca add methodu ile yazdýrýyorduk. þimdi asList methodu ile yazdýrabiliriz.
        // List<String> list3 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");

        List<String> list2 = new ArrayList<>();

        for (String w : list1) {

            if (w.toLowerCase().contains("a")) {
                continue;   // "a" içeriyorsa buna biþey yapma atla geç diyor listeye eklemeden geçecek. 
                			// continue listeye ekleme kýsýmýný es geçmemize yaradý.
            }else list2.add(w);
        }
        System.out.println(list2);
    }


}
