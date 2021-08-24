package day10_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.

        Scanner sc=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i=0; i< dizi.length; i++){
            System.out.print("Sayi giriniz = ");
            dizi[i]= sc.nextInt();
        }

        System.out.println(tekElemanlar(dizi));
    }

    public static ArrayList<Integer> tekElemanlar(int[] sayi)
    {
        ArrayList<Integer> liste=new ArrayList<>();

        for (int i=0; i< sayi.length; i++){
            if(sayi[i]%2==1){
                liste.add(sayi[i]);
            }
        }

        return liste;
    }


}
