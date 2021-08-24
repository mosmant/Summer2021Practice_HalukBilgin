package day07_ForLoop;



public class Q05 {

	public static void main(String[] args) {
		// 5x5 kare þeklinde # den nested for loop kullanarak yazdýrýnýz.
		
		for (int i = 1; i <= 5; i++) {		// satýr no oluþturma
			
			for (int j = 1; j <=5; j++) {   // satýrlarý doldurma
				System.out.print("#");		// # iþareti bastýrma		
			}
			System.out.println("");			
		}

	}

}
