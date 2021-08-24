package day07_ForLoop;

import java.util.Scanner;

public class HW01_PermutationCombination {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Verilen iki sayýnýn kombinasyonunu bulan kodu yazýnýz.
        Hatýrlatma C(n,r) = n! / (r!(n-r)!)
        Verilen iki sayýnýn permütasyonunu bulan kodu yazýnýz.
        Hatýrlatma P(n,r) = n! / (n-r)!
        Ekran Çýktýsý
        Birinci sayýyý giriniz: 15
        Ikinci sayýyý giriniz: 4
        Kombinasyon: 1365
        permütasyon: 32760
        Birinci sayýyý giriniz: 5
        Ikinci sayýyý giriniz: 3
        Kombinasyon: 10
        permütasyon: 60
      */
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Permütasyon ve Kombinasyon hesabý için n deðerini giriniz: ");
	    long n = scan.nextInt();

	    System.out.print("Permütasyon ve Kombinasyon hesabý için r deðerini giriniz: ");
	    long r = scan.nextInt();
	    
	    
	    if (combination(n,r)==0&& permutation(n,r)==0) {
			System.out.println("Seçim sayýsý(n) eleman sayýsýna(r) eþit veya eleman sayýsýndan(r) büyük olmalýdýr. (n>=r)");
		}else {
			System.out.println("kombinayon : "+combination(n,r));
		    System.out.println("permütasyon : "+permutation(n,r));
		}
	    scan.close();
	    
	        }
	
	public static long factorial (long n) {
	    long factor=1;
	    for (int i = 1; i <= n; i++) {
			factor*=i;
		}
	    return factor;
	}
	
	 public static long combination (long n,long r) {
		if (n>0 && r>0 && n>=r ) {
			return factorial (n) / (factorial (r)*(factorial (n-r)));
		}else if(n==0&&r==0) {
			return 1;
		}else {
			return 0;
		}
		 
		 
	 } 
	 
	 public static long permutation (long n,long r) {
			if (n>0 && r>0 && n>=r ) {
				return factorial (n) / (factorial (n-r));
			}else if(n==0&&r==0) {
				return 1;
			}else {
				return 0;
			}
			 
			 
		 }  

}
