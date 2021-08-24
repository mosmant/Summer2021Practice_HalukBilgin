package day03_IfStatement;

import java.util.Scanner;

public class Q14_FlightProgramme {

	
	
	    public static void main(String[] args) {

	        Scanner scan = new Scanner (System.in);

	        System.out.print("Java airlines'a hosgeldiniz !\n(B | C | D) \nLutfen ucmak istediginiz sehri giriniz :");
	        String city = scan.next().toLowerCase();

	        System.out.print("Ucusunuzun  \nTek yon icin '0' cift yon icin '1' i tuslayiniz");
	        int flightType = scan.nextInt();

	        System.out.print("Lutfen yasinizi giriniz : ");
	        int age = scan.nextInt();




	        double priceB = 0.10 * 500;
	        double priceC = 0.10 * 700;
	        double priceD = 0.10 * 900;
	        if (city.equals("b") || city.equals("c") || city.equals("d")) {


	            if (age > 65) {
	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceB*0.70)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceB*0.70+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.70)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC*0.70+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.70)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.70+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }
	            } else if (age >= 12 && age <= 24){




	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceB*0.90)*0.80+"$" );// bu satirda indirimi uygulamak icin 100-indirim tutarini(ornegin%20 indirimi *0.80 olarak yaptim) fiyatla carptim
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceB*0.90+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.90)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC*0.90+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.90)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.90+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }
	        }
	            } else if(age>0 && age <12) {

	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.50)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.50+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");}


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.50)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC*0.50+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.50)*0.80+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD*0.50+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }
	            } else if (age > 0 ){

	                if (city.equals("b")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.80)+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");}


	                }if (city.equals("c")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceC*0.80)+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceC+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    }


	                }if (city.equals("d")) {
	                    if (flightType == 1) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + (priceD*0.80)+"$" );
	                    } else if (flightType == 0) {
	                        System.out.println("***************************************************");
	                        System.out.println("Girdiginiz bilgilere gore biletinizin tutari : " + priceD+"$");
	                    } else if (flightType != 0 && flightType != 1){
	                        System.out.println("Lutfen bilgileri dogru giriniz \nUcus turunuzu 0 veya 1 olarak girmelisiniz !");
	                    } else {
	                        System.out.println("Lutfen gecerli bir istikamet seciniz !! \n( B | C | D)");
	                    }


	                }

	            }else if(age<=0){

	                System.out.println("***************************************************");

	                System.out.println("Lutfen gecerli bir yas giriniz !! \n(Bebekler ucusumuza kabul edilmez)");
	}
	        
}}}
