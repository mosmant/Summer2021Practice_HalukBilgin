package day11_Encapsulated;

import java.util.Scanner;

public class StudentMain {

	public StudentMain(String name, int age) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/* TODO
	    Burada iki adet class vardır. Biri Main, diğeri ise student ,
	    student classı içinde;
	    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
	    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
	todo  Main classın içinde;
	    Örnek:
	    age 12'dir.
	    name Steven'dır.
	todo  name(isim) olarak;
	    "Student name is Steven"
	    ve
	    age(yaş) olarak da;
	    "He is 12 years old"
	 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Isminizi giriniz --> ");
		String name = scan.nextLine();
		System.out.println("Sayin "+name+" Yasinizi giriniz --> ");
		int age = scan.nextInt();
		//Student developer = new Student(name, age);
		Student developer = new Student();
		developer.setName(name);
		developer.setAge(age);
		

		System.out.println("Sirketimize hos geldiniz sayin "+ developer.getName()+"\n"+developer.getAge()+" Yasinda olmaniz bizi etkiledi !");
	}

}
