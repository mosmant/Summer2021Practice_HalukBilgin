package day09_Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */
		int[] arr = { 5, 7, -6, 4, 2, 15, 3, 8, 1 };
		int istenenToplam = 9;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==9) {
					System.out.println("("+arr[i]+")"+" ile "+"("+arr[j]+")"+" toplamý = "+ istenenToplam);
				}
			}
			
		}
		
	}

}
