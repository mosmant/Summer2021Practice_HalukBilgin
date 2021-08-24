package day11_Encapsulated;

public class BMI {
	private String name;
	private int age;
	private double weight, height;
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double bmiHesapla() {

		double bmi =  weight/(height*height);
		
		return bmi;
	}
	
	public void bmiDurumu() {
     
      double bmi2 = bmiHesapla();
      if(bmi2 >= 0 && bmi2 < 18.5) {
			System.out.println("Sayin "+ name +" girdiginiz bilgilere gore 'zayifsiniz'");
		}else if (bmi2 >= 18.5 && bmi2 < 25) {
 			System.out.println("Sayin "+ name +" girdiginiz bilgilere gore 'ideal kilodasiniz'");
		}else if (bmi2 >= 25 && bmi2 < 30) {
 			System.out.println("Sayin "+ name +" girdiginiz bilgilere gore 'sismansiniz'");
		}else if (bmi2 >= 30) {
 			System.out.println("Sayin "+ name +" girdiginiz bilgilere gore 'obezsiniz'");
		}else {
			System.out.println("Lütfen gecerli degerler giriniz !");
		}
	}
	
	
}
