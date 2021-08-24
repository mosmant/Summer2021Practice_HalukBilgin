package day07_ForLoop;

public class Q15 {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        þeklini yazdýrýnýz.  65=A'nýn ascýý deðeri
        */
   
        int harf=65;
        for (int satir = 0; satir <6 ; satir++) { //satýr kontrolu

            for (int sutun = 0; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char) (harf+sutun)+" ");
            }
            System.out.println();
        }

	}

}
