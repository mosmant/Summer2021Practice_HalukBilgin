package day07_ForLoop;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
        ama  c harfine  gelirse döngüden çýkýlsýn
        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */
        // burada c harfine kadar olan a harflerinin toplamýný bulan bir program...
		Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        
        	if (str.toLowerCase().charAt(i)=='a') {
			count++;	
			}else if (str.toLowerCase().charAt(i)=='a') {
				break;
			}
				
			}
		System.out.println("metindeki 'a' harf miktarý : "+ count);	
		scan.close();
		}

	}


