package day05_StringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		/*
	     * Bakıye öğrenme para çekme yatırma ve çıkış işlemlerinin olduğu bir bankamatik pr kodlayınız
	     */
	    
	         System.out.println("*****************************");
	         System.out.println("JAVA BANK ATM'ye Hoşgeldiniz...");
	         
	         System.out.println("1. islem : bakıye sorma\n2. islem : para cekme\n3.islem : para yatirma\n4. islem : cıkıs");
	         
	         int bakıye =5000;
	         
	         Scanner scanner=new Scanner(System.in);
	         System.out.print("lutfen yapacaginiz islemi seciniz: ");
	         int secim=scanner.nextInt();
	         
	         switch (secim) {
	        case 1: {
	            System.out.println("bakıyeniz: " +bakıye);
	            
	            break;
	        }
	        case 2: {
	            System.out.print("cekeceginiz miktarı giriniz : " );
	            int cekilenMiktar=scanner.nextInt();
	            if (cekilenMiktar>bakıye) {
	                System.out.println("bakıyeniz yeterli degil");
	                
	            }else {
	                bakıye-=cekilenMiktar;//bakıyeden cekilenMiktarı çıkardık
	                System.out.println("yeni bakıyeniz :"+bakıye);
	            }
	            break;
	        }
	        case 3: {
	            System.out.print("yatıracaginiz miktari giriniz: " );
	            int yatirilanmiktar=scanner.nextInt();
	            bakıye+=yatirilanmiktar; //bakıyeye yatirilanmiktar ekledik
	            System.out.println("yeni bakıyeniz :"+bakıye);
	            break;
	        }
	        case 4: {
	            System.out.println("islemden cikisiniz yapılıyor: " );
	            
	            break;
	        }
	        default:

	}scanner.close();
	}
}

