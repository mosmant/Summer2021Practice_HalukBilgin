package day11_Encapsulated;

public class HWStudent {
	
	  /*Write program as a Student class   that has instance variables name and address.
     *  Create a constructor that will initialize those variables. 
     *  Print name & address of given  student by the displayInfo method.
     */
	String name;
	String address;
	public HWStudent(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	
	public static void main(String[] args) {
		HWStudent yazilimci = new HWStudent("Faruk Efehan", "100 Winchester Cir, Los Gatos, CA 95032, Amerika Birleşik Devletleri");
		yazilimci.DisplayInfo();
	}

	public void DisplayInfo () {
		System.out.println(name + " "+ address);
	}
	
	
	
}
