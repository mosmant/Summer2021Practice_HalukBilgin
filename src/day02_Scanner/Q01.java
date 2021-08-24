package day02_Scanner;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * kullanicinin ad soyad yas boy kilosunu yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);

		String name, surname;

		int age, kilo;
		double boy;

		System.out.print("Adýnýzý girin: ");
		name = scan.nextLine();

		System.out.print("Soyadýnýzý girin: ");
		surname = scan.nextLine();

		System.out.print("Yaþýnýzý girin: ");
		age = scan.nextInt();

		System.out.print("Boyunuzu girin: ");
		boy = scan.nextDouble();

		System.out.print("Kilonuzu giriniz: ");
		kilo = scan.nextInt();

		System.out.println("Benim adým : " + name + "\n" + "Soyadým : " + surname + "\n" + "Yaþým : " + age + "\n"
				+ "boyum : " + boy + "\n" + "kilom : " + kilo);
		scan.close();

	}

}
