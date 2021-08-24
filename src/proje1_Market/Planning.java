package proje1_Market;

public class Planning {
	/* Basrili Market alýþ-veriþ programý.
    *
    * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
    *          No     Ürün         Fiyat
              ====  =======        =========
               00   Domates         2.10 TL
               01   Patates         3.20 TL
               02   Biber           1.50 TL
               03   Soðan           2.30 TL
               04   Havuç           3.10 TL
               05   Elma            1.20 TL
               06   Muz             1.90 TL
               07   Çilek           6.10 TL
               08   Kavun           4.30 TL
               09   Üzüm            2.70 TL
               10   Limon           0.50 TL
    * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
    * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
    * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
    * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
    * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
    * 7. Eðer bitirmek istiyorsa ödeme kýsmýna geçiniz ve ödem sonrasýnda programý bitirinzi.
    */
	 
	/*
    1) Ürünler (String) ve ürün fiyatlari(double) için ayri ayri list oluþturulmali.
    list ler class levelde omali cunku: main metod harici diger metodlarda kullanýlacak
    Listenen urunleri bir method() ile kullanýcýya gösterilmeli  yazdiran bir method olmali
     bu method bir cikti vermeyecegi ve sadece println calisagi icin return type void prmtsiz olmali.
    method --> public static void urunListele(){for, println(i+urun+fiyat)} oluþturacaðýmýz method deðiþmesin o yüzden static olmalý 
    URUNULÝSTELE
    2) 
    scanner class'indan obj creat edilmeli. urunListele() method call edilerek kullanýcý ekranýna 
    urun listesi gösterilmeli.kullanýcýdan urun kodu ve urun miktari istenmeli(println)
    int urunNo= kullanicinin girdigi urun kodu atanmali 
    double kg= kullanicinin girdigi urun miktari kg atanmali 
    SEPETE URUN EKLE
    3)musteri için alisveris sepeti olusturulmali. sepetUrunler list(String) sepetKg list(double)
    sepetFiyat list(double) 
    public static void sepeteEkle(int urunKodu, double kg){sepetFiyat=urunFiyati*kg__list(double)}
    
    her sepet alisverisinden sonra olusan sepet fiyatini toplLAYAN BÝR PRÝMÝTÝVE (double) toplamFiyat olusturlmali
  	toplamFiyat+=sepetFiyati  
  
  	4) sepete eklenen urunler miktari toplamFiyati vs sepetin son durumunu hesaplatip yazdirilimali ki 
  	kullanýcý devem etmeyeceiðni sorabilelim.
   	public static double(toplamFiyat) sepetYazdir(){println(urunler+ fiyat+kg)}
   
   	5) kullanýcýya alisverise devam edip etmecegi sorulmali.kullanici cevabi:boolean(true/false) String(e/h) int (1/0)) 
   	cevap verisine gore islem akisi icin  if kontrolu olmali--> cevap vet ise tum ýslemler bastan tekrar edilmeli
   	do-While(cevap)--cevap evet ise "do" hayýrsa alisveris bitirilmeli odeme talep edilmeli.
   
   	6) public static void odeme(println(double toplamFiyat){println()}
   
   
   
     */
	

}
