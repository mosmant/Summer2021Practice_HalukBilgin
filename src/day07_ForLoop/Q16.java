package day07_ForLoop;

public class Q16 {

	public static void main(String[] args) {
		/*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        þekli yazdýrýnýz
        */

        int harf = 65;
        for (int satir = 0; satir < 6; satir++) { //satýr kontrolu

            for (int sutun = 0; sutun <= satir; sutun++) {//sutun kontrolu
                System.out.print((char) (harf + satir) + " ");
            }
            System.out.println();

	}

}}
