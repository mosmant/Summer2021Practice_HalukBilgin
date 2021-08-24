package day07_ForLoop;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		    /*Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduðunu,
		    deðilse sessiz harf olduðunu ekrana yazdýrsýn. Girdiði deðer harf deðilse yada
		            1 karakterden fazla ise hata mesajý göstersin. (Test girilen harfi büyük yada küçüklüðüne duyarlýdýr.)
		    Sesli harfler: a,e,i,o,u
		    Test Data:
		    a
		    Beklenen Çýktý:
		    a harfi sesli harfdir.
		    Test Data:
		    d
		    Beklenen Çýktý:
		    d harfi sesiz harftir.
		    Test Data:
		    we  yada %
		    Beklenen Çýktý:
		    Yanlis karakter girdiniz!
		     */
		    

		        Scanner scan = new Scanner(System.in);

		        System.out.print("harf giriniz: ");
		        String kelime = scan.nextLine();

		        String sesliHarf = "aeuoiAEUOI";
		        if (kelime.length()==1) {


		            for (int i = 0; i <= sesliHarf.length(); i++) {
		                if (kelime.charAt(0) == sesliHarf.charAt(i)) {
		                    System.out.println("sesli");
		                    break;
		                } else {
		                    System.out.println("sessiz");
		                    break;
		                }
		            }
		        }else System.out.println("Yanlis karakter girdiniz!!!");

	}}


