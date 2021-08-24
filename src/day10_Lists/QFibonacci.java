package day10_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir tamsayı giriniz : ");
        int num = scan.nextInt();

        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        System.out.println(fibo);
        /*
        for (int i = 0; fibo.get(i - 2) + fibo.get(i - 1) < num; i++) {
            fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
        }
        System.out.println(fibo);
        */
        int i = 2;
        int newNum = 0;
        while (newNum < num) {
            newNum = fibo.get(i - 2) + fibo.get(i - 1);
            fibo.add(newNum);
            i++;
        }
        System.out.println(fibo);
    }
}
