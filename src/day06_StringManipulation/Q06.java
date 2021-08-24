package day06_StringManipulation;

public class Q06 {

	public static void main(String[] args) {
		// String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// yukarýdaki string deðiþkeni kullanarak konsolda A L i yazdýrýnýz.
		
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char a = pickName.charAt(pickName.indexOf("A")); // burada A karakterini index deðerini buluyoruz.bu deðer int olduðu için charat() içinde kullanýyoruz
		char l = pickName.charAt(pickName.indexOf("L"));
		char i = pickName.toLowerCase().charAt(pickName.indexOf("I"));
		System.out.println("" + a + " " + l + " " + i);

	}

}
