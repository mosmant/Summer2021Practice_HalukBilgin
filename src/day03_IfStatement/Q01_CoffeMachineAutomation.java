package day03_IfStatement;

import java.util.Scanner;

public class Q01_CoffeMachineAutomation {

	public static void main(String[] args) {
		/*
		 * 1. Basit bir Kahve makinesi oluþturun. 3 çeþit kahvemiz olsun. 2. Sistem þu
		 * soruyu sorsun: "Hangi Kahveyi istersiniz?" 3.Bu soru ile birlikte kullanýcý
		 * kahve bilgilerini görsün. Örn: Hangi Kahveyi Ýstersiniz? 1.Türk kahvesi
		 * 2.Filtre Kahve 3.Espresso
		 * 
		 * String hangiKahve oluþturun ve var olan kahvelerden birini yazýnýz. (örn:
		 * Türk Kahvesi, ya da türk kahvesi. ---> Büyük- küçük harf duyarlý olmamasý
		 * için String methodu kullanýn.) todo 1. Koþul bölümü Eðer kahve Türk kahvesi
		 * ise, konsola = Türk kahvesi hazýrlanýyor. yazsýn.(Dümdüz Türk kahvesi
		 * yazmayýn. String hangiKahve'yi çaðýrýn!!) Eðer filtre kahve ise, konsola =
		 * Filtre kahve hazýrlanýyor. yazsýn. (String hangiKahve'yi kullanýn !) Eðer
		 * Espresso ise, konsola = Espresso hazýrlanýyor... yazsýn. (String
		 * hangiKahve'yi kullanýn !) Eðer yanlýþ harf girerseniz, konsola = Hatalý
		 * tuþlama yaptýnýz. yazsýn. (Hatalý tuslamadan sonra kod calýsmaya devam
		 * edecektir, o konuyu daha görmediniz bu yüzden bastan baslatýn.) todo
		 * ---------------------------------- Sistem bize þu soruyu sorsun:
		 * "Süt eklememizi ister misiniz ? (Evet veya Hayýr olarak cevaplayýnýz):    "
		 * Konsolda aynen böyle yazmalý. Parantez içi de konsolda olsun. String sut
		 * olusturun. todo 2.Koþul Bölümü eðer String sut, evet e eþitse,konsola, Süt
		 * ekleniyor... yazýsý gelsin. -- (Büyük küçük harf duyarlý olmamasý için String
		 * methodu kullanýn. Olmasý gereken ihtimaller: Evet, EVET, EvEt,EVEt vs. eðer
		 * String sut, hayýr a eþit ise, konsola , Süt eklenmiyor yazýsý gelsin. todo
		 * ---------------------------------- Sistem bize
		 * "Þeker ister misiniz ? (Evet veya hayýr cevabýný veriniz) : " þeklinde bir
		 * soru sorsun. (Büyük küçük harf duyarlýlýgý olmamasý için string method
		 * kullanýn. String seker oluþturunuz. todo 3.Koþul Bölümü todo if(){ Eðer
		 * String seker Evet e eþitse , sistem bize "Kaç þeker olsun?" sorusunu sormalý.
		 * Sorunun altýna int kacSeker oluþturunuz. Þeker sayýsýný giriniz. Ve konsola
		 * þunu yazdýrýnýz örnek: 5 þeker ekleniyor. (ipucu: Bu kodlarýn heosi if
		 * bloðunun içerisinde olacak) todo } todo else{ Eðer String þeker hayýr 'a
		 * eþitse, sistem bize "Þeker eklenmiyor" cevabýný versin. ONEMLÝ !! = bir int
		 * girdisinden sonra String girdisi yapacaksak,araya boþ bir nextLine koymamýz
		 * gerekiyor. (String bosKod = sc.nextLine(); ) dummy kod ekleyiniz. Sistem bize
		 * "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :
		 * sorusunu sorsun. (büyük küçük harf duyarlýlýgý olmamalý. yani kullanýcý büyük
		 * boy veya BüYüK Boy girdiginde kabul etmeli. String boyut oluþturun... todo
		 * 4.Koþul Bölümü eðer String boyut Büyük boy' a eþitse = Kahveniz büyük boy
		 * hazýrlanýyor. (Büyük boy kýsmýný String boyut'u kullanarak yazalým=
		 * "Kahveniz" + boyut + "hazýrlanýyor.") Eðer String boyut Orta Boy'a eþitse =
		 * Kahveniz orta boy hazýrlanýyor.. ("Kahveniz" + boyut + "hazýrlanýyor.) Eðer
		 * String boyut Küçük boy'a eþitse = Kahveniz küçük boy hazýrlanýyor. yazsýn.
		 * ("Kahveniz" + boyut + "hazýrlanýyor.) //todo SONUÇ BÖLÜMÜ Sipariþlerimizi
		 * verdik. Son hali görmek istiyoruz. konsola þunu yazdýrýn örnek : Türk Kahvesi
		 * orta boy hazýrdýr. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi
		 * kullanýn. orta boy için de String boyut ' u kullanýn.) todo Açýklama :
		 * Projeyi bilerek biraz zor hazýrladýk. Üzerinde fazla fazla kafa yormanýz ve
		 * "grupça çalýþmanýz için" böyle düzenledik. Yapamayan arkadaþlar kesinlikle
		 * canlarýný sýkmasýn. Size çok zor gelebilir. Ancak adým adým ilerlerseniz,
		 * grup ile çözerseniz ve yazdýðým notlarý tamamen uygularsanýz
		 * halledebilirsiniz. Öðrenmediðiniz hiçbir þey yok. Sadece biraz karýþýk. Bir
		 * ödev çözümü günü yapacaðýz. Bunun haberini ilerleyen günlerde size vereceðim.
		 * Ancak arkadaþlarýnýzla beraber Voice Channel larda ödev üzerine
		 * tartýþabilirsiniz. HERKESE KOLAY GELSÝN !! :)
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("*********KAHVE MAKINESI********");
		System.out.println("----Menude Bulunan Kahveler----");
		System.out.println("1.Türk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso");

		System.out.print("Hangi kahveyi istersiniz : ");
		String hangiKahve = scanner.nextLine();

		if (hangiKahve.equalsIgnoreCase("Türk Kahvesi")) {
			System.out.println("Türk kahvesi hazýrlanýyor...");
		} else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
			System.out.println("Filtre kahve hazýrlanýyor...");
		} else if (hangiKahve.equalsIgnoreCase("Espresso")) {
			System.out.println("Espresso hazýrlanýyor...");
		} else {
			System.out.println("Hatalý tuþlama yaptýnýz.Tekrar deneyiniz...");
		}

		System.out.print("\nSüt eklememizi ister misiniz? (Evet yada Hayýr olarak cevaplayýnýz) : ");
		String sut = scanner.nextLine();

		if (sut.equalsIgnoreCase("Evet")) {
			System.out.println("Süt ekleniyor...");
		} else if (sut.equalsIgnoreCase("Hayýr")) {
			System.out.println("Sut eklenmiyor...");
		} else {
			System.out.println("Hatali islem yaptiniz...");
		}

		System.out.print("\nSeker ister misiniz? (Evet yada Hayýr) : ");
		String seker = scanner.nextLine();

		if (seker.equalsIgnoreCase("Evet")) {
			System.out.print("Kaç seker olsun: ");
			int kacSeker = scanner.nextInt();
			scanner.nextLine();
			System.out.println(kacSeker + " seker ekleniyor");
		} else if (seker.equalsIgnoreCase("Hayýr")) {
			System.out.println("Þeker eklenmiyor ");
		} else {
			System.out.println("Hatalý giris yaptýnýz. Tekrar deneyiniz...");
		}

		System.out.print("\nHangi boyutta olsun (Buyuk Boy-Orta Boy-Kucuk Boy) : ");
		String boyut = scanner.nextLine();

		if (boyut.equalsIgnoreCase("Buyuk Boy")) {
			System.out.println("Kahveniz " + boyut + " hazýrlanýyor");
		} else if (boyut.equalsIgnoreCase("Orta Boy")) {
			System.out.println("Kahveniz " + boyut + " hazýrlanýyor");
		} else if (boyut.equalsIgnoreCase("Kucuk Boy")) {
			System.out.println("Kahveniz " + boyut + " hazýrlanýyor");
		} else {
			System.out.println("Hatalý gýrýs yaptýnýz. Tekrar deneyiniz...");
		}

		System.out.println("\n" + hangiKahve + " " + boyut + " hazirdir.Afiyet olsun !!!");
		scanner.close();
	}

}
