package day11_Encapsulated;

import java.util.Scanner;

public class MainBMI {

	public static void main(String[] args) {
		/*
	      1 ) BMI ve MainBMI class'ları creat ediniz
	      2 ) BMI class'ı için field'ları name(String), age(int), weight(double) ve height(double) olan veriable'lar oluşturup tüm veriableleri encapsule ediniz.
	      3 ) tüm  field'ları setter getter ve  constructor creat ediniz.
	      4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
	      5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
	)     6 ) MainBMI de  bu değereli yazdırınız.
	        */
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lutfen isminizi giriniz ==> ");
		String name = scan.nextLine();
		System.out.print("Lutfen yasinizi giriniz ==> ");
		int age = scan.nextInt();
		System.out.print("Lutfen kilonuzu giriniz ==> ");
		double weight = scan.nextDouble();
		System.out.print("Lutfen boyunuzu metre cinsinden giriniz ==> ");
		double height = scan.nextDouble();
		

		BMI person = new BMI(name, age, weight, height);
		System.out.println(person.getName());
		System.out.println(person.bmiHesapla());
	
		person.bmiDurumu();
		

	}

	

}
