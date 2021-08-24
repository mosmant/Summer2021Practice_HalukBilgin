package day01_variables;

public class Q01 {
		
	 /*
	  \n (or \r): starts from a new line : metni bir alt satýrdan itibaren yazdýrýr.
	          \t:  horizontal tab : metni yatayda 1 tab miktarý kaydýrýr.
	          \\: prints a back slash :\ (ters slash) yazdýrýr
	          \': prints single quote :' tek týrnak yazdýrýr.
	          \": prints double quote :"" Çift týrnak yazdýrýr.
	 */ 
	
	

	public static void main(String[] args) {
			//  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdýrýnýz

			System.out.println("   \"Hello \" , \"World \\ / \"    ");
			// Soru-2 : Pazartesi kelimesini her harfini ayrý bir satira gelecek sekilde yazdýrýnýz.

			System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
			//Soru-3 : "Java" ile hayat cok 'afilli'   yazdýrýnýz
			System.out.println("\"Java\" ile hayat cok \'afilli\'");

			//Soru-4 : "Basari" gayrete
			// 'asiktir'  yazdýrýnýz sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satýr sonra ve satýr basýndan 1 tab ilerideyazýlsýn.
			
			System.out.print("\"Basari\" gayrete \n");
			System.out.println("\'asiktir\'\n\n\n");

			//System.out.println("\n\n\n");
			
			System.out.println("\tTechProEd ile java cok kolay ...");

	}

}
