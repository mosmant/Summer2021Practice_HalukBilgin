package day05_StringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		/*
	     * bakiye ��renme para �ekme yat�rma ve ��k�� i�lemlerinin oldu�u bir bankamatik pr kodlay�n�z
	     */
	    
	         System.out.println("*****************************");
	         System.out.println("JAVA BANK ATM'ye Ho�geldiniz...");
	         
	         System.out.println("1. islem : bak�ye sorma\n2. islem : para cekme\n3.islem : para yatirma\n4. islem : c�k�s");
	         
	         int bakiye=5000;
	         
	         Scanner scanner=new Scanner(System.in);
	         System.out.print("lutfen yapacaginiz islemi seciniz: ");
	         int secim=scanner.nextInt();
	         
	         switch (secim) {
	        case 1: {
	            System.out.println("bak�yeniz: " +bakiye);
	            
	            break;
	        }
	        case 2: {
	            System.out.print("cekeceginiz miktar� giriniz : " );
	            int cekilenMiktar=scanner.nextInt();
	            if (cekilenMiktar>bakiye) {
	                System.out.println("bak�yeniz yeterli degil");
	                
	            }else {
					bakiye-=cekilenMiktar;//bak�yeden cekilenMiktar� ��kard�k
	                System.out.println("yeni bak�yeniz :"+bakiye);
	            }
	            break;
	        }
	        case 3: {
	            System.out.print("yat�racaginiz miktari giriniz: " );
	            int yatirilanmiktar=scanner.nextInt();
				bakiye+=yatirilanmiktar; //bak�yeye yatirilanmiktar ekledik
	            System.out.println("yeni bak�yeniz :"+bakiye);
	            break;
	        }
	        case 4: {
	            System.out.println("islemden cikisiniz yap�l�yor: " );
	            
	            break;
	        }
	        default:

	}scanner.close();
	}
}

